package com.web.controller;

import com.github.pagehelper.PageInfo;
import com.web.pojo.Role;
import com.web.service.RoleService;
import com.web.vo.ResultVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@ResponseBody
@RequestMapping(value = "role")
public class RoleController {

    @Resource
    private RoleService roleService;

    //分页查询
    @RequestMapping(value = "list",method = RequestMethod.GET)
    public ResultVO<Role> queryByPage(Integer pageNum,Integer pageSize,String r_name){
        if (pageNum==null ||pageNum<=0){
            pageNum=1;
        }
        if (pageSize==null || pageSize<=0){
            pageSize=5;
        }
        PageInfo<Role> rolePageInfo = roleService.queryByPage(pageNum, pageSize, r_name);
        return new ResultVO<>(rolePageInfo);
    }

    //新增角色
    @RequestMapping(value = "",method = RequestMethod.POST)
    public ResultVO<Role> addRole(Role role, Integer[] group){
        int i = roleService.addRole(role,group);
        if (i==1)
            return new ResultVO<Role>();
        return new ResultVO<Role>(500,"服务器内部异常，请稍后再试！");
    }

    //根据主键查询
    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public ResultVO<Role> queryById(@PathVariable("id") int id){
        Role role = roleService.queryById(id);
        return new ResultVO<Role>(role);
    }

    //更新角色
    @RequestMapping(value = "{id}",method = RequestMethod.PUT)
    public ResultVO<Role> updateMenu(@PathVariable("id") int id,Role role,Integer[] group){
        role.setR_id(id);
        int i = roleService.updateRole(role,group);
        if (i==1)
            return new ResultVO<Role>();
        return new ResultVO<Role>(500,"服务器内部异常，请稍后再试！");
    }

    //删除角色
    @RequestMapping(value = "{id}",method = RequestMethod.DELETE)
    public ResultVO<Role> deleteUser(@PathVariable("id") int id ){
        int i = roleService.deleteRole(id);
        if (i==1)
            return new ResultVO<Role>();
        return new ResultVO<Role>(500,"服务器内部异常，请稍后再试！");
    }
}
