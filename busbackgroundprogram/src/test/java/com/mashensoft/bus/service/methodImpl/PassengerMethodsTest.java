package com.mashensoft.bus.service.methodImpl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PassengerMethodsTest {
    @Autowired
    OrderLikeOtherMessageImpl orderLikeOtherMessage;

    @Test
    void getPassenger() {
        assertEquals(2,orderLikeOtherMessage.getPassenger(1).size());
    }
    @Test
    void test(){
        assertEquals(1,orderLikeOtherMessage.getPayment(1));
    }
    @Test
    void test2(){
        System.out.println(orderLikeOtherMessage.getStation(1).get("上车点"));
        System.out.println(orderLikeOtherMessage.getStation(1).get("下车点"));
    }

    @Test
    void test3(){
        System.out.println(orderLikeOtherMessage.getTicket(2).get("车票总数"));
        System.out.println(orderLikeOtherMessage.getTicket(2).get("日期"));
    }

}