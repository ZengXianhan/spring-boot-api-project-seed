package com.company.project.service.impl;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;

/**
 * 封装redis 缓存服务器服务接口
 *
 * @author zxh
 */
@Service
public class RedisService {
    @Resource
    private RedisTemplate<String, Object> redisTemplate;


    public Object getValue(String key) {
        ValueOperations<String, Object> valueOperations = redisTemplate.opsForValue();
        Object object = valueOperations.get(key);
        return object;
    }

    public boolean setValue(String key, Object values) {
        try {
            ValueOperations<String, Object> valueOperations = redisTemplate.opsForValue();
            valueOperations.set(key, values);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean setValue(String key, Object values, int expiredTime) {
        try {
            ValueOperations<String, Object> valueOperations = redisTemplate.opsForValue();
            valueOperations.set(key, values);
            this.redisTemplate.expire(key, expiredTime, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public String keyGenerator(String modelName, Integer id) {
        return null;
    }

    public String keyGenerator(String collectionType, String modelName) {
        return null;
    }
}
