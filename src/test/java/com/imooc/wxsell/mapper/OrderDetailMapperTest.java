package com.imooc.wxsell.mapper;

import com.imooc.wxsell.dataobject.OrderDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailMapperTest {
    @Autowired
    private OrderDetailMapper mapper;

    @Test
    public void find(){
       List<OrderDetail> list =  mapper.selectAll();
        for (OrderDetail orderDetail : list) {
            System.out.println(orderDetail.toString());
        }
    }
    @Test
    public void insert(){
        OrderDetail detail = new OrderDetail();
    }
}