package com.mashensoft.bus.service.methodImpl;

import com.mashensoft.bus.mapper.PaymentMapper;
import com.mashensoft.bus.model.PaymentExample;
import com.mashensoft.bus.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    PaymentMapper paymentMapper;
    @Override
    public List getAll(Integer orderId) {
        PaymentExample paymentExample =new PaymentExample();
        paymentExample.createCriteria().andOrderIdEqualTo(orderId);
        return paymentMapper.selectByExample(paymentExample);
    }
}
