package com.yngil.seckill.products.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Products {
    private Integer productId;
    private Integer productCode;
    private BigDecimal price;
    private String productName;
    private Date createTime;
    private Date updateTime;
}
