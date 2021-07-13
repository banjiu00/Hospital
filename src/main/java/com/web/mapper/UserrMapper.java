package com.web.mapper;

import com.web.pojo.Userr;
import com.web.pojo.UserrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserrMapper {
    long countByExample(UserrExample example);

    int deleteByExample(UserrExample example);

    int deleteByPrimaryKey(Integer u_id);

    int insert(Userr record);

    int insertSelective(Userr record);

    List<Userr> selectByExample(UserrExample example);

    Userr selectByPrimaryKey(Integer u_id);

    int updateByExampleSelective(@Param("record") Userr record, @Param("example") UserrExample example);

    int updateByExample(@Param("record") Userr record, @Param("example") UserrExample example);

    int updateByPrimaryKeySelective(Userr record);

    int updateByPrimaryKey(Userr record);
}