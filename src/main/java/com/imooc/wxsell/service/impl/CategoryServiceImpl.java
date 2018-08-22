package com.imooc.wxsell.service.impl;

import com.imooc.wxsell.dataobject.ProductCategory;
import com.imooc.wxsell.mapper.ProductCategoryMapper;
import com.imooc.wxsell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryMapper categoryMapper;

    @Override
    public ProductCategory findOne(Integer id) {
        return  categoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypes) {
        return categoryMapper.selectByExample(categoryTypes);
    }

    @Override
    public List<ProductCategory> findAll() {
        return categoryMapper.selectAll();
    }

    @Override
    public void save(ProductCategory productCategory) {
        categoryMapper.insert(productCategory);
    }

    @Override
    public void delete(Integer id) {
        categoryMapper.deleteByPrimaryKey(id);
    }
}
