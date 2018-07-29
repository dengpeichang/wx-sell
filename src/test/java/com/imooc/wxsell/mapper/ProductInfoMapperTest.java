package com.imooc.wxsell.mapper;

import com.imooc.wxsell.dataobject.ProductInfo;
import com.imooc.wxsell.emums.ProductStatusEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoMapperTest {
    @Autowired
    private ProductInfoMapper mapper;
    @Test
    public void findByProductStatus() {
        List<ProductInfo> list = mapper.findByProductStatus(ProductStatusEnum.UP.getCode());
        for (ProductInfo info : list) {
            System.out.println("----------------"+info.toString());
        }
    }
}