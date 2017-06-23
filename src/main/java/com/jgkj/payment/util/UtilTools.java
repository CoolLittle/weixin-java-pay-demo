package com.jgkj.payment.util;

import java.util.UUID;

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

        String randomNumStr = String.valueOf((int)(Math.random() * 1000000));

        return System.currentTimeMillis() + "_" + nanoTime + randomNumStr;
    }

    //生成数据库中的id
    public static String generateId() {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        long currentTime = System.currentTimeMillis();
        return currentTime + "_" + uuid;
    }
}
