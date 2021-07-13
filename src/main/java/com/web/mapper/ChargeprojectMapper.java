package com.web.mapper;

import com.web.pojo.Chargeproject;
import com.web.pojo.ChargeprojectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChargeprojectMapper {
    long countByExample(ChargeprojectExample example);

    int deleteByExample(ChargeprojectExample example);

    int deleteByPrimaryKey(Integer chaP_id);

    int insert(Chargeproject record);

    int insertSelective(Chargeproject record);

    List<Chargeproject> selectByExample(ChargeprojectExample example);

    Chargeproject selectByPrimaryKey(Integer chaP_id);

    int updateByExampleSelective(@Param("record") Chargeproject record, @Param("example") ChargeprojectExample example);

    int updateByExample(@Param("record") Chargeproject record, @Param("example") ChargeprojectExample example);

    int updateByPrimaryKeySelective(Chargeproject record);

    int updateByPrimaryKey(Chargeproject record);
}