package com.imooc.wxsell.mapper;

import com.imooc.wxsell.config.MyMapper;
import com.imooc.wxsell.dataobject.ProductInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import java.util.Date;
import java.util.List;

@Mapper
public interface ProductInfoMapper extends MyMapper<ProductInfo> {

    @Select("select * from product_info where product_status = #{status}")
    @Results({
            @Result(column = "product_id", property = "productId"),
            @Result(column = "product_name", property = "productName"),
            @Result(column = "product_price", property = "productPrice"),
            @Result(column = "product_stock", property = "productStock"),
            @Result(column = "product_description", property = "productDescription"),
            @Result(column = "product_icon", property = "productIcon"),
            @Result(column = "product_status", property = "productStatus"),
            @Result(column = "category_type", property = "categoryType"),
            @Result(column = "create_time", jdbcType = JdbcType.TIMESTAMP, property = "createTime", javaType=Date.class),
            @Result(column = "update_time", jdbcType = JdbcType.TIMESTAMP, property = "updateTime", javaType=Date.class)
    })
    List<ProductInfo>findByProductStatus(Integer status);

}
