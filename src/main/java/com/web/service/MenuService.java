package com.web.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.web.mapper.MenuMapper;
import com.web.pojo.Menu;
import com.web.pojo.MenuExample;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MenuService {
    @Resource
    private MenuMapper menuMapper;

    /**
     * 查询菜单列表
     * @param pageNum
     * @param pageSize
     * @param m_name
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public PageInfo<Menu> queryByPage(Integer pageNum, Integer pageSize, String m_name){
        MenuExample menuExample = new MenuExample();
        MenuExample.Criteria criteria = menuExample.createCriteria();
        if (m_name!=null ){
            criteria.andM_nameLike("%"+m_name.trim()+"%");
        }
        PageHelper.startPage(pageNum,pageSize);
        List<Menu> menus = menuMapper.selectByExample(menuExample);
        return new PageInfo<>(menus);
    }

    /**
     * 添加菜单
     * @param menu
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int addMenu(Menu menu){
        return menuMapper.insert(menu);
    }

    /**
     * 根据主键查询
     * @param id
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public Menu queryById(int id){
        return menuMapper.selectByPrimaryKey(id);
    }

    /**
     * 更新菜单
     * @param menu
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int updateMenu(Menu menu){
        return menuMapper.updateByPrimaryKeySelective(menu);
    }

    /**
     * 删除菜单
     * @param id
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int deleteMenu(int id ){
        return menuMapper.deleteByPrimaryKey(id);
    }

}
