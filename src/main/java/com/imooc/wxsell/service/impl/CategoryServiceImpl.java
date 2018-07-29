package com.imooc.wxsell.service.impl;

import com.imooc.wxsell.dataobject.ProductCategory;
import com.imooc.wxsell.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {

    @Override
    public ProductCategory findOne(Integer id) {
        return null;
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypes) {
        return null;
    }

    @Override
    public void save(ProductCategory productCategory) {

    }

    @Override
    public void delete(Integer id) {

    }
}
