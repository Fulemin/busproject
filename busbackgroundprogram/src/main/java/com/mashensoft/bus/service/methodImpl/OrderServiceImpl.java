package com.mashensoft.bus.service.methodImpl;

import com.github.pagehelper.PageHelper;
import com.mashensoft.bus.example.ReOrderExample;
import com.mashensoft.bus.mapper.*;
import com.mashensoft.bus.model.*;
import com.mashensoft.bus.service.OrderService;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderlikeMapper orderlikeMapper;
    @Autowired
    UserMapper userMapper;
    @Autowired
    OrderLikeOtherMessageImpl orderLikeOtherMessage;
    @Autowired
    OrderPassengerMapper orderPassengerMapper;
    @Autowired
    OrderStationMapper orderStationMapper;
    @Autowired
    OrderTicketMapper orderTicketMapper;

    /**
     * 获取订单的日期和时间、票数、车次起点、终点、上下车点、乘客信息、下单时间、支付状态
     *
     * @return
     */
    @Override
    public List getOrderToday() {
        List<ReOrderExample> reOrderExampleList = new ArrayList<>();
        OrderlikeExample orderExample = new OrderlikeExample();
        List<Orderlike> list = orderlikeMapper.selectByExample(orderExample);//TODO 获取订单的车次起点、终点、下单时间、busId、userId、OrderId
        for (int i = 0; i < list.size(); i++) {
            ReOrderExample reOrderExample = new ReOrderExample();
            reOrderExample.setTime(list.get(i).getLineTime());//todo 获取车次时间
            reOrderExample.setOrigin(list.get(i).getLineOrigin());//todo 获取起点
            reOrderExample.setDestination(list.get(i).getLineDestination());//todo 获取终点
            User user = userMapper.selectByPrimaryKey(list.get(i).getUserId());
            reOrderExample.setUserName(user.getUserName());//todo 获取用户名
            reOrderExample.setOrderId(list.get(i).getOrderId());//todo 订单Id
            reOrderExample.setUserId(list.get(i).getUserId());//todo 用户Id
            /**
             * todo 获取下单时间
             */
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM" +
                    "-dd HH:mm:ss");
            String formatTime = simpleDateFormat.format(list.get(i).getCreateTime());
            reOrderExample.setCreateTime(formatTime);
            Integer orderId = list.get(i).getOrderId();
            List<Passenger> passengerList =
                    orderLikeOtherMessage.getPassenger(orderId);
            reOrderExample.setPassenger(passengerList);//todo 获取乘客信息
            Integer payment = orderLikeOtherMessage.getPayment(orderId);
            reOrderExample.setPayment(payment);//todo 获取支付状态
            reOrderExample.setGetOn(orderLikeOtherMessage.getStation(orderId).get(
                    "上车点"));
            reOrderExample.setGetOff(orderLikeOtherMessage.getStation(orderId).get("下车点"));
            reOrderExample.setTicketNumbers((Integer) orderLikeOtherMessage.getTicket(orderId).get("车票总数"));
            reOrderExample.setDate((List) orderLikeOtherMessage.getTicketToday(orderId).get("日期"));
            reOrderExampleList.add(reOrderExample);
        }
        return reOrderExampleList;
    }

    @Override
    public List getOrder() {
        List<ReOrderExample> reOrderExampleList = new ArrayList<>();
        OrderlikeExample orderExample = new OrderlikeExample();
        List<Orderlike> list = orderlikeMapper.selectByExample(orderExample);//TODO 获取订单的车次起点、终点、下单时间、busId、userId、OrderId
        for (int i = 0; i < list.size(); i++) {
            ReOrderExample reOrderExample = new ReOrderExample();
            reOrderExample.setTime(list.get(i).getLineTime());//todo 获取车次时间
            reOrderExample.setOrigin(list.get(i).getLineOrigin());//todo 获取起点
            reOrderExample.setDestination(list.get(i).getLineDestination());//todo 获取终点
            User user = userMapper.selectByPrimaryKey(list.get(i).getUserId());
            reOrderExample.setUserName(user.getUserName());//todo 获取用户名
            reOrderExample.setOrderId(list.get(i).getOrderId());//todo 订单Id
            reOrderExample.setUserId(list.get(i).getUserId());//todo 用户Id
            /**
             * todo 获取下单时间
             */
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM" +
                    "-dd HH:mm:ss");
            String formatTime = simpleDateFormat.format(list.get(i).getCreateTime());
            reOrderExample.setCreateTime(formatTime);
            Integer orderId = list.get(i).getOrderId();
            List<Passenger> passengerList =
                    orderLikeOtherMessage.getPassenger(orderId);
            reOrderExample.setPassenger(passengerList);//todo 获取乘客信息
            Integer payment = orderLikeOtherMessage.getPayment(orderId);
            reOrderExample.setPayment(payment);//todo 获取支付状态
            reOrderExample.setGetOn(orderLikeOtherMessage.getStation(orderId).get(
                    "上车点"));
            reOrderExample.setGetOff(orderLikeOtherMessage.getStation(orderId).get("下车点"));
            reOrderExample.setTicketNumbers((Integer) orderLikeOtherMessage.getTicket(orderId).get("车票总数"));
            reOrderExample.setDate((List) orderLikeOtherMessage.getTicketOtherDay(orderId).get("日期"));
            reOrderExampleList.add(reOrderExample);
        }
        return reOrderExampleList;
    }

    /**
     * add by zongxing
     *
     * @param positionBegin
     * @param len
     * @return
     */
    @Override
    public List getOrderList(int positionBegin, int len) {
        OrderlikeExample example = new OrderlikeExample();
        PageHelper.startPage(positionBegin, len);
        List list = orderlikeMapper.selectByExample(example);
        return list;
    }

    @Override
    public List getOrderToAdminOther(int positionBegin, int len) {
        List<ReOrderExample> reOrderExampleList = new ArrayList<>();
        OrderlikeExample orderExample = new OrderlikeExample();
        PageHelper.startPage(positionBegin, len);
        List<Orderlike> list = orderlikeMapper.selectByExample(orderExample);//TODO 获取订单的车次起点、终点、下单时间、busId、userId、OrderId
        for (int i = 0; i < list.size(); i++) {
            ReOrderExample reOrderExample = new ReOrderExample();
            reOrderExample.setTime(list.get(i).getLineTime());//todo 获取车次时间
            reOrderExample.setOrigin(list.get(i).getLineOrigin());//todo 获取起点
            reOrderExample.setDestination(list.get(i).getLineDestination());//todo 获取终点
            User user = userMapper.selectByPrimaryKey(list.get(i).getUserId());
            reOrderExample.setUserName(user.getUserName());//todo 获取用户名
            reOrderExample.setOrderId(list.get(i).getOrderId());
            /**
             * todo 获取下单时间
             */
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM" +
                    "-dd HH:mm:ss");
            String formatTime = simpleDateFormat.format(list.get(i).getCreateTime());
            reOrderExample.setCreateTime(formatTime);
            Integer orderId = list.get(i).getOrderId();
            List<Passenger> passengerList =
                    orderLikeOtherMessage.getPassenger(orderId);
            reOrderExample.setPassenger(passengerList);//todo 获取乘客信息
            Integer payment = orderLikeOtherMessage.getPayment(orderId);
            reOrderExample.setPayment(payment);//todo 获取支付状态
            reOrderExample.setGetOn(orderLikeOtherMessage.getStation(orderId).get(
                    "上车点"));
            reOrderExample.setGetOff(orderLikeOtherMessage.getStation(orderId).get("下车点"));
            reOrderExample.setTicketNumbers((Integer) orderLikeOtherMessage.getTicket(orderId).get("车票总数"));
            reOrderExample.setDate((List) orderLikeOtherMessage.getTicket(orderId).get("日期"));
            reOrderExampleList.add(reOrderExample);
        }
        return reOrderExampleList;
    }

    @Override
    public int sumOrderToAdmin() {
        OrderlikeExample orderlikeExample = new OrderlikeExample();
        return orderlikeMapper.countByExample(orderlikeExample);
    }

    @Override
    public int addOrder(Object orderlike) {
        return orderlikeMapper.insert((Orderlike) orderlike);
    }

    @Override
    public boolean addOrderPassenger(Object orderPassenger) {
        boolean a =
                orderPassengerMapper.insert((OrderPassenger) orderPassenger) >= 1;
        return a;
    }

    @Override
    public boolean addOrderTicket(OrderTicket orderTicket) {
        boolean a = orderTicketMapper.insert((OrderTicket) orderTicket) >= 1;
        return a;
    }

    @Override
    public boolean addOrderStation(Object orderStation) {
        boolean a = orderStationMapper.insert((OrderStation) orderStation) >= 1;
        return a;
    }
}
