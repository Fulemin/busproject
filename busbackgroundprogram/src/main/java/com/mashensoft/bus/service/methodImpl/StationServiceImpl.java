package com.mashensoft.bus.service.methodImpl;

import com.mashensoft.bus.mapper.StationMapper;
import com.mashensoft.bus.model.LineBus;
import com.mashensoft.bus.model.StationExample;
import com.mashensoft.bus.service.LineService;
import com.mashensoft.bus.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StationServiceImpl implements StationService {
    @Autowired
    StationMapper stationMapper;
    @Autowired
    LineService lineService;



    @Override
    public List selectStationByLineIdAndLineTime(LineBus lineBus) {
        List<LineBus> list = lineService.selectIdByTime(lineBus);
        LineBus lineBus1 = list.get(0);
        StationExample stationExample = new StationExample();
        stationExample.createCriteria().andLineIdEqualTo(lineBus1.getLineId()).andStationTimeEqualTo(lineBus1.getLineTime()).andSortNumberEqualTo(1).andGetOnOffEqualTo(1).andLineBusIdEqualTo(lineBus1.getLineBusId());
        return stationMapper.selectByExample(stationExample);
    }

    @Override
    public List selectStationAllByLineIdAndLineTime(LineBus lineBus) {
        List<LineBus> list = lineService.selectIdByTime(lineBus);
        LineBus lineBus1 = list.get(0);
        StationExample stationExample = new StationExample();
        stationExample.createCriteria().andLineIdEqualTo(lineBus1.getLineId()).andLineBusIdEqualTo(lineBus1.getLineBusId());
        return stationMapper.selectByExample(stationExample);
    }


}
