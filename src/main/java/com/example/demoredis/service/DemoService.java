package com.example.demoredis.service;
/*
 * @author p78o2
 * @date 2021/6/21
 */

public interface DemoService {
    public <T> boolean set(String key ,T value);
    public Object get(String key);
}
