package com.imooc.wxsell.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Data
@Component
@ConfigurationProperties(prefix = "myconfig")
public class Myconfig {

    private String name;

    private Integer age;

    private String desc;
}
