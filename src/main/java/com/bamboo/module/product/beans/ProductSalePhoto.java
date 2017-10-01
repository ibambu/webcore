package com.bamboo.module.product.beans;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class ProductSalePhoto extends ProductSalePhotoKey implements Serializable {
    private String imgUrl;

    /**
     * 图片类型：
1 主图
2 附属图
     */
    private String imgType;

    private Date createDate;

    private static final long serialVersionUID = 1L;

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getImgType() {
        return imgType;
    }

    public void setImgType(String imgType) {
        this.imgType = imgType;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}