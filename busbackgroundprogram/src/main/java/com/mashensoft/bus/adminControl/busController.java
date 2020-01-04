package com.mashensoft.bus.adminController;

import com.mashensoft.bus.model.Bus;
import com.mashensoft.bus.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class busController {
    @Autowired
    BusService busService;

    @RequestMapping(value = "/admin/addBus",method = RequestMethod.POST)
    public int addBusAdmin(@RequestBody Bus bus){
        return busService.addBus(bus);
    }

    @RequestMapping(value = "/admin/selectBus/{positionBegin}/{len}",method = RequestMethod.GET)
    public List<Bus> selectBusAdmin(@PathVariable ("positionBegin") int positionBegin,@PathVariable ("len") int len){
        return busService.selectBus(positionBegin,len);
    }

    @RequestMapping(value = "/admin/updateBus",method = RequestMethod.POST)
    public int updateBusAdmin(@RequestBody Bus bus){
        return busService.updateBus(bus);
    }

    @RequestMapping(value = "/admin/deleteBus",method = RequestMethod.POST)
    public int deleteBusAdmin(@RequestBody Bus bus){
        return busService.deleteBus(bus);
    }

    @RequestMapping(value = "/admin/sumSelectBus",method = RequestMethod.GET)
    public int sumSelectBusAdmin(){
        return busService.sumSelectBus();
    }

}
