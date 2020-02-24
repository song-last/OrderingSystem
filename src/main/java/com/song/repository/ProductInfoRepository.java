package com.song.repository;

import com.song.db.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

/**
 * @Author song
 * @Date 2020/2/24 22:17
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String>,QuerydslPredicateExecutor<ProductInfo> {
}
