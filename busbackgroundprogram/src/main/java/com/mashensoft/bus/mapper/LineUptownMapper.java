package com.mashensoft.bus.mapper;

import com.mashensoft.bus.model.LineUptown;
import com.mashensoft.bus.model.LineUptownExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LineUptownMapper {
    int countByExample(LineUptownExample example);

    int deleteByExample(LineUptownExample example);

    int deleteByPrimaryKey(Integer lineUptownId);

    int insert(LineUptown record);

    int insertSelective(LineUptown record);

    List<LineUptown> selectByExample(LineUptownExample example);

    LineUptown selectByPrimaryKey(Integer lineUptownId);

    int updateByExampleSelective(@Param("record") LineUptown record, @Param("example") LineUptownExample example);

    int updateByExample(@Param("record") LineUptown record, @Param("example") LineUptownExample example);

    int updateByPrimaryKeySelective(LineUptown record);

    int updateByPrimaryKey(LineUptown record);
}