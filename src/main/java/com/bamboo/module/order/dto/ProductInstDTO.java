/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.module.order.dto;

import com.bamboo.module.order.beans.ProductInst;
import com.bamboo.module.order.beans.ProductInstAttr;
import java.util.List;

/**
 *
 * @author luotao
 */
public class ProductInstDTO {

    private ProductInst productInst;
    private List<ProductInstAttr> prouctInstAttrs;

    public ProductInst getProductInst() {
        return productInst;
    }

    public void setProductInst(ProductInst productInst) {
        this.productInst = productInst;
    }

    public List<ProductInstAttr> getProuctInstAttrs() {
        return prouctInstAttrs;
    }

    public void setProuctInstAttrs(List<ProductInstAttr> prouctInstAttrs) {
        this.prouctInstAttrs = prouctInstAttrs;
    }
    
}
