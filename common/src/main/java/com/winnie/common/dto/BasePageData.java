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
@ApiModel(value = "BasePageData",description = "分页参数")
public class BasePageData {
    @ApiModelProperty(value = "总条数")
    private int total;

    @ApiModelProperty(value = "分页大小")
    private int pageSize;

    @ApiModelProperty(value = "页码")
    private int pageNum;

    @ApiModelProperty(value = "排序字段")
    private String orderFiled;

    @ApiModelProperty(value = "排序规则")
    private String orderRule;

    @ApiModelProperty(value = "开始数目")
    private int start;

    @ApiModelProperty(value = "结束数目")
    private int end;
}
