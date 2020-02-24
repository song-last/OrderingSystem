package com.song.db;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * 类目
 * @Author song
 * @Date 2020/2/22 22:41
 */
@Entity
@DynamicUpdate          //自动更新时间
@Data
public class ProductCategory {

    /** 类目id    */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer categoryId;

    /** 类目名称  */
    private String categoryName;

    /**  类目编号  */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

}
