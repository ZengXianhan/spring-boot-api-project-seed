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

    @Test
    public void testExpiredRedis(){
        int id = 10048;
        Item item = itemService.findById(id);
        boolean result = redisService.setValue(item, item.getItemId().toString(),5);
        Assert.assertEquals(true,result);
        Object object = redisService.getValue(item, item.getItemId().toString());
        Item items = (Item) object;
        Assert.assertEquals(items.getItemId(),item.getItemId());

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        object = redisService.getValue(item, item.getItemId().toString());
        items = (Item) object;
        Assert.assertNull(items);
    }
}
