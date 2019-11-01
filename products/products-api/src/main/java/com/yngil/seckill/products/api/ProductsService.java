package com.yngil.seckill.products.api;

import com.yngil.seckill.products.vo.ProductsInput;
import com.yngil.seckill.products.vo.ProductsOutput;

public interface ProductsService {
    ProductsOutput getProduct(ProductsInput productsInput);
}
