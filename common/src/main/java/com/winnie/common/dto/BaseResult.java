package com.winnie.common.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author : winnie
 * @date : 2019/4/1
 * @desc
 */
@Data
@ApiModel(value = "BaseResult",description = "通用返回参数")
public class BaseResult<T> {
    @ApiModelProperty(value = "返回数据")
    private T data;

    @ApiModelProperty(value = "错误信息")
    private String msg;

    @ApiModelProperty(value = "错误码")
    private int code;
}
