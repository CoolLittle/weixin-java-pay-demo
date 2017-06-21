package com.github.binarywang.demo.wxpay.util;

/**
 * Created by chen on 2017/6/21.
 */
public class UtilTools {
    //生成订单id
    public static String generateOrderId() {
        long nanoTime = System.nanoTime();
        if (nanoTime > 999999) {
            nanoTime = nanoTime - nanoTime /1000000 * 1000000;
        }
        return System.currentTimeMillis() + "_" + nanoTime;
    }
}
