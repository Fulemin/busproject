package com.mashensoft.bus.userControl;

import com.mashensoft.bus.model.User;
import com.mashensoft.bus.service.UserService;
import com.mashensoft.bus.utils.JwtHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class UserControl {
    @Autowired
    UserService userService;
//    @RequestMapping(value = "/user/{userName}",method = RequestMethod.GET)
//    public User getUserByUsername(@PathVariable String userName){
//        return userService.getUserByUsername(userName);
//    }

    /**
     * 计算该USER所入驻小区数量
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/user/CountByUptownID/", method = RequestMethod.POST)
    public Long getBusById(@RequestBody User user) {
        return userService.countByUptownName(user);
    }

    /**
     * 根据用户Id获得用户
     * @param userId
     * @return
     */
    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    public User getUserById(@PathVariable Integer userId) {
        return userService.getUserById(userId);
    }

    /**
     * 获得所有的用户
     * @return
     */
    @RequestMapping(value = "/allUser", method = RequestMethod.GET)
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    /**
     * 添加用户
     * @param user 传入一个User对象
     * @return
     */
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public int addUser(@RequestBody User user) {
        return userService.addUser(user);

    }

    /**
     * 根据用户Id删除用户
     * @param userId
     * @return
     */
    @RequestMapping(value = "/deleteUser/{userId}", method = RequestMethod.DELETE)
    public int deleteUserById(@PathVariable Integer userId) {
        return userService.deleteUserById(userId);
    }

    /**
     * 更改用户信息
     * @param map
     * @return
     */
    @RequestMapping(value = "/updateUser", method = RequestMethod.PUT)
    public int updateUser(@RequestBody Map<String,String> map) {
//        Map<String,Integer> map = (Map) user;
        String a = map.get("userId");
        Integer userId = JwtHelper.unsign(a,Integer.class);
        Integer uptownId = Integer.valueOf(map.get("uptownId"));
        User user =new User();
        user.setUptownId(uptownId);
        user.setUserId(userId);
        System.out.println(userId);
        return userService.updateUser(user);
    }
}
