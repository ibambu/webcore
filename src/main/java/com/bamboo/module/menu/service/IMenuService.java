/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.module.menu.service;

import com.bamboo.module.menu.beans.Menu;
import com.bamboo.module.menu.beans.MenuExample;
import java.util.List;

/**
 *
 * @author luotao
 */
public interface IMenuService {

    public long countByExample(MenuExample example);

    public int deleteByExample(MenuExample example);

    public int deleteByPrimaryKey(Integer menuId);

    public int insert(Menu record) throws Exception ;

    public int insertSelective(Menu record);

    public List<Menu> selectByExample(MenuExample example);

    public Menu selectByPrimaryKey(Integer menuId);

    public int updateByExampleSelective(Menu record, MenuExample example);

    public int updateByExample(Menu record, MenuExample example);

    public int updateByPrimaryKeySelective(Menu record);

    public int updateByPrimaryKey(Menu record);
}
