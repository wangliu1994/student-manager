package com.winnie.common.dto;

import lombok.Data;

/**
 * @author : winnie
 * @date : 2019/4/1
 * @desc
 */
@Data
public class BaseResult<T> {
    private T data;
    private String msg;
    private int code;
}
