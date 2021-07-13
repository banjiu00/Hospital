package com.web.mapper;

import com.web.pojo.Hosregister;
import com.web.pojo.HosregisterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HosregisterMapper {
    long countByExample(HosregisterExample example);

    int deleteByExample(HosregisterExample example);

    int deleteByPrimaryKey(Integer hosR_id);

    int insert(Hosregister record);

    int insertSelective(Hosregister record);

    List<Hosregister> selectByExample(HosregisterExample example);

    Hosregister selectByPrimaryKey(Integer hosR_id);

    int updateByExampleSelective(@Param("record") Hosregister record, @Param("example") HosregisterExample example);

    int updateByExample(@Param("record") Hosregister record, @Param("example") HosregisterExample example);

    int updateByPrimaryKeySelective(Hosregister record);

    int updateByPrimaryKey(Hosregister record);
}