package com.mashensoft.bus.userControl;

import com.mashensoft.bus.mapper.UserPassengerMapper;
import com.mashensoft.bus.model.Passenger;
import com.mashensoft.bus.model.UserPassenger;
import com.mashensoft.bus.model.UserPassengerExample;
import com.mashensoft.bus.service.PassengerService;
import com.mashensoft.bus.utils.JwtHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class PassengerControl {
    @Autowired
    PassengerService passengerService;
    @Autowired
    UserPassengerMapper userPassengerMapper;


    @RequestMapping(value = "/allPassenger", method =
            RequestMethod.POST)
    public List<Passenger> getAll(@RequestBody Map<String,String> map) {
        String tokenId = map.get("tokenId");
        Integer userId = JwtHelper.unsign(tokenId, Integer.class);
        UserPassengerExample userPassengerExample = new UserPassengerExample();
        List<UserPassenger> userPassengers =
                userPassengerMapper.selectByExample(userPassengerExample);
        List<Passenger> passengerList = passengerService.getAll();
        List<Passenger> list = new ArrayList<>();
        for (int i = 0; i < userPassengers.size(); i++) {
            for (int j = 0; j < passengerList.size(); j++) {
                    if (passengerList.get(j).getPassengerId() == userPassengers.get(i).getPassengerId()) {
                        if (userId==userPassengers.get(i).getUserId()) {
                        list.add(passengerList.get(j));
                    }
                }
            }
        }
        return list;
    }

    @RequestMapping(value = "/passenger/{passengerId}", method = RequestMethod.GET)
    public Passenger getPassengerById(@PathVariable Integer passengerId) {
        return passengerService.getPassengerById(passengerId);
    }

    @RequestMapping(value = "/addPassenger", method = RequestMethod.POST)
    public boolean addPassenger(@RequestBody Passenger passenger) {
        return passengerService.addPassenger(passenger);
    }

    @RequestMapping(value = "/addPassengers", method = RequestMethod.POST)
    public int addPassenger(@RequestBody Map<String,Object> map) {
        Passenger passenger =new Passenger();
        String passengerName = (String) map.get("passengerName");
        String passengerPhone = (String) map.get("passengerPhone");
        String passengerIdCard = (String) map.get("passengerIdCard");
        String passengerType = (String) map.get("passengerType");

        passenger.setPassengerName(passengerName);
        passenger.setPassengerPhone(passengerPhone);
        passenger.setPassengerIdCard(passengerIdCard);
        passenger.setPassengerType(passengerType);

        passengerService.addPassenger(passenger);
        Integer passengerId =passenger.getPassengerId();
        String tokenId = (String) map.get("tokenId");
        Integer userId = JwtHelper.unsign(tokenId,Integer.class);

        UserPassenger userPassenger =new UserPassenger();
        userPassenger.setPassengerId(passengerId);
        userPassenger.setUserId(userId);
        return userPassengerMapper.insert(userPassenger);
    }

    @RequestMapping(value = "/deletePassenger/{passengerId}", method = RequestMethod.DELETE)
    public int deletePassengerById(@PathVariable Integer passengerId) {
        return passengerService.deletePassengerById(passengerId);
    }

    @RequestMapping(value = "/deletePassenger", method = RequestMethod.DELETE)
    public int deletePassenger(@RequestBody Passenger passenger) {
        return passengerService.deletePassenger(passenger);
    }

    @RequestMapping(value = "/updatePassenger", method = RequestMethod.PUT)
    public int updatePassenger(@RequestBody Passenger passenger) {
        return passengerService.updatePassenger(passenger);
    }
}
