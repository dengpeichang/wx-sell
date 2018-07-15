package com.imooc.wxsell.repository;

import com.imooc.wxsell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOne(){
        ProductCategory productCategory = repository.findOne(1);
        System.out.println(productCategory.toString());
    }

    @Test
    public void save(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("老年人最爱");
        productCategory.setCategoryType(7);
//        Assert.assertNotNull(productCategory);
        repository.save(productCategory);
    }

    @Test
    public void update(){
        ProductCategory productCategory = repository.findOne(5);
        productCategory.setCategoryType(11);
        repository.save(productCategory);
    }

    @Test
    public void findByCategoryType(){
        List<Integer> list = Arrays.asList(2,11);
        List<ProductCategory> productCategories = repository.findByCategoryTypeIn(list);
        System.out.println(productCategories.toString());
    }


}