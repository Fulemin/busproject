package com.mashensoft.bus.service;

import com.mashensoft.bus.model.Passenger;

import java.util.List;

public interface PassengerService {
    public List<Passenger> getAll();
    public Passenger getPassengerById(Integer passengerId);
    public boolean addPassenger(Passenger passenger);
    public int deletePassengerById(Integer passengerId);
    public int deletePassenger(Passenger passenger);
    public  int updatePassenger(Passenger passenger);
}
