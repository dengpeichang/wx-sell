package com.imooc.wxsell.service.impl;

import com.imooc.wxsell.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {
    @Autowired
    private CategoryServiceImpl categoryService;
    @Test
    public void findOne() {
        ProductCategory productCategory = categoryService.findOne(1);
        System.out.println(productCategory.toString());
    }

    @Test
    public void findByCategoryTypeIn() {
        List<Integer> categoryTypes = Arrays.asList(2,11);
        List<ProductCategory> productCategories = categoryService.findByCategoryTypeIn(categoryTypes);
        for (ProductCategory productCategory : productCategories) {
            System.out.println("---------"+productCategory.toString());
        }

    }

    @Test
    public void save() {
    }

    @Test
    public void delete() {
    }
}