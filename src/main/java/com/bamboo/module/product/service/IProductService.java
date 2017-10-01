/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.module.product.service;

import com.bamboo.module.product.beans.Product;
import com.bamboo.module.product.dto.ProductDTO;
import java.util.List;

/**
 *
 * @author luotao
 */
public interface IProductService {

    /**
     * 根据产品标识查询产品，包含产品扩展信息。
     *
     * @param productId
     * @return
     */
    public ProductDTO queryProductByIdWithExtends(Integer productId);

    /**
     * 根据产品标识查询产品基本信息
     *
     * @param productId
     * @return
     */
    public Product queryProductById(Integer productId);

    /**
     * 根据产品分类查询产品，包含产品扩展信息。
     *
     * @param productKindId
     * @return
     */
    public List<ProductDTO> queryProductsByKindWithExtends(Integer productKindId);

    /**
     * 根据产品分查询产品
     *
     * @param productKindId
     * @return
     */
    public List<Product> queryProductsByKind(Integer productKindId);

    /**
     * 根据产品名称查询产品
     *
     * @param productName
     * @return
     */
    public List<Product> queryProductsByName(String productName);

    /**
     * 根据产品名称查询产品，包含产品扩展信息。
     *
     * @param productName
     * @return
     */
    public List<ProductDTO> queryProductsByNameWithExtends(String productName);
    
}
