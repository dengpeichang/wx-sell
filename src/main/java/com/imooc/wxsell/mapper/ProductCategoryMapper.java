package com.imooc.wxsell.mapper;

import com.imooc.wxsell.config.MyMapper;
import com.imooc.wxsell.dataobject.ProductCategory;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.Date;
import java.util.List;

public interface ProductCategoryMapper extends MyMapper<ProductCategory> {


    @Select("select * from product_category where category_type in (${categoryTypes})")
    @Results(id = "result",value = {
            @Result(column = "category_id", property = "categoryId"),
            @Result(column = "category_name", property = "categoryName"),
            @Result(column = "category_type", property = "categoryType"),
            @Result(column = "create_time", jdbcType = JdbcType.TIMESTAMP, property = "createTime", javaType=Date.class),
            @Result(column = "update_time", jdbcType = JdbcType.TIMESTAMP, property = "updateTime", javaType=Date.class)
    })
    List<ProductCategory> findByCategoryTypeIn1(@Param("categoryTypes") String categoryTypes);


    @Select("<script>"
               + "select * from product_category where category_type in "
              + "<foreach item='item' index='index' collection='categoryTypes' open='(' separator=',' close=')'>"
                    + "#{item}"
              + "</foreach>"
           + "</script>")
    @ResultMap("result")
    List<ProductCategory> findByCategoryTypeIn(@Param("categoryTypes") List<Integer> categoryTypes);

}
