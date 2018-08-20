package com.imooc.wxsell.mapper;


import com.imooc.wxsell.dataobject.OrderMaster;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterMapperTest {

    @Autowired
    private OrderMasterMapper mapper;

    private final String OPENID = "110110";

    @Test
    public void test(){
        OrderMaster orderMaster = new OrderMaster();
        //orderMaster.setOrderId("1234567");
        orderMaster.setBuyerName("师兄");
        orderMaster.setBuyerPhone("123456789123");
        orderMaster.setBuyerAddress("幕课网");
        orderMaster.setBuyerOpenid(OPENID);
        orderMaster.setOrderAmount(new BigDecimal(2.5));
        mapper.insert(orderMaster);
    }
}