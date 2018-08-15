package com.conpany.project;

import com.company.project.model.Item;
import com.company.project.service.ItemService;
import com.company.project.service.impl.RedisService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;
import java.util.List;

public class RedisTester extends Tester {
    @Resource
    private RedisTemplate<String,Object> redisTemplate;
    @Resource
    private RedisService redisService;
    @Resource
    private ItemService itemService;
    @Test
    public void testSimpleRedis(){
        List<Item> itemList = itemService.findAll();
        boolean result = redisService.setValue("itemList",itemList);
        Assert.assertEquals(true,result);
        Object object = redisService.getValue("itemList");
        List<Item> items = (List<Item>) object;
        Assert.assertEquals(itemList.size(),items.size());
    }
}
