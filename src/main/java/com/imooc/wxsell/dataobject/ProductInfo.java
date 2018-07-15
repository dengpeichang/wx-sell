package com.imooc.wxsell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
@Entity
@DynamicUpdate
@Data
public class ProductInfo {
    /**目录id*/
    @Id
    private String productId;
    /**产品名称*/
    private String productName;
    /**价格*/
    private double productPrice;
    /**库存*/
    private int productStock;
    /**产品描述*/
    private String productDescription;
    /**产品图片地址url*/
    private String productIcon;
    /**产品状态*/
    private int productStatus;
    /**产品类目编号*/
    private int categoryType;
    /**创建时间*/
    private Date createTime;
    /**修改时间*/
    private Date updateTime;








}
