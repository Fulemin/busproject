package com.mashensoft.bus.mapper;

import com.mashensoft.bus.model.OrderPassenger;
import com.mashensoft.bus.model.OrderPassengerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderPassengerMapper {
    int countByExample(OrderPassengerExample example);

    int deleteByExample(OrderPassengerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderPassenger record);

    int insertSelective(OrderPassenger record);

    List<OrderPassenger> selectByExample(OrderPassengerExample example);

    OrderPassenger selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderPassenger record, @Param("example") OrderPassengerExample example);

    int updateByExample(@Param("record") OrderPassenger record, @Param("example") OrderPassengerExample example);

    int updateByPrimaryKeySelective(OrderPassenger record);

    int updateByPrimaryKey(OrderPassenger record);
}