package com.song.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 类目
 * @Author song
 * @Date 2020/2/22 22:41
 */
@Entity
public class ProductCategory {

    /** 类目id   */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /** 类目名称  */
    private String categoryName;

    /**  类目编号  */
    private Integer categoryType;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }
}
