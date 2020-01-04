package com.mashensoft.bus.mapper;

import com.mashensoft.bus.model.Bus;
import com.mashensoft.bus.model.BusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusMapper {
    int countByExample(BusExample example);

    int deleteByExample(BusExample example);

    int deleteByPrimaryKey(Integer busId);

    int insert(Bus record);

    int insertSelective(Bus record);

    List<Bus> selectByExample(BusExample example);

    Bus selectByPrimaryKey(Integer busId);

    int updateByExampleSelective(@Param("record") Bus record, @Param("example") BusExample example);

    int updateByExample(@Param("record") Bus record, @Param("example") BusExample example);

    int updateByPrimaryKeySelective(Bus record);

    int updateByPrimaryKey(Bus record);
}