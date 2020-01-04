package com.mashensoft.bus.service;

import com.mashensoft.bus.example.ReOrderExample;
import com.mashensoft.bus.mapper.OrderlikeMapper;
import com.mashensoft.bus.mapper.PaymentMapper;
import com.mashensoft.bus.model.Orderlike;
import com.mashensoft.bus.model.OrderlikeExample;
import com.mashensoft.bus.model.Payment;
import com.mashensoft.bus.model.PaymentExample;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class OrderServiceImplTest {
    @Autowired
    OrderlikeMapper orderlikeMapper;
    @Autowired
    OrderService orderService;
    @Autowired
    PaymentMapper paymentMapper;
    @Test
    void getOrder() {
        OrderlikeExample orderlikeExample =new OrderlikeExample();
  List<Orderlike> list = orderlikeMapper.selectByExample(orderlikeExample);
        for (int i=0;i<list.size();i++){
            ReOrderExample reOrderExample =new ReOrderExample();
            System.out.println(list.get(i).getOrderId());
            PaymentExample paymentExample =new PaymentExample();
            paymentExample.createCriteria().andOrderIdEqualTo(list.get(i).getOrderId());
            System.out.println(paymentMapper.selectByExample(paymentExample).size());
            List<Payment> paymentList = paymentMapper.selectByExample(paymentExample);//todo
            System.out.println(paymentList.get(0).getPaymentState());
             }
    }

    @Test
    void test(){
        Payment payment =new Payment();
        PaymentExample paymentExample =new PaymentExample();
        paymentExample.createCriteria().andOrderIdEqualTo(1);
        List<Payment> paymentList = paymentMapper.selectByExample(paymentExample);
    }
    @Test
    void test22(){
        orderService.getOrderList(2,2).forEach( a-> System.out.println(a.getOrderId()));
    }
}