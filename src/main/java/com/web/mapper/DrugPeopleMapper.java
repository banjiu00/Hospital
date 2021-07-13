package com.web.mapper;

import com.web.pojo.DrugPeople;
import com.web.pojo.DrugPeopleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrugPeopleMapper {
    long countByExample(DrugPeopleExample example);

    int deleteByExample(DrugPeopleExample example);

    int deleteByPrimaryKey(Integer dr_id);

    int insert(DrugPeople record);

    int insertSelective(DrugPeople record);

    List<DrugPeople> selectByExample(DrugPeopleExample example);

    DrugPeople selectByPrimaryKey(Integer dr_id);

    int updateByExampleSelective(@Param("record") DrugPeople record, @Param("example") DrugPeopleExample example);

    int updateByExample(@Param("record") DrugPeople record, @Param("example") DrugPeopleExample example);

    int updateByPrimaryKeySelective(DrugPeople record);

    int updateByPrimaryKey(DrugPeople record);
}