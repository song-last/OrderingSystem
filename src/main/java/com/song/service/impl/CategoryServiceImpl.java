package com.song.service.impl;

import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.song.db.ProductCategory;
import com.song.db.QProductCategory;
import com.song.repository.ProductCategoryRepository;
import com.song.service.CategoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;


/**
 * @Author song
 * @Date 2020/2/24 16:21
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public ProductCategory findOne(Integer categoryId) {
        Optional<ProductCategory> opt = productCategoryRepository.findById(categoryId);
        return opt.get();
    }

    @Override
    public List<ProductCategory> findAll() {
        return productCategoryRepository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeId(List<Integer> typeId) {
        QProductCategory qProductCategory = QProductCategory.productCategory;
        Predicate pre = qProductCategory.categoryType.in(typeId);
        return (List<ProductCategory>) productCategoryRepository.findAll(pre);
    }

    @Override
    public void save(ProductCategory productCategory) {
        if (productCategory.getCategoryId() == null) {
            productCategory.setCreateTime(new Date());
        }else {
            ProductCategory oldProductCategory = productCategoryRepository.findById(productCategory.getCategoryId()).get();
            productCategory.setCreateTime(oldProductCategory.getCreateTime());
            productCategory.setCategoryId(oldProductCategory.getCategoryId());
        }
        productCategoryRepository.save(productCategory);
    }


}
