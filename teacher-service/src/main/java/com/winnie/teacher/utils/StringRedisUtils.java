package com.winnie.teacher.utils;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author : winnie
 * @date : 2019/4/8
 * @desc
 */
@Component
@Slf4j
public class StringRedisUtils {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public <T> T get(String key, Class<T> clazz){
        T result = null;
        try {
            ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();
            String json = operations.get(key);
            result = JSON.parseObject(json, clazz);
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return result;
    }

    public <T> boolean set(String key, T value){
        boolean result = false;
        try {
            ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();
            String json = JSON.toJSONString(value);
            operations.set(key, json);
            result = true;
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return result;
    }

    public <T> boolean set(String key, T value, Long expireTime){
        boolean result = false;
        try {
            ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();
            String json = JSON.toJSONString(value);
            operations.set(key, json);
            // 负数过期时间则永不过期
            if (expireTime != null && expireTime > 0L) {
                stringRedisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
            }
            result = true;
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return result;
    }
}
