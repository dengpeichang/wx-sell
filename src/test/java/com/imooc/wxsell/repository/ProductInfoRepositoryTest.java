package com.imooc.wxsell.repository;


import com.imooc.wxsell.dataobject.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    ProductInfoRepository repository;
    @Test
    public void save(){
        ProductInfo info = new ProductInfo();
        info.setProductId("123457");
        info.setProductName("烧鸭饭");
        info.setProductPrice(15.00);
        info.setProductStock(100);
        info.setProductDescription("超级好吃");
        info.setProductIcon("http://www.baidu.com");
        info.setProductStatus(0);
        info.setCategoryType(5);
        repository.save(info);
    }
}