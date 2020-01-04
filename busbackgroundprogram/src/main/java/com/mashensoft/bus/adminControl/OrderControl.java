package com.mashensoft.bus.adminControl;

import com.mashensoft.bus.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class OrderControl {
    @Autowired
    OrderService orderService;

//    @RequestMapping(value = "/getOrderToAdmin/{positionBegin}/{len}",method =
//            RequestMethod.GET)
//    public List getOrderToAdmin(@PathVariable("positionBegin") int positionBegin,
//            @PathVariable("len") int len){
//        return orderService.getOrderToAdmin(positionBegin,len);
//    }


    @RequestMapping(value = "/sumOrderToAdmin",method = RequestMethod.GET)
    public int sumOrderToAdmin() {
        return orderService.sumOrderToAdmin();
    }


    @RequestMapping(value = "/getOrderToAdmin/{positionBegin}/{len}",method =
            RequestMethod.GET)
    public List getOrderByUsernameToAdmin(@PathVariable("positionBegin") int positionBegin,
                                          @PathVariable("len") int len){
        return orderService.getOrderToAdminOther(positionBegin,len);
    }

}
