package com.imooc.wxsell.mapper;

import com.imooc.wxsell.config.MyMapper;
import com.imooc.wxsell.dataobject.SellerInfo;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.Date;
import java.util.List;

@Mapper
public interface SellerInfoMapper extends MyMapper<SellerInfo> {

//    @Select("select * from seller_info")
//    @Results({
//            @Result(column = "id", property = "id"),
//            @Result(column = "username", property = "username"),
//            @Result(column = "password", property = "password"),
//            @Result(column = "create_time", jdbcType = JdbcType.TIMESTAMP, property = "createTime", javaType=Date.class),
//            @Result(column = "update_time", jdbcType = JdbcType.TIMESTAMP, property = "updateTime", javaType=Date.class)
//    })
//    List<SellerInfo> findAll();
//
//    @Delete("delete from seller_info where id = #{id}")
//    void deleteById(String id);
//
//    @Update("update seller_info set username=#{username} ,password=#{password} where id = #{id}")
//    void updateById(SellerInfo sellerInfo);
//
//    @Insert("insert into seller_info(Id,username,password) VALUES(#{id},#{username},#{password})")
//    int insert(SellerInfo sellerInfo);

}
