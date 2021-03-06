package com.imooc.wxsell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@DynamicUpdate
@Data
public class OrderDetail {
    /**id*/
    @Id
    private String detailId;
    /**订单id*/
    private String orderId;
    /**商品id*/
    private String productId;
    /**商品名称*/
    private String productName;
    /**商品价格*/
    private String productPrice;
    /**数量*/
    private int productQuantity;
    /**小图*/
    private String productIcon;
    /**创建时间*/
    private Date createTime;
    /**修改时间*/
    private Date updateTime;








}
