package com.mashensoft.bus.service;

import com.mashensoft.bus.model.OrderTicket;
import com.mashensoft.bus.model.Orderlike;
import com.mashensoft.bus.userControl.OrderLikeControl;

import java.util.List;

public interface OrderService {
    public List getOrderToday();
    public List getOrder();
    public List getOrderToAdminOther(int positionBegin, int len);
    public int sumOrderToAdmin();
    public List<Orderlike> getOrderList(int positionBegin, int len);
    public int addOrder(Object orderlike);
    public boolean addOrderPassenger(Object orderPassenger);
    public boolean addOrderTicket(OrderTicket orderTicket);
    public boolean addOrderStation(Object orderStation);


}
