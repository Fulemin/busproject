package com.mashensoft.bus.service;

import com.mashensoft.bus.example.UptownExample;
import com.mashensoft.bus.model.Uptown;
import com.mashensoft.bus.model.User;
import org.hibernate.criterion.Example;

import java.util.List;

public interface UserService {
    public List<User> getAllUser();
    public User getUserById(Integer userId);
    public int addUser(User user);
    public int deleteUserById(Integer userId);
    public int updateUser(User user);
    public long countByUptownName(User user);

    public List<User> getUserByOpenId(String openId);
}
