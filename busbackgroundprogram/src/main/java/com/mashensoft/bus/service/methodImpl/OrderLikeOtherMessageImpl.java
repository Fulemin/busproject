package com.mashensoft.bus.service.methodImpl;

import com.mashensoft.bus.mapper.*;
import com.mashensoft.bus.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class OrderLikeOtherMessageImpl {
    @Autowired
    OrderPassengerMapper orderPassengerMapper;
    @Autowired
    PassengerMapper passengerMapper;
    @Autowired
    PaymentMapper paymentMapper;
    @Autowired
    OrderStationMapper orderStationMapper;
    @Autowired
    StationMapper stationMapper;
    @Autowired
    TicketMapper ticketMapper;
    @Autowired
    OrderTicketMapper orderTicketMapper;
    @Autowired
    UserMapper userMapper;


    public List getPassenger(Integer orderId) {
        List list = new ArrayList();
        OrderPassengerExample orderPassengerExample =
                new OrderPassengerExample();
        orderPassengerExample.createCriteria().andOrderIdEqualTo(orderId);
        List<OrderPassenger> orderPassengerList =
                orderPassengerMapper.selectByExample(orderPassengerExample);
        System.out.println(orderPassengerList.size());
        for (int i = 0; i < orderPassengerList.size(); i++) {
            Integer passengerId = orderPassengerList.get(i).getPassengerId();
            Passenger passenger =
                    passengerMapper.selectByPrimaryKey(passengerId);
            list.add(passenger);
        }

        return list;
    }

    public int getPayment(Integer orderId) {
        PaymentExample paymentExample = new PaymentExample();
        paymentExample.createCriteria().andOrderIdEqualTo(orderId);
        List<Payment> paymentList =
                paymentMapper.selectByExample(paymentExample);
        int paymentState = 0;
        for (int i = 0; i < paymentList.size(); i++) {
            paymentState = paymentList.get(i).getPaymentState();
        }
        return paymentState;
    }

    public Map<String, String> getStation(Integer orderId) {
        Map<String, String> map = new HashMap<>();
        OrderStationExample orderStationExample = new OrderStationExample();
        orderStationExample.createCriteria().andOrderIdEqualTo(orderId);
        List<OrderStation> orderStationList =
                orderStationMapper.selectByExample(orderStationExample);
        String stationOn = "";
        String stationOff = "";
        for (int i = 0; i < orderStationList.size(); i++) {
            Integer stationId = orderStationList.get(i).getStationId();
            Integer getOnOff = orderStationList.get(i).getGetOnOff();
            Station station = stationMapper.selectByPrimaryKey(stationId);
            if (getOnOff == 1) {
                stationOn =
                        station.getStationName() + "(" + station.getStationType() + ")";
            } else if (getOnOff == 2) {
                stationOff = station.getStationName() + "(" + station.getStationType() + ")";
            }
            map.put("上车点", stationOn);
            map.put("下车点", stationOff);
        }

        return map;
    }

    public Map getTicket(Integer orderId) {
        Map map = new HashMap();
        OrderTicketExample orderTicketExample = new OrderTicketExample();
        orderTicketExample.createCriteria().andOrderIdEqualTo(orderId);
        List<OrderTicket> ticketList =
                orderTicketMapper.selectByExample(orderTicketExample);
        int sum = 0;
        List list = new ArrayList();
        for (int i = 0; i < ticketList.size(); i++) {
            Integer ticketId = ticketList.get(i).getTicketId();
            Ticket ticket = ticketMapper.selectByPrimaryKey(ticketId);
            sum = sum + ticket.getTicketNumber();
            Date date = ticket.getTicketDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String format = sdf.format(date);
            list.add(format);
            map.put("车票总数",sum);
            map.put("日期",list);
        }
        return map;
    }


    public Map getTicketOtherDay(Integer orderId) {
        Map map = new HashMap();
        OrderTicketExample orderTicketExample = new OrderTicketExample();
        orderTicketExample.createCriteria().andOrderIdEqualTo(orderId);
        List<OrderTicket> ticketList =
                orderTicketMapper.selectByExample(orderTicketExample);
        int sum = 0;
        List list = new ArrayList();
        for (int i = 0; i < ticketList.size(); i++) {
            Integer ticketId = ticketList.get(i).getTicketId();
            Ticket ticket = ticketMapper.selectByPrimaryKey(ticketId);
            sum = sum + ticket.getTicketNumber();
            Date date = ticket.getTicketDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String format = sdf.format(date);
            Date date1 =new Date();
            String format2 = sdf.format(date1);
            if (!(format.equals(format2))) {
                list.add(format);
            }
            map.put("车票总数",sum);
            map.put("日期",list);
        }
        return map;
    }

    public Map getTicketToday(Integer orderId) {
        Map map = new HashMap();
        OrderTicketExample orderTicketExample = new OrderTicketExample();
        orderTicketExample.createCriteria().andOrderIdEqualTo(orderId);
        List<OrderTicket> ticketList =
                orderTicketMapper.selectByExample(orderTicketExample);
        int sum = 0;
        List list = new ArrayList();
        for (int i = 0; i < ticketList.size(); i++) {
            Integer ticketId = ticketList.get(i).getTicketId();
            Ticket ticket = ticketMapper.selectByPrimaryKey(ticketId);
            sum = sum + ticket.getTicketNumber();
            Date date = ticket.getTicketDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String format = sdf.format(date);
            Date date1 =new Date();
            String format2 = sdf.format(date1);
            if (format.equals(format2)) {
                list.add(format);
            }
            map.put("车票总数",sum);
            map.put("日期",list);
        }
        return map;
    }

}
