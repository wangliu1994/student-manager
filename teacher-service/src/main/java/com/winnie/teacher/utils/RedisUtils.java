package com.winnie.teacher.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
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
public class RedisUtils {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public String getStr(String key){
        String result = null;
        try {
            ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();
            result = operations.get(key);
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return result;
    }

    public Object getObj(String key){
        Object result = null;
        try {
            ValueOperations operations = redisTemplate.opsForValue();
            result = operations.get(key);
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return result;
    }

    public boolean setStr(String key, String value){
        boolean result = false;
        try {
            ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();
            operations.set(key, value);
            result = true;
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return result;
    }

    public boolean setStr(String key, String value, Long expireTime){
        boolean result = false;
        try {
            ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();
            operations.set(key, value);
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

    public boolean setObj(String key, Object value){
        boolean result = false;
        try {
            ValueOperations<String, Object> operations = redisTemplate.opsForValue();
            operations.set(key, value);
            result = true;
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return result;
    }

    public boolean setObj(String key, Object value, Long expireTime){
        boolean result = false;
        try {
            ValueOperations<String, Object> operations = redisTemplate.opsForValue();
            operations.set(key, value);
            // 负数过期时间则永不过期
            if (expireTime != null && expireTime > 0L) {
                redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
            }
            result = true;
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return result;
    }
}
