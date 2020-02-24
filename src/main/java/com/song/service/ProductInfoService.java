package com.song.service;

import com.song.db.ProductInfo;

import java.util.List;

/**
 * @Author song
 * @Date 2020/2/24 23:03
 */
public interface ProductInfoService {

    void save(ProductInfo productInfo);

    List<ProductInfo> findByProductStatus(Integer status);
}
