package com.xyc.service;

import com.xyc.domain.ProductInfo;
import com.xyc.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 商品服务
 */
public interface ProductService {

    ProductInfo findById(String productId);
    //查询所有在架的商品列表
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存
    void increaseStock(List<CartDTO> cartDTOList);
    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);

    //上架
    ProductInfo onsale(String productId);
    //下架
    ProductInfo offsale(String productId);
}
