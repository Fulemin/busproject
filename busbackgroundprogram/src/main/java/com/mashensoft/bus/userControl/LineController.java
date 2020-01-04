package com.mashensoft.bus.userControl;

import com.mashensoft.bus.model.*;
import com.mashensoft.bus.service.LineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class LineController {
    @Autowired
    LineService lineService;

    @RequestMapping(value = "/line/WorkGoOut",method = RequestMethod.POST)
    public List getLineWorkGoOut(@RequestBody User user){
        return lineService.selectWorkGoOutLine(user.getUptownId());
    }

    @RequestMapping(value = "/line/WorkGoBack",method = RequestMethod.POST)
    public List getLineWorkGoBack(@RequestBody User user){
        return lineService.selectWorkGoBackLine(user.getUptownId());
    }

    @RequestMapping(value = "/line/WeekendGoOut",method = RequestMethod.POST)
    public List getLineWeekendGoOut(@RequestBody User user){
        return lineService.selectWeekendGoOutLine(user.getUptownId());
    }

    @RequestMapping(value = "/line/WeekendGoBack",method = RequestMethod.POST)
    public List getLineWeekendGoBack(@RequestBody User user){
        return lineService.selectWeekendGoBackLine(user.getUptownId());
    }

    @RequestMapping(value = "/line/LineId",method = RequestMethod.POST)
    public List<LineBus> getLineId(@RequestBody LineBus lineBus){
        return lineService.selectIdByTime(lineBus);
    }

    @RequestMapping(value = "/line/SelectLineBus",method = RequestMethod.POST)
    public List<LineBus> getLineBus(@RequestBody LineBus lineBus){
        return lineService.selectIdByTime(lineBus);
    }

    @RequestMapping(value = "/line/SelectLineBusId",method = RequestMethod.POST)
    public int getLineBusId(@RequestBody LineBus lineBus){
        List<LineBus> list = lineService.selectIdByTime(lineBus);
        return list.get(0).getLineBusId();
    }
}
