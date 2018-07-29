package com.imooc.wxsell.emums;

import lombok.Getter;

@Getter
public enum  ProductStatusEnum implements CodeEnum{

    UP(0,"在架"),
    DOWN(1,"下架")
    ;
    private Integer code;

    private String mesasge;


    ProductStatusEnum(Integer code, String mesasge) {
        this.code = code;
        this.mesasge = mesasge;
    }
}
