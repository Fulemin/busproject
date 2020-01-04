package com.mashensoft.bus.userControl;

import com.mashensoft.bus.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentControl {
    @Autowired
    PaymentService paymentService;
    @RequestMapping(value = "/payment/{orderId}",method = RequestMethod.GET)
    public List getAll(@PathVariable Integer orderId){
        return paymentService.getAll(orderId);
    }
}
