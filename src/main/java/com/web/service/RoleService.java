package com.web.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.web.mapper.MenuMapper;
import com.web.mapper.RoleMapper;
import com.web.mapper.RoleMenuMapper;
import com.web.pojo.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class RoleService {
    @Resource
    private RoleMapper roleMapper;
    @Resource
    private RoleMenuMapper roleMenuMapper;
    @Resource
    private MenuMapper menuMapper;

    /**
     * 分页查询角色
     * @param pageNum
     * @param pageSize
     * @param r_name
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public PageInfo<Role> queryByPage(Integer pageNum,Integer pageSize,String r_name){
        RoleExample roleExample = new RoleExample();
        RoleExample.Criteria criteria = roleExample.createCriteria();
        if (r_name!=null){
            criteria.andR_nameLike("%"+r_name.trim()+"%");
        }
        PageHelper.startPage(pageNum,pageSize);
        List<Role> roles = roleMapper.selectByExample(roleExample);
        for (Role r:roles) {
            List<RoleMenu> roleMenus = roleMenuMapper.selectByExample(roleMenuExample(r.getR_id()));
            List<Menu> menus=new ArrayList<>();
            roleMenus.forEach(roleMenu -> menus.add(menuMapper.selectByPrimaryKey(roleMenu.getM_id())));
            r.setMenuList(menus);
        }
        return new PageInfo<Role>(roles);
    }

    /**
     * 添加角色
     * @param role
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int addRole(Role role,Integer[] ids){
        int insert = roleMapper.insert(role);
        for (int i=0;i<ids.length;i++){
            RoleMenu roleMenu = new RoleMenu();
            roleMenu.setR_id(role.getR_id());
            roleMenu.setM_id(ids[i]);
            roleMenuMapper.insert(roleMenu);
        }
        return insert;
    }

    /**
     * 根据主键查询
     * @param id
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public Role queryById(int id){
        List<RoleMenu> roleMenus = roleMenuMapper.selectByExample(roleMenuExample(id));
        Role role = roleMapper.selectByPrimaryKey(id);
        List<Menu> menus=new ArrayList<>();
        roleMenus.forEach(roleMenu -> menus.add(menuMapper.selectByPrimaryKey(roleMenu.getM_id())));
        role.setMenuList(menus);
        return role;
    }

    /**
     * 更新角色
     * @param role
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int updateRole(Role role,Integer[] ids){
        //删除中间表
        roleMenuMapper.deleteByExample(roleMenuExample(role.getR_id()));
        //新增中间表
        for (int i=0;i<ids.length;i++){
            RoleMenu roleMenu = new RoleMenu();
            roleMenu.setR_id(role.getR_id());
            roleMenu.setM_id(ids[i]);
            roleMenuMapper.insert(roleMenu);
        }
        return roleMapper.updateByPrimaryKeySelective(role);
    }

    /**
     * 删除角色
     * @param id
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int deleteRole(int id ){
        int i = roleMenuMapper.deleteByExample(roleMenuExample(id));
        return roleMapper.deleteByPrimaryKey(id);
    }

    public RoleMenuExample roleMenuExample(int rid){
        RoleMenuExample roleMenuExample = new RoleMenuExample();
        RoleMenuExample.Criteria criteria = roleMenuExample.createCriteria();
        criteria.andR_idEqualTo(rid);
        return roleMenuExample;
    }
}
