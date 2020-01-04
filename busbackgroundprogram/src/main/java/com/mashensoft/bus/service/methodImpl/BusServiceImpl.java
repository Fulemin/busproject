package com.mashensoft.bus.service.methodImpl;

import com.github.pagehelper.PageHelper;
import com.mashensoft.bus.mapper.BusMapper;
import com.mashensoft.bus.model.Bus;
import com.mashensoft.bus.model.BusExample;
import com.mashensoft.bus.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BusServiceImpl implements BusService {

    @Autowired
    BusMapper busMapper;

    @Override
    public List<Bus> AllBus() {
        return null;
    }

    @Override
    public Bus getBusById(Integer busId) {
//       return busMapper.selectByExample(new BusExample()).get(busId);
        return busMapper.selectByExample(new BusExample()).get(busId);
    }

    @Override
    public List<Bus> getBusByColor( Bus bus) {
        BusExample busExample = new BusExample();
        busExample.createCriteria().andBusColorEqualTo(bus.getBusColor());
        List<Bus> list = busMapper.selectByExample(busExample);
        return list;
    }

    @Override
    public int addBus(Bus bus) {
        return busMapper.insert(bus);
    }

    @Override
    public int deleteBus(Bus bus) {
        return busMapper.deleteByPrimaryKey(bus.getBusId());
    }

    @Override
    public int updateBus(Bus bus) {
        return busMapper.updateByPrimaryKey(bus);
    }

    @Override
    public List selectBus(int positionBegin, int len) {
        BusExample busExample = new BusExample();
        PageHelper.startPage(positionBegin, len);
        return busMapper.selectByExample(busExample);
    }

    @Override
    public int sumSelectBus() {
        BusExample busExample = new BusExample();
        return busMapper.countByExample(busExample);
    }
}
