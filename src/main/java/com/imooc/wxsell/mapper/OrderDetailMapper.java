package com.imooc.wxsell.mapper;

import com.imooc.wxsell.config.MyMapper;
import com.imooc.wxsell.dataobject.OrderDetail;
import org.apache.ibatis.annotations.*;

@Mapper
public interface OrderDetailMapper extends MyMapper<OrderDetail> {

//
//
//    @Select("select * from order_detail")
//    @Results({
//            @Result(column = "order_id", property = "orderId"),
//            @Result(column = "buyer_name", property = "buyerName"),
//            @Result(column = "buyer_phone", property = "buyerPhone"),
//            @Result(column = "buyer_address", property = "buyerAddress"),
//            @Result(column = "buyer_openid", property = "buyerOpenid"),
//            @Result(column = "order_amount", property = "orderAmount"),
//            @Result(column = "order_status", property = "orderStatus"),
//            @Result(column = "pay_status", property = "payStatus"),
//            @Result(column = "create_time", jdbcType = JdbcType.TIMESTAMP, property = "createTime", javaType=Date.class),
//            @Result(column = "update_time", jdbcType = JdbcType.TIMESTAMP, property = "updateTime", javaType=Date.class)
//    })
//    List<OrderDetail> findAll();
//
//    @Insert("insert into order_detail(order_id,buyer_name,buyer_phone,buyer_address,buyer_openid,order_amount,order_status,pay_status)" +
//            "values(#{orderId},#{buyerName},#{buyerPhone},#{buyerAddress},#{buyerOpenid},#{orderAmount},#{orderStatus},#{payStatus})")
//    int save(OrderDetail detail);
//
//    @Delete("delete from order_detail where order_id = #{orderId}")
//    void delete(String orderId);


}
