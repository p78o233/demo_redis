package com.example.demoredis.service.impl;

import com.example.demoredis.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/*
 * @author p78o2
 * @date 2021/6/21
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public <T> boolean set(String key, T value) {
        try{
            redisTemplate.opsForValue().set(key,value);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Object get(String key) {
        return key == null ?null : redisTemplate.opsForValue().get(key);
    }
}
