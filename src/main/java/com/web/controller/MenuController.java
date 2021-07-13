package com.web.controller;

import com.github.pagehelper.PageInfo;
import com.web.pojo.Menu;
import com.web.service.MenuService;
import com.web.vo.ResultVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@ResponseBody
@RequestMapping(value = "menu")
public class MenuController {
    @Resource
    private MenuService menuService;

    //查询菜单列表
    @RequestMapping(value = "list",method = RequestMethod.GET)
    public ResultVO<Menu> queryByPage(Integer pageNum, Integer pageSize, String m_name){
        if (pageNum==null ||pageNum<=0){
            pageNum=1;
        }
        if (pageSize==null || pageSize<=0){
            pageSize=5;
        }
        PageInfo<Menu> userPageInfo = menuService.queryByPage(pageNum, pageSize, m_name);
        return new ResultVO<Menu>(userPageInfo);
    }

    //新增菜单
    @RequestMapping(value = "",method = RequestMethod.POST)
    public ResultVO<Menu> addMenu(Menu menu){
        int i = menuService.addMenu(menu);
        if (i==1)
            return new ResultVO<Menu>();
        return new ResultVO<Menu>(500,"服务器内部异常，请稍后再试！");
    }

    //根据主键查询
    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public ResultVO<Menu> queryById(@PathVariable("id") int id){
        Menu menu = menuService.queryById(id);
        return new ResultVO<Menu>(menu);
    }

    //更新菜单
    @RequestMapping(value = "{id}",method = RequestMethod.PUT)
    public ResultVO<Menu> updateMenu(@PathVariable("id") int id,Menu menu){
        menu.setM_id(id);
        int i = menuService.updateMenu(menu);
        if (i==1)
            return new ResultVO<Menu>();
        return new ResultVO<Menu>(500,"服务器内部异常，请稍后再试！");
    }

    //删除菜单
    @RequestMapping(value = "{id}",method = RequestMethod.DELETE)
    public ResultVO<Menu> deleteUser(@PathVariable("id") int id ){
        System.out.println("删除============");
        int i = menuService.deleteMenu(id);
        if (i==1)
            return new ResultVO<Menu>();
        return new ResultVO<Menu>(500,"服务器内部异常，请稍后再试！");
    }
}
