package com.imooc.wxsell.service.impl;

import com.imooc.wxsell.dataobject.ProductCategory;
import com.imooc.wxsell.repository.ProductCategoryRepository;
import com.imooc.wxsell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    ProductCategoryRepository repository;

    @Override
    public ProductCategory findOne(Integer id) {
        return repository.findOne(id);
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypes) {
        return repository.findByCategoryTypeIn(categoryTypes);
    }

    @Override
    public void save(ProductCategory productCategory) {
        repository.save(productCategory);
    }

    @Override
    public void delete(Integer id) {
        repository.delete(id);
    }
}
