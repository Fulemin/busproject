package com.mashensoft.bus.service.methodImpl;

import com.mashensoft.bus.mapper.BusMapper;
import com.mashensoft.bus.mapper.LineBusMapper;
import com.mashensoft.bus.mapper.TicketMapper;
import com.mashensoft.bus.model.*;
import com.mashensoft.bus.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Date;
import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    TicketMapper ticketMapper;

    @Autowired
    BusMapper busMapper;

    @Autowired
    LineBusMapper lineBusMapper;

    @Override
    public List allTicket() {

        return null;
    }

    @Override
    public int getAllTicketState(Date date,  Integer lineBusId) {

        date.setTime(date.getTime()+24 * 60 * 60 * 1000);
        TicketExample ticketExample = new TicketExample();
        ticketExample.createCriteria().andTicketDateEqualTo(date).andLineBusIdEqualTo(lineBusId);
        List<Ticket> list= ticketMapper.selectByExample(ticketExample);


        LineBusExample lineBusExample = new LineBusExample();
        lineBusExample.createCriteria().andLineBusIdEqualTo(lineBusId);
        List<LineBus> list2 = lineBusMapper.selectByExample(lineBusExample);

        BusExample busExample = new BusExample();
        busExample.createCriteria().andBusIdEqualTo(list2.get(0).getBusId());
        int seatNumber = (busMapper.selectByExample(busExample)).get(0).getSeatNumber();


        int count = 0;//统计已经买票的人数
        for (int i = 0;i < list.size();i++){
            System.out.println("i:"+list.get(i).getTicketNumber());
            int pic = list.get(i).getTicketNumber();
            count = count + pic;
        }

        System.out.println(count);

        if(count >= seatNumber){
            System.out.println(true);
            int a = 0;
            return a;
        }else {
            System.out.println(false);
            return 1;
        }

    }

    @Override
    public int addTicket(Object ticket) {
         return ticketMapper.insert((Ticket) ticket);

    }
}
