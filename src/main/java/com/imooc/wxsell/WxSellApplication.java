package com.imooc.wxsell;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "com.imooc.wxsell.mapper")
@SpringBootApplication
public class WxSellApplication {

    public static void main(String[] args) {
        SpringApplication.run(WxSellApplication.class, args);
    }
}
