package com.song.service.impl;

import com.song.db.ProductCategory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Date;
import java.util.List;


/**
 * @Author song
 * @Date 2020/2/24 16:28
 */
@SpringBootTest
class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    void findOne() {
        ProductCategory one = categoryService.findOne(1);
        Assertions.assertEquals(new Integer(1),one.getCategoryId());
    }

    @Test
    void findAll() {
        List<ProductCategory> all = categoryService.findAll();
        Assertions.assertEquals(1,all.size());
    }

    @Test
    void findByCategoryTypeId() {
        List<ProductCategory> byCategoryTypeId = categoryService.findByCategoryTypeId(Arrays.asList(1,2));
        Assertions.assertNotEquals(0,byCategoryTypeId.size());
    }

    @Test
    void save() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("蛋糕");
        productCategory.setCategoryType(7);
        categoryService.save(productCategory);
    }
}