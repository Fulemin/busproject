package com.mashensoft.bus.userControl;


import com.mashensoft.bus.example.ReOrderExample;
import com.mashensoft.bus.mapper.OrderlikeMapper;
import com.mashensoft.bus.model.*;
import com.mashensoft.bus.service.OrderService;
import com.mashensoft.bus.service.TicketService;
import com.mashensoft.bus.utils.JwtHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
public class OrderLikeControl {
    @Autowired
    OrderService orderService;
    @Autowired
    OrderlikeMapper orderlikeMapper;
    @Autowired
    TicketService ticketService;

    @RequestMapping(value = "/orderToday", method = RequestMethod.POST)
    public List getOrderToday(@RequestBody Map<String, String> map) {
        List<ReOrderExample> list = orderService.getOrderToday();
        List<ReOrderExample> list1 = new ArrayList<>();
        String userId = map.get("userId");
        Integer u = JwtHelper.unsign(userId, Integer.class);
        ReOrderExample reOrderExample = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getDate() != null) {
                if (list.get(i).getUserId().equals(u)) {
                    reOrderExample = list.get(i);
                    list1.add(reOrderExample);
                }
            }
        }
        return list1;
    }

    @RequestMapping(value = "/order", method = RequestMethod.POST)
    public List<ReOrderExample> getOrder(@RequestBody Map<String, String> map) {
        List<ReOrderExample> list = orderService.getOrder();
        List<ReOrderExample> list2 = new ArrayList<>();
        String userId = map.get("userId");
        Integer u = JwtHelper.unsign(userId, Integer.class);
        ReOrderExample reOrderExample = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getDate() != null) {
                if (list.get(i).getUserId().equals(u)) {
                    reOrderExample = list.get(i);
                    list2.add(reOrderExample);
                }
            }
        }
        return list2;
    }
    /**
     * 确认购票
     *
     * @param map
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public int add(@RequestBody Map<String, List> map) throws Exception {
        /**
         * 获取订单信息入库
         */
        System.out.println(map.get("orderLike"));
        List<Orderlike> orderlikeList = map.get("orderLike");
        int a= this.addOrderLike(orderlikeList);
        /**
         * 获取车票信息入库
         */
        List<Ticket> ticketList = map.get("ticket");
        List list =this.addTicket(ticketList);
        /**
         * 获取订单Id跟车票Id
         */
        Map<String,Object> orderTicketMap =new HashMap();
        orderTicketMap.put("orderId", a);
        orderTicketMap.put("ticketList",list);
        this.addOrderTicket(orderTicketMap);
        /**
         * 获取乘客Id
         */
        List<OrderPassenger> passengerList = map.get("OrderPassenger");
        Map<String,Object> orderPassengerMap =new HashMap();
        orderPassengerMap.put("orderId",a);
        orderPassengerMap.put("OrderPassenger",passengerList);
        this.addOrderPassenger(orderPassengerMap);
        /**
         * 获取orderStation
         */
        List<OrderStation> orderStationList = map.get("OrderStation");
        System.out.println(orderStationList.size());
        Map<String,Object> orderStationMap =new HashMap();
        orderStationMap.put("orderId",a);
        orderStationMap.put("OrderStation",orderStationList);
        this.addOrderStation(orderStationMap);
        return 1;
    }


    public List addTicket(List<Ticket> ticketList) throws ParseException {
        List list = new ArrayList();
        int t = 0;
        for (int i = 0; i < ticketList.size(); i++) {
            Ticket ticket = new Ticket();

            Map<String, Object> map1 = (Map<String, Object>) ticketList.get(i);

            Integer ticketNumber = (Integer) map1.get("ticketNumber");
            ticket.setTicketNumber(ticketNumber);

            Integer busId = (Integer) map1.get("busId");
            ticket.setBusId(busId);

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String da = (String) map1.get("date");
            Date date = sdf.parse(da);
            date.setTime(date.getTime() + 24 * 60 * 60 * 1000);
            ticket.setTicketDate(date);

            Integer lineBusId = (Integer) map1.get("lineBusId");
            ticket.setLineBusId(lineBusId);
            ticketService.addTicket(ticket);
            t = ticket.getTicketId();
            list.add(t);
        }
        return list;
    }

    public int addOrderLike(List<Orderlike> orderlikeList) throws ParseException {
        int a = 0;
        for (int i = 0; i < orderlikeList.size(); i++) {
            Orderlike orderlike = new Orderlike();

            Map<String, Object> map1 = (Map) orderlikeList.get(i);
            String dateString = (String) map1.get("createTime");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = sdf.parse(dateString);
            orderlike.setCreateTime(date);

            Integer busId = (Integer) map1.get("busId");
            orderlike.setBusId(busId);

            String lineOrigin = (String) map1.get("lineOrigin");
            orderlike.setLineOrigin(lineOrigin);

            String lineDestination = (String) map1.get("lineDestination");
            orderlike.setLineDestination(lineDestination);

            String lineTime = (String) map1.get("lineTime");
            orderlike.setLineTime(lineTime);

            String userId = (String) map1.get("userId");
            Integer u = JwtHelper.unsign(userId, Integer.class);
            orderlike.setUserId(u);

            orderService.addOrder(orderlike);
            a = orderlike.getOrderId();

        }
        return a;
    }

    public void addOrderPassenger(Map<String, Object> map) {
        List<OrderPassenger> passengerList = (List<OrderPassenger>) map.get("OrderPassenger");
        int a = (int) map.get("orderId");
        for (int i = 0; i < passengerList.size(); i++) {

            Map<String, List> map1 = (Map<String, List>) passengerList.get(i);

            List<OrderPassenger> passengerList1 = new ArrayList<>();
            List passengerIdList = map1.get("passengerId");
            OrderPassenger orderPassenger = null;
            for (int j = 0; j < passengerIdList.size(); j++) {
                orderPassenger = new OrderPassenger();
                orderPassenger.setPassengerId((Integer) passengerIdList.get(j));
                orderPassenger.setOrderId(a);
                passengerList1.add(orderPassenger);
            }
            for (int item = 0; item < passengerList1.size(); item++) {
                orderService.addOrderPassenger(passengerList1.get(item));
            }
        }
    }

    public void addOrderTicket(Map<String, Object> map){
        List<OrderTicket> orderTicketList = new ArrayList<>();
        List list = (List) map.get("ticketList");
        int a = (int) map.get("orderId");
        for (int i = 0; i < list.size(); i++) {
            OrderTicket ticket = new OrderTicket();
            ticket.setOrderId(a);
            ticket.setTicketId((Integer) list.get(i));
            orderTicketList.add(ticket);
        }
        for (int i = 0; i < orderTicketList.size(); i++) {
            orderService.addOrderTicket(orderTicketList.get(i));
        }
    }

    public void addOrderStation(Map<String, Object> map){
        List<OrderStation> orderStationList = (List<OrderStation>) map.get("OrderStation");
        int a= (int) map.get("orderId");
        for (int i = 0; i < orderStationList.size(); i++) {

            Map<String, Integer> map1 =
                    (Map<String, Integer>) orderStationList.get(i);

            List<OrderStation> stationList = new ArrayList<>();
            Integer stationIdList = map1.get("stationId");
            Integer getOnOffList = map1.get("getOnOff");

            OrderStation orderStation = new OrderStation();
            orderStation.setStationId(stationIdList);
            orderStation.setGetOnOff(getOnOffList);
            orderStation.setOrderId(a);
            stationList.add(orderStation);
            for (int item = 0; item < stationList.size(); item++) {
                orderService.addOrderStation(orderStation);
            }
        }
    }
}
