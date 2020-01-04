package com.mashensoft.bus.mapper;

import com.mashensoft.bus.model.OrderTicket;
import com.mashensoft.bus.model.OrderTicketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderTicketMapper {
    int countByExample(OrderTicketExample example);

    int deleteByExample(OrderTicketExample example);

    int deleteByPrimaryKey(Integer orderTicketId);

    int insert(OrderTicket record);

    int insertSelective(OrderTicket record);

    List<OrderTicket> selectByExample(OrderTicketExample example);

    OrderTicket selectByPrimaryKey(Integer orderTicketId);

    int updateByExampleSelective(@Param("record") OrderTicket record, @Param("example") OrderTicketExample example);

    int updateByExample(@Param("record") OrderTicket record, @Param("example") OrderTicketExample example);

    int updateByPrimaryKeySelective(OrderTicket record);

    int updateByPrimaryKey(OrderTicket record);
}