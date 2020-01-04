package com.mashensoft.bus.service;

import com.mashensoft.bus.model.Uptown;
import com.mashensoft.bus.model.User;

import java.util.List;

public interface UptownService {
    public List<Uptown> selectByUptownName(String uptownName);
    public Uptown selectById(Uptown uptown);
    public List<Uptown> getAllUptown();
    public Uptown getUptownById(Integer uptownId);
    public boolean addUptown(Uptown uptown);
    public int deleteUptownById(Integer uptownId);
    public int updateUptown(Uptown uptown);
    public  Uptown getUptownByUserId(int userId);
}
