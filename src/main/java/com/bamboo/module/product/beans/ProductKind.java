package com.bamboo.module.product.beans;

import java.io.Serializable;

/**
 * @author 
 */
public class ProductKind implements Serializable {
    /**
     * 分类ID
     */
    private Integer kindId;

    /**
     * 分类名称
     */
    private String kindName;

    /**
     * 上级分类ID
     */
    private Integer parentKindId;

    /**
     * 分类描述
     */
    private String kindDesc;

    private static final long serialVersionUID = 1L;

    public Integer getKindId() {
        return kindId;
    }

    public void setKindId(Integer kindId) {
        this.kindId = kindId;
    }

    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName;
    }

    public Integer getParentKindId() {
        return parentKindId;
    }

    public void setParentKindId(Integer parentKindId) {
        this.parentKindId = parentKindId;
    }

    public String getKindDesc() {
        return kindDesc;
    }

    public void setKindDesc(String kindDesc) {
        this.kindDesc = kindDesc;
    }
}