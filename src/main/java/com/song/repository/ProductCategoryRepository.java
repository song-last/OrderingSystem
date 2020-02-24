package com.song.repository;

import com.song.db.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

/**
 * @Author song
 * @Date 2020/2/23 14:23
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer>,QuerydslPredicateExecutor<ProductCategory> {
}
