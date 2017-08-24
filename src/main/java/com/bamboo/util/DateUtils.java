/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author luotao
 */
public class DateUtils {

    private static final SimpleDateFormat dataFormate1 = new SimpleDateFormat("yyyyMMddHHmmss");
    private static final SimpleDateFormat dataFormate2 = new SimpleDateFormat("yyyyMMdd");

    public static String getDateTime() {
        return dataFormate1.format(new Date());
    }

    public static String getDate() {
        return dataFormate2.format(new Date());
    }

    public static long getTimestamp() {
        return System.currentTimeMillis();
    }
}
