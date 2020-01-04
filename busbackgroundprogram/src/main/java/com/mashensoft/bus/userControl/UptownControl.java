package com.mashensoft.bus.userControl;

import com.mashensoft.bus.model.Uptown;
import com.mashensoft.bus.service.UptownService;
import com.mashensoft.bus.utils.JwtHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UptownControl {
    @Autowired
    UptownService uptownService;

    /**
     * 获得所有小区
     * @return
     */
    @RequestMapping(value = "/uptown", method = RequestMethod.GET)
    public List<Uptown> getAllUptown() {
        List<Uptown> list = uptownService.getAllUptown();
        List list1 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIsHot().equals("1")) {
                Uptown uptown = list.get(i);
                list1.add(uptown);
            }
        }
        return list1;
    }

    /**
     * 根据小区Id获取小区信息
     * @param uptownId 小区ID
     * @return
     */
    @RequestMapping(value = "/getUptownById/{uptownId}", method = RequestMethod.GET)
    public Uptown getUptownById(@PathVariable Integer uptownId) {
        return uptownService.getUptownById(uptownId);
    }

    @RequestMapping(value = "/getUptownByUserId/{userId}", method =
            RequestMethod.GET)
    public Uptown getUptownByUserId(@PathVariable String userId) {
       Integer a= JwtHelper.unsign(userId,Integer.class);
        return uptownService.getUptownByUserId(a);
    }

    /**
     * 添加小区
     * @param uptown
     * @return
     */
    public boolean addUptown(Uptown uptown) {
        return uptownService.addUptown(uptown);
    }

    /**
     * 根据小区Id删除小区
     * @param uptownId
     * @return
     */
    public int deleteUptownById(Integer uptownId) {
        return uptownService.deleteUptownById(uptownId);
    }

    /**
     * 更新小区信息
     * @param uptown
     * @return
     */
    public int updateUptown(Uptown uptown) {
        return uptownService.updateUptown(uptown);
    }

    /**
     * 根据关键字查询小区
     * @param uptown
     * @return
     */
    @RequestMapping(value = "/uptown/name/", method = RequestMethod.POST)
    public List<Uptown> getBusByName(@RequestBody Uptown uptown) {
        return uptownService.selectByUptownName(uptown.getUptownName());
    }

    /**
     * 根据小区ID查询小区
     * @param uptown
     * @return
     */
    @RequestMapping(value = "/uptown/id/", method = RequestMethod.POST)
    public Uptown getBusById(@RequestBody Uptown uptown) {
        return uptownService.selectById(uptown);
    }
}
