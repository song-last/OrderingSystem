package com.song.db;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品
 * @Author song
 * @Date 2020/2/24 21:42
 */
@Entity
@Data
public class ProductInfo {

    @Id
    private String productId;

    /**  商品名称  */
    private String productName;

    /**  商品价格  */
    private BigDecimal productPrice;

    /**  商品库存  */
    private Integer productStock;

    /**  商品描述  */
    private String productDescription;

    /**  小图  */
    private String productIcon;

    /**   类目编号  */
    private Integer categoryType;

    /**  商品状态,0正常1下架  */
    private Integer productStatus;

    /**  创建时间  */
    private Date createTime;

    /**  修改时间  */
    private Date updateTime;
}
