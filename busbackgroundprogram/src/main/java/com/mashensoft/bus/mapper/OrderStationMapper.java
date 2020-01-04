package com.mashensoft.bus.mapper;

import com.mashensoft.bus.model.OrderStation;
import com.mashensoft.bus.model.OrderStationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderStationMapper {
    int countByExample(OrderStationExample example);

    int deleteByExample(OrderStationExample example);

    int deleteByPrimaryKey(Integer orderStationId);

    int insert(OrderStation record);

    int insertSelective(OrderStation record);

    List<OrderStation> selectByExample(OrderStationExample example);

    OrderStation selectByPrimaryKey(Integer orderStationId);

    int updateByExampleSelective(@Param("record") OrderStation record, @Param("example") OrderStationExample example);

    int updateByExample(@Param("record") OrderStation record, @Param("example") OrderStationExample example);

    int updateByPrimaryKeySelective(OrderStation record);

    int updateByPrimaryKey(OrderStation record);
}