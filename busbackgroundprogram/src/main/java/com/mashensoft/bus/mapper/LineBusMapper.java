package com.mashensoft.bus.mapper;

import com.mashensoft.bus.model.LineBus;
import com.mashensoft.bus.model.LineBusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LineBusMapper {
    int countByExample(LineBusExample example);

    int deleteByExample(LineBusExample example);

    int deleteByPrimaryKey(Integer lineBusId);

    int insert(LineBus record);

    int insertSelective(LineBus record);

    List<LineBus> selectByExample(LineBusExample example);

    LineBus selectByPrimaryKey(Integer lineBusId);

    int updateByExampleSelective(@Param("record") LineBus record, @Param("example") LineBusExample example);

    int updateByExample(@Param("record") LineBus record, @Param("example") LineBusExample example);

    int updateByPrimaryKeySelective(LineBus record);

    int updateByPrimaryKey(LineBus record);
}