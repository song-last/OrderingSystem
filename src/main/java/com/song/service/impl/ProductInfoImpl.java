package com.song.service.impl;

import com.song.db.ProductInfo;
import com.song.service.ProductInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author song
 * @Date 2020/2/24 23:34
 */
@Service
public class ProductInfoImpl implements ProductInfoService {

    @Override
    public void save(ProductInfo productInfo) {

    }

    @Override
    public List<ProductInfo> findByProductStatus(Integer status) {
        return null;
    }
}
