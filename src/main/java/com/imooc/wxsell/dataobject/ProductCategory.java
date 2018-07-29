package com.imooc.wxsell.dataobject;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
@Entity
@Data
public class ProductCategory {
    /**目录id*/
    @Id
    @GeneratedValue
    private Integer categoryId;
    /**目录名称*/
    private String categoryName;
    /**类目编号*/
    private Integer categoryType;
    /**创建时间*/
    private Date createTime;
    /**更新时间*/
    private Date updateTime;

}
