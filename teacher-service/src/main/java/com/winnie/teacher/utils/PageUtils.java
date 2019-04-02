package com.winnie.teacher.utils;

import com.github.pagehelper.Page;
import com.winnie.common.dto.BasePageData;
import com.winnie.common.dto.BasePageResult;

/**
 * @author : winnie
 * @date : 2019/4/2
 * @desc
 */
public class PageUtils {
    public static <T> BasePageResult<T> genPageResult(T list, Page page) {
        BasePageResult<T> result = new BasePageResult<>();

        BasePageData pageData = new BasePageData();
        pageData.setPageSize(page.getPageNum());
        pageData.setPageSize(page.getPageSize());
        pageData.setTotal((int) page.getTotal());
        pageData.setOrderRule(page.getOrderBy());
        pageData.setOrderFiled(page.getOrderBy());
        pageData.setStart(page.getStartRow());
        pageData.setEnd(page.getEndRow());

        result.setPageData(pageData);
        result.setData(list);
        return result;
    }
}
