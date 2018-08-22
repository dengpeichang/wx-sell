package com.imooc.wxsell.service;

import com.imooc.wxsell.dataobject.ProductCategory;

import java.util.List;

public interface CategoryService {

    ProductCategory findOne(Integer id);

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypes);

    List<ProductCategory> findAll();

    void save(ProductCategory productCategory);

    void delete(Integer id);


}
