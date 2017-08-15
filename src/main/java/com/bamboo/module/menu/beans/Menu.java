package com.bamboo.module.menu.beans;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Menu implements Serializable {
    private Integer menuId;

    private String menuName;

    private Date createTime;

    /**
     * 顶级菜单的上级菜单默认填写0
     */
    private String parentMenuId;

    /**
     * 菜单跳转地址
     */
    private String menuHref;

    private static final long serialVersionUID = 1L;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getParentMenuId() {
        return parentMenuId;
    }

    public void setParentMenuId(String parentMenuId) {
        this.parentMenuId = parentMenuId;
    }

    public String getMenuHref() {
        return menuHref;
    }

    public void setMenuHref(String menuHref) {
        this.menuHref = menuHref;
    }
}