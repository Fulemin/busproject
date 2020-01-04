package com.mashensoft.bus.service.methodImpl;

import com.mashensoft.bus.mapper.UptownMapper;
import com.mashensoft.bus.model.Uptown;
import com.mashensoft.bus.model.UptownExample;
import com.mashensoft.bus.model.User;
import com.mashensoft.bus.service.UptownService;
import com.mashensoft.bus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UptownServiceImpl implements UptownService {
    @Autowired
    UptownMapper mapper;
    @Autowired
    UserService userService;

    /**
     * 获得所有小区
     * @return
     */
    @Override
    public List<Uptown> getAllUptown() {
        UptownExample uptownExample = new UptownExample();
        List list = mapper.selectByExample(uptownExample);
        return list;
    }

    /**
     * 根据小区Id获取小区信息
     * @param uptownId 小区ID
     * @return
     */
    @Override
    public Uptown getUptownById(Integer uptownId) {
        Uptown uptown = mapper.selectByPrimaryKey(uptownId);
        return uptown;
    }

    /**
     * 添加小区
     * @param uptown
     * @return
     */
    @Override
    public boolean addUptown(Uptown uptown) {
        boolean add = mapper.insert(uptown)==1;
        return add;
    }

    /**
     * 根据小区Id删除小区
     * @param uptownId
     * @return
     */
    @Override
    public int deleteUptownById(Integer uptownId) {
        return mapper.deleteByPrimaryKey(uptownId);
    }

    /**
     * 更新小区信息
     * @param uptown
     * @return
     */
    @Override
    public int updateUptown(Uptown uptown) {
        UptownExample uptownExample =new UptownExample();
        return mapper.updateByExampleSelective(uptown,uptownExample);
    }

    @Override
    public Uptown getUptownByUserId(int userId) {
        User user = userService.getUserById(userId);
        return mapper.selectByPrimaryKey(user.getUptownId());
    }

    /**
     * 根据关键字查询小区
     * @param uptownName
     * @return
     */
    @Override
    public List<Uptown> selectByUptownName(String uptownName) {
        UptownExample uptownExample = new UptownExample();
        uptownExample.createCriteria().andUptownNameLike("%"+uptownName+"%");
        List<Uptown> list = mapper.selectByExample(uptownExample);
//        list.get(0)
        return list;
    }

    /**
     * 根据小区ID查询小区
     * @param uptown
     * @return
     */
    @Override
    public Uptown selectById(Uptown uptown) {
        UptownExample uptownExample = new UptownExample();
        return mapper.selectByPrimaryKey(uptown.getUptownId());
    }

}
