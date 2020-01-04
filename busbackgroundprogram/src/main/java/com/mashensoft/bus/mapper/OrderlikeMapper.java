package com.mashensoft.bus.mapper;

import com.mashensoft.bus.model.Orderlike;
import com.mashensoft.bus.model.OrderlikeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderlikeMapper {
    int countByExample(OrderlikeExample example);

    int deleteByExample(OrderlikeExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(Orderlike record);

    int insertSelective(Orderlike record);

    List<Orderlike> selectByExample(OrderlikeExample example);

    Orderlike selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") Orderlike record, @Param("example") OrderlikeExample example);

    int updateByExample(@Param("record") Orderlike record, @Param("example") OrderlikeExample example);

    int updateByPrimaryKeySelective(Orderlike record);

    int updateByPrimaryKey(Orderlike record);
}