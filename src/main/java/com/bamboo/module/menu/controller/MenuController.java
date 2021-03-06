/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.module.menu.controller;

import com.bamboo.module.menu.beans.Menu;
import com.bamboo.module.menu.service.IMenuService;
import com.bamboo.module.order.service.IUserOrderService;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author luotao
 */
@Controller
public class MenuController {
    
    protected Logger log = Logger.getLogger(MenuController.class);
    
    @Resource
    private IMenuService menuService;
    
    @Resource
    private IUserOrderService userOrderService;

    /**
     * 菜单跳转
     *
     * @param request
     * @param session
     * @return
     */
    @RequestMapping(value = "/foward.do", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView fowardToPage(HttpServletRequest request, HttpSession session) {
        
        String menuId = request.getParameter("menuId");
        ModelAndView modelview = new ModelAndView();
        Menu forwardMenu = null;
        try {
            List<Menu> menus = (List) session.getAttribute("userMenu");
            if (menus != null) {
                for (Menu menu : menus) {
                    if (menu.getMenuId().equals(menuId)) {
                        forwardMenu = menu;
                        break;
                    }
                }
            }
            if (forwardMenu != null) {
                modelview.setViewName(forwardMenu.getMenuHref());
            } else {
                modelview.setViewName("error");
            }
            
        } catch (Exception e) {
            log.error("菜单初始化异常", e);
        }
        return modelview;
    }
    
    @RequestMapping(value = "/test.do", method = RequestMethod.POST,produces = "application/json")
    @ResponseBody
    public void test(HttpServletRequest request, HttpSession session) {
        
        String menuId = "999999";
        ModelAndView modelview = new ModelAndView();
        Menu menu = new Menu();
        try {
            menu.setMenuId(Integer.parseInt(menuId));
            menu.setMenuName("test");
            menu.setMenuHref("#");
            menu.setParentMenuId("-1");
            menu.setCreateTime(new Date());
            int retcode = menuService.insert(menu);
            System.out.println(retcode);
        } catch (Exception e) {
            log.error("菜单初始化异常", e);
            e.printStackTrace();
        }
        return;
    }
}
