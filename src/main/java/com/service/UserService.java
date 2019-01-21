package com.service;

import com.dao.UserDao;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{
    @Autowired
    private UserDao userDao;

    @Autowired
    private StringRedisTemplate redisTemplate;
    @Cacheable(value = "users2",key = "'ssid_' + #id")
    @Override
    public User getUser(Integer id) {
        System.out.println("load2");
        User u = userDao.findById(id);
       // redisTemplate.opsForCluster().
        return u;
    }
}
