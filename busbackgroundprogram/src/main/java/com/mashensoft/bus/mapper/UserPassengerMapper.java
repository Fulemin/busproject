package com.mashensoft.bus.mapper;

import com.mashensoft.bus.model.UserPassenger;
import com.mashensoft.bus.model.UserPassengerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPassengerMapper {
    int countByExample(UserPassengerExample example);

    int deleteByExample(UserPassengerExample example);

    int deleteByPrimaryKey(Integer userPassengerId);

    int insert(UserPassenger record);

    int insertSelective(UserPassenger record);

    List<UserPassenger> selectByExample(UserPassengerExample example);

    UserPassenger selectByPrimaryKey(Integer userPassengerId);

    int updateByExampleSelective(@Param("record") UserPassenger record, @Param("example") UserPassengerExample example);

    int updateByExample(@Param("record") UserPassenger record, @Param("example") UserPassengerExample example);

    int updateByPrimaryKeySelective(UserPassenger record);

    int updateByPrimaryKey(UserPassenger record);
}