package com.web.mapper;

import com.web.pojo.PricePeople;
import com.web.pojo.PricePeopleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PricePeopleMapper {
    long countByExample(PricePeopleExample example);

    int deleteByExample(PricePeopleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PricePeople record);

    int insertSelective(PricePeople record);

    List<PricePeople> selectByExample(PricePeopleExample example);

    PricePeople selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PricePeople record, @Param("example") PricePeopleExample example);

    int updateByExample(@Param("record") PricePeople record, @Param("example") PricePeopleExample example);

    int updateByPrimaryKeySelective(PricePeople record);

    int updateByPrimaryKey(PricePeople record);
}