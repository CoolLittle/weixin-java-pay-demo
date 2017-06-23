package com.github.binarywang.demo.wxpay;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author Binary Wang
 */
@SpringBootApplication
@MapperScan(basePackages = "com.github.binarywang.demo.wxpay.mapper")    //这句一定要加，否则扫描不出来
public class WxPayDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WxPayDemoApplication.class, args);
    }
}
