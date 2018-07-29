package com.imooc.wxsell.repository;

import com.imooc.wxsell.dataobject.SellerInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SellerInfoRepositoryTest {
    @Autowired
    private SellInfoRepository repository;

    @Test
    public void save(){
        int n = 100;
        for (int i = 0; i < n; i++) {
            SellerInfo info = new SellerInfo();
            info.setId("123456"+i);
            info.setOpenid("fdsfeofeosfdsfsdf"+i);
            info.setUsername("dpc"+i);
            info.setPassword("xxxxxxx"+i);
            repository.save(info);
        }
    }

}