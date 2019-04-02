package com.winnie.common.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author : winnie
 * @date : 2019/4/2
 * @desc
 */
@Data
@ApiModel(value = "BasePageResult",description = "通用分页返回参数")
public class BasePageResult<T> {
    @ApiModelProperty(value = "分页参数")
    private BasePageData pageData;

    @ApiModelProperty(value = "查询返回参数")
    private T data;
}
