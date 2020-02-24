package com.song.service;

import com.song.db.ProductCategory;

import java.util.List;

/**
 * @Author song
 * @Date 2020/2/24 15:40
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeId(List<Integer> typeId);

    void save(ProductCategory productCategory);
}
