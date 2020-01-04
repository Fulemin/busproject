package com.mashensoft.bus.userControl;

import com.mashensoft.bus.model.LineBus;
import com.mashensoft.bus.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@RestController
public class TicketController {
    @Autowired
    TicketService ticketService;

    @RequestMapping(value = "/ticket/AllTicketState",method = RequestMethod.POST)
    public int getAllTicketState(@RequestBody Map<String,Object> map) throws ParseException {
        //Date date,LineBus lineBus
        String dateString = (String)map.get("date");
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sd.parse(dateString);
        System.out.println(date);
        LineBus lineBus = new LineBus();
        lineBus.setLineBusId((Integer)map.get("lineBusId"));
//        System.out.println("getBusId:"+map.get("lineBusId"));
//        System.out.println("getBusId:"+lineBus.getLineBusId());
//        System.out.println(map);



        return ticketService.getAllTicketState(date,lineBus.getLineBusId());
    }

//    @RequestMapping(value = "/addTicket",method = RequestMethod.POST)
//    public int addTicket(@RequestBody Ticket ticket){
//         ticketService.addTicket(ticket);
//        return ticket.getTicketId();
//    }
}
