package com.web.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.web.mapper.RoleMapper;
import com.web.mapper.UserrMapper;
import com.web.pojo.Userr;
import com.web.pojo.UserrExample;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserrMapper userMapper;
    @Resource
    private RoleMapper roleMapper;

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public List<Userr> login(String username,String password){
        UserrExample userExample = new UserrExample();
        UserrExample.Criteria criteria = userExample.createCriteria();
        criteria.andU_loginNameEqualTo(username);
        criteria.andU_passWordEqualTo(password);
        List<Userr> users = userMapper.selectByExample(userExample);
        if (users.size()==1)
            return users;
        return null;
    }

    /**
     * 查询用户列表
     * @param pageNum
     * @param pageSize
     * @param u_loginName
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public PageInfo<Userr> queryByPage(Integer pageNum, Integer pageSize,String u_loginName){
        UserrExample userExample = new UserrExample();
        UserrExample.Criteria criteria = userExample.createCriteria();
        if (u_loginName!=null ){
            criteria.andU_loginNameLike("%"+u_loginName.trim()+"%");
        }
        PageHelper.startPage(pageNum,pageSize);
        List<Userr> users = userMapper.selectByExample(userExample);
        for (Userr u:users) {
            u.setRole(roleMapper.selectByPrimaryKey(u.getR_id()));
        }
        return new PageInfo<>(users);
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int addUser(Userr user){
        return userMapper.insert(user);
    }

    /**
     * 根据主键查询
     * @param id
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public Userr queryById(int id){
        return userMapper.selectByPrimaryKey(id);
    }

    /**
     * 更新用户
     * @param userr
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int updateUser(Userr userr){
        return userMapper.updateByPrimaryKeySelective(userr);
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int deleteUser(int id ){
        return userMapper.deleteByPrimaryKey(id);
    }
}
