package com.mashensoft.bus.mapper;

import com.mashensoft.bus.model.Payment;
import com.mashensoft.bus.model.PaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentMapper {
    int countByExample(PaymentExample example);

    int deleteByExample(PaymentExample example);

    int deleteByPrimaryKey(Integer paymentId);

    int insert(Payment record);

    int insertSelective(Payment record);

    List<Payment> selectByExample(PaymentExample example);

    Payment selectByPrimaryKey(Integer paymentId);

    int updateByExampleSelective(@Param("record") Payment record, @Param("example") PaymentExample example);

    int updateByExample(@Param("record") Payment record, @Param("example") PaymentExample example);

    int updateByPrimaryKeySelective(Payment record);

    int updateByPrimaryKey(Payment record);
}