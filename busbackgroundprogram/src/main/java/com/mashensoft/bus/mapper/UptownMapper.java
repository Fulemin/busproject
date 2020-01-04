package com.mashensoft.bus.mapper;

import com.mashensoft.bus.model.Uptown;
import com.mashensoft.bus.model.UptownExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UptownMapper {
    int countByExample(UptownExample example);

    int deleteByExample(UptownExample example);

    int deleteByPrimaryKey(Integer uptownId);

    int insert(Uptown record);

    int insertSelective(Uptown record);

    List<Uptown> selectByExample(UptownExample example);

    Uptown selectByPrimaryKey(Integer uptownId);

    int updateByExampleSelective(@Param("record") Uptown record, @Param("example") UptownExample example);

    int updateByExample(@Param("record") Uptown record, @Param("example") UptownExample example);

    int updateByPrimaryKeySelective(Uptown record);

    int updateByPrimaryKey(Uptown record);
}