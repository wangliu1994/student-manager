package com.winnie.common.dto;

import com.winnie.common.constants.Constants;

/**
 * @author : winnie
 * @date : 2019/4/1
 * @desc
 */
public enum BaseResultCode {
    BASE_SUCCESS(Constants.SUCCESS_CODE, Constants.SUCCESS_MSG),
    BASE_FIALED(Constants.FAILED_CODE, Constants.FAILED_MSG);

    private int code;
    private String message;

    BaseResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
