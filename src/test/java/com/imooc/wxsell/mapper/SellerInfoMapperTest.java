package com.imooc.wxsell.mapper;

import com.imooc.wxsell.dataobject.SellerInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
public class SellerInfoMapperTest {
    @Autowired
    SellerInfoMapper mapper;
    @Test
    public void findAll(){
        List<SellerInfo> list = mapper.selectAll();
        for (SellerInfo sellerInfo : list) {
            System.out.println(sellerInfo.toString());
        }
    }

    @Test
    public void deleteById(){
        List<SellerInfo> list = mapper.selectAll();
        for (SellerInfo sellerInfo : list) {
            mapper.deleteByPrimaryKey(sellerInfo.getId());
        }

    }
    @Test
    public void updateById(){
        List<SellerInfo> list = mapper.selectAll();
        for (SellerInfo sellerInfo : list) {
            String oldPassword = sellerInfo.getPassword();
            sellerInfo.setPassword("00001");
            mapper.updateByPrimaryKey(sellerInfo);
        }
    }
}