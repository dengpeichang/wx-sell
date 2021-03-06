package com.imooc.wxsell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@DynamicUpdate
@Data
public class SellInfo {
    @Id
    private String id;
    /**用户名*/
    private String username;
    /**密码*/
    private double password;
    /**微信openid*/
    private int openid;
    /**创建时间*/
    private Date createTime;
    /**修改时间*/
    private Date updateTime;








}
