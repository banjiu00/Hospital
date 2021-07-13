package com.web.controller;

import com.github.pagehelper.PageInfo;
import com.web.pojo.Userr;
import com.web.service.UserService;
import com.web.vo.ResultVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.IllegalFormatCodePointException;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("user")
@ResponseBody
public class UserController {
    @Resource
    private UserService userService;

    //登录
    @RequestMapping(value = "login",method = RequestMethod.GET)
    public ResultVO<Userr> login(String u_loginName, String u_passWord, Integer verify, HttpSession session){
        if (u_loginName ==null || u_passWord==null)
            return new ResultVO<>(400,"用户名或者密码不能为空");
        if (verify!=7236)
            return new ResultVO<>(400,"验证码错误");
        List<Userr> login = userService.login(u_loginName, u_passWord);
        if (login!=null){
            session.setAttribute("USER_LOGIN",login);
            return new ResultVO<>(login);
        }
        return new ResultVO<>(400,"用户名或者密码错误");
    }

    //退出登录
    @RequestMapping(value = "loginout")
    public ResultVO<Userr> loginout(HttpSession session){
        session.invalidate();
        return new ResultVO<>();
    }

    //查询用户列表
    @RequestMapping(value = "list",method = RequestMethod.GET)
    public ResultVO<Userr> queryByPage(Integer pageNum, Integer pageSize,String u_loginName){
        if (pageNum==null ||pageNum<=0){
            pageNum=1;
        }
        if (pageSize==null || pageSize<=0){
            pageSize=5;
        }
        PageInfo<Userr> userPageInfo = userService.queryByPage(pageNum, pageSize, u_loginName);
        return new ResultVO<Userr>(userPageInfo);
    }

    //新增用户
    @RequestMapping(value = "",method = RequestMethod.POST)
    public ResultVO<Userr> addUser(Userr user){
        int i = userService.addUser(user);
        if (i==1)
            return new ResultVO<Userr>();
        return new ResultVO<Userr>(500,"服务器内部异常，请稍后再试！");
    }

    //根据主键查询
    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public ResultVO<Userr> queryById(@PathVariable("id") int id){
        Userr userr = userService.queryById(id);
        return new ResultVO<Userr>(userr);
    }

    //更新用户
    @RequestMapping(value = "{id}",method = RequestMethod.PUT)
    public ResultVO<Userr> updateUser(@PathVariable("id") int id,Userr userr){
        userr.setU_id(id);
        int i = userService.updateUser(userr);
        if (i==1)
            return new ResultVO<Userr>();
        return new ResultVO<Userr>(500,"服务器内部异常，请稍后再试！");
    }

    //删除用户
    @RequestMapping(value = "{id}",method = RequestMethod.DELETE)
    public ResultVO<Userr> deleteUser(@PathVariable("id") int id ){
        System.out.println("删除============");
        int i = userService.deleteUser(id);
        if (i==1)
            return new ResultVO<Userr>();
        return new ResultVO<Userr>(500,"服务器内部异常，请稍后再试！");
    }
}
