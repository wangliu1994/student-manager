package com.winnie.common.utils;

/**
 * @author : winnie
 * @date : 2019/4/2
 * @desc
 */
public class StringUtils {

    public boolean isEmpty(String str){
        return str == null || str.isEmpty();
    }

    /**
     * 驼峰式转下划线式的命名
     */
    public static String camelToUnderline(String param) {
        if (param == null || "".equals(param.trim())) {
            return "";
        }
        int len = param.length();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            char c = param.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.append("_");
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
