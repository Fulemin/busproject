package com.mashensoft.bus.userControl;

import com.mashensoft.bus.model.LineBus;
import com.mashensoft.bus.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StationController {
    @Autowired
    StationService stationService;

    @RequestMapping(value = "/station/OneStationAll",method = RequestMethod.POST)
    public List<LineBus> getStationByLineBus(@RequestBody LineBus lineBus){
        return stationService.selectStationAllByLineIdAndLineTime(lineBus);
    }

    @RequestMapping(value = "/station/OneStation",method = RequestMethod.POST)
    public List<LineBus> getStationByLineBus2(@RequestBody LineBus lineBus){
        return stationService.selectStationByLineIdAndLineTime(lineBus);
    }
}
