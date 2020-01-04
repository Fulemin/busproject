package com.mashensoft.bus.service;

import com.mashensoft.bus.model.LineBus;

import java.util.List;

public interface StationService {
    public List selectStationByLineIdAndLineTime(LineBus lineBus);
    public List selectStationAllByLineIdAndLineTime(LineBus lineBus);
}
