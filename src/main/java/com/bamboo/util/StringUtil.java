/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.util;

/**
 *
 * @author luotao
 */
public class StringUtil {

    /**
     * 判断字符是否为空字符串，包括null对象和纯空格字符。
     *
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }

    /**
     * 字符串剔除前后空格，如果字符串是null，则返回null。
     *
     * @param str
     * @return
     */
    public static String trim(String str) {
        return (str == null || str.trim().length() == 0) ? null : str;
    }
}
