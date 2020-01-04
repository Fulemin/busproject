package com.mashensoft.bus.service.methodImpl;

import com.mashensoft.bus.mapper.PassengerMapper;
import com.mashensoft.bus.mapper.UserPassengerMapper;
import com.mashensoft.bus.model.Passenger;
import com.mashensoft.bus.model.PassengerExample;
import com.mashensoft.bus.model.UserPassenger;
import com.mashensoft.bus.model.UserPassengerExample;
import com.mashensoft.bus.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PassengerServiceImpl implements PassengerService {
    @Autowired
    PassengerMapper passengerMapper;
    @Override
    public List<Passenger> getAll() {
        PassengerExample passengerExample =new PassengerExample();


        return passengerMapper.selectByExample(passengerExample);
    }

    @Override
    public Passenger getPassengerById(Integer passengerId) {
        return passengerMapper.selectByPrimaryKey(passengerId);
    }

    @Override
    public boolean addPassenger(Passenger passenger) {
        return passengerMapper.insert(passenger)==1;
    }

    @Override
    public int deletePassengerById(Integer passengerId) {
        return passengerMapper.deleteByPrimaryKey(passengerId);

    }

    @Override
    public int deletePassenger(Passenger passenger) {
        PassengerExample passengerExample =new PassengerExample();
        passengerExample.createCriteria().andPassengerIdCardEqualTo(passenger.getPassengerIdCard());
        return  passengerMapper.deleteByExample(passengerExample);
    }

    @Override
    public int updatePassenger(Passenger passenger) {
        PassengerExample passengerExample =new PassengerExample();
        passengerExample.createCriteria().andPassengerIdCardEqualTo(passenger.getPassengerIdCard());
        return passengerMapper.updateByExampleSelective(passenger,passengerExample);

    }
}
