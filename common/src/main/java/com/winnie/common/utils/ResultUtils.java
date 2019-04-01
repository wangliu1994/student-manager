package com.winnie.common.utils;

import com.winnie.common.constants.Constants;
import com.winnie.common.dto.BaseResult;
import com.winnie.common.dto.BaseResultCode;

/**
 * @author : winnie
 * @date : 2019/4/1
 * @desc
 */
public class ResultUtils {
    public static BaseResult genSuccessResult() {
        BaseResult response = new BaseResult();
        response.setCode(Constants.SUCCESS_CODE);
        response.setMsg(Constants.SUCCESS_MSG);
        return response;
    }

    public static <T> BaseResult<T> genSuccessResult(T data) {
        BaseResult<T> response = new BaseResult<>();
        response.setData(data);
        response.setCode(Constants.SUCCESS_CODE);
        response.setMsg(Constants.SUCCESS_MSG);
        return response;
    }

    public static BaseResult genResult(BaseResultCode code) {
        BaseResult response = new BaseResult();
        response.setCode(code.getCode());
        response.setMsg(code.getMessage());
        return response;
    }

    public static <T> BaseResult<T> genResult(T data, BaseResultCode code) {
        BaseResult<T> response = new BaseResult<>();
        response.setData(data);
        response.setCode(code.getCode());
        response.setMsg(code.getMessage());
        return response;
    }
}
