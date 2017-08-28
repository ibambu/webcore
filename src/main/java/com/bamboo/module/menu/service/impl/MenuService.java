/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.module.menu.service.impl;

import com.bamboo.module.menu.beans.Menu;
import com.bamboo.module.menu.beans.MenuExample;
import com.bamboo.module.menu.dao.MenuDao;
import com.bamboo.module.menu.service.IMenuService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author luotao
 */
@Service
public class MenuService implements IMenuService {

    @Resource
    private MenuDao menuDao;

    @Override
    public long countByExample(MenuExample example) {
        return menuDao.countByExample(example);
    }

    @Override
    public int deleteByExample(MenuExample example) {
        return menuDao.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer menuId) {
        return menuDao.deleteByPrimaryKey(menuId);
    }

    @Override
    @Transactional
    public int insertAA(Menu record) throws Exception {
        int retcode = 0;
        try {
            menuDao.insert(record);

            record.setMenuId(123456);

            menuDao.insert(record);
        } catch (Exception e) {
            e.printStackTrace();

            throw e;
        }
        return retcode;
    }

    @Override
    public int insertSelective(Menu record) {
        return menuDao.insertSelective(record);
    }

    @Override
    public List<Menu> selectByExample(MenuExample example) {
        return menuDao.selectByExample(example);
    }

    @Override
    public Menu selectByPrimaryKey(Integer menuId) {
        return menuDao.selectByPrimaryKey(menuId);
    }

    @Override
    public int updateByExampleSelective(Menu record, MenuExample example) {
        return menuDao.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Menu record, MenuExample example) {
        return menuDao.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Menu record) {
        return menuDao.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKey(Menu record) {
        return menuDao.updateByPrimaryKey(record);
    }

}
