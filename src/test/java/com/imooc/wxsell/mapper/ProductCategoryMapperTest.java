package com.imooc.wxsell.mapper;

import com.imooc.wxsell.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryMapperTest {

    @Autowired
    private ProductCategoryMapper mapper;

    @Test
    public void testSelectAll(){
//        String categoryTypes = "11,2,10";
//        String categoryTypes = "'11','2','10'";
        List<Integer> categoryTypes = new ArrayList<>();
        categoryTypes.add(11);
        categoryTypes.add(2);
        categoryTypes.add(10);
        List<ProductCategory> categories = mapper.findByCategoryTypeIn(categoryTypes);
        for (ProductCategory category : categories) {
            System.out.println(category.toString());
        }
    }
}