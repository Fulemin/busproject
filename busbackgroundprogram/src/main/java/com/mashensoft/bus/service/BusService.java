package com.mashensoft.bus.service;

import com.mashensoft.bus.model.Bus;

import java.util.List;

public interface BusService {

    public List<Bus> AllBus();

    public  Bus getBusById(Integer busId);

    public  List<Bus> getBusByColor(Bus bus);

    public int addBus (Bus bus);

    public int deleteBus (Bus bus);

    public int updateBus(Bus bus);

    public List selectBus(int positionBegin , int len);

    public int sumSelectBus();

}
