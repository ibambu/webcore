/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.module.product.dto;

import com.bamboo.module.product.beans.Product;
import com.bamboo.module.product.beans.ProductKind;
import com.bamboo.module.product.beans.ProductKindAttr;
import com.bamboo.module.product.beans.ProductSale;
import com.bamboo.module.product.beans.ProductSaleAttr;
import com.bamboo.module.product.beans.ProductSalePhoto;
import java.util.List;

/**
 *
 * @author luotao
 */
public class ProductDTO {

    private Product product;
    private ProductKind productKind;
    private List<ProductKindAttr> productKindAttrs;
    private ProductSale productSale;
    private List<ProductSaleAttr> productSaleAttrs;
    private List<ProductSalePhoto> productSalePhotoes;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductKind getProductKind() {
        return productKind;
    }

    public void setProductKind(ProductKind productKind) {
        this.productKind = productKind;
    }

    public List<ProductKindAttr> getProductKindAttrs() {
        return productKindAttrs;
    }

    public void setProductKindAttrs(List<ProductKindAttr> productKindAttrs) {
        this.productKindAttrs = productKindAttrs;
    }

    public ProductSale getProductSale() {
        return productSale;
    }

    public void setProductSale(ProductSale productSale) {
        this.productSale = productSale;
    }

    public List<ProductSalePhoto> getProductSalePhotoes() {
        return productSalePhotoes;
    }

    public void setProductSalePhotoes(List<ProductSalePhoto> productSalePhotoes) {
        this.productSalePhotoes = productSalePhotoes;
    }

    public List<ProductSaleAttr> getProductSaleAttrs() {
        return productSaleAttrs;
    }

    public void setProductSaleAttrs(List<ProductSaleAttr> productSaleAttrs) {
        this.productSaleAttrs = productSaleAttrs;
    }

    
}
