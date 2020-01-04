package com.mashensoft.bus.service.methodImpl;

import com.mashensoft.bus.example.UptownExample;
import com.mashensoft.bus.mapper.UserMapper;
import com.mashensoft.bus.model.Uptown;
import com.mashensoft.bus.model.User;
import com.mashensoft.bus.model.UserExample;
import com.mashensoft.bus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    /**
     * 获得所有的用户
     * @return
     */
    @Override
    public List<User> getAllUser() {
        UserExample userExample =new UserExample();
        return userMapper.selectByExample(userExample);
    }

    /**
     * 根据用户Id获得用户
     * @param userId
     * @return
     */
    @Override
    public User getUserById(Integer userId) {
       User user = userMapper.selectByPrimaryKey(userId);
        return user;
    }

//    @Override
//    public User getUserByUsername(String userName) {
//        User user = null;
//        UserExample userExample = new UserExample();
//        UserExample.Criteria uc =  userExample.createCriteria();
//        uc.andUserNameEqualTo(userName);
//        List<User> list= userMapper.selectByExample(userExample);
//        if(list.size()==1){
//            user = list.get(0);
//            return user;
//        }
//        return null;
//    }

    /**
     * 添加用户
     * @param user 传入一个User对象
     * @return
     */
    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }

    /**
     * 根据用户Id删除用户
     * @param userId
     * @return
     */
    @Override
    public int deleteUserById(Integer userId) {
        return userMapper.deleteByPrimaryKey(userId);
    }

    /**
     * 更改用户信息
     * @param user
     * @return
     */
    @Override
    public int updateUser(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    /**
     * 计算该USER所入驻小区数量
     * @param user
     * @return
     */
    @Override
    public long countByUptownName(User user) {
//        List<Uptown> a = uptownService.selectByUptownName(uptown);
//        System.out.println(a.get(0).getUptownId());
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUptownIdEqualTo(user.getUptownId());
        return   userMapper.countByExample(userExample);

    }

    @Override
    public List<User> getUserByOpenId(String openId) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andOpenidEqualTo(openId);
        return userMapper.selectByExample(userExample);
    }
}
