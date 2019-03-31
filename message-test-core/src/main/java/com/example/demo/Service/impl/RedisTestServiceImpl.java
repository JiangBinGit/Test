package com.example.demo.Service.impl;

import com.example.demo.RedisUtil.RedisUtil;
import com.example.demo.Service.RedisTestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: jiangb
 * @Date: 2019/3/31 22:40
 * @Version 1.0
 */
@Service
public class RedisTestServiceImpl implements RedisTestService {
    private static final Logger logger = LoggerFactory.getLogger(RedisTestServiceImpl.class);
    @Autowired
    private RedisUtil redisUtil;
    @Override
    public void redisTest() {
        String redisKey="local";
        boolean locked = redisUtil.locked(redisKey, 100);
        try {
            if(!locked){
                logger.info("提醒用户不要多次操作");
            }
        }catch (Exception e){
            e.getMessage();
        }finally {
            redisUtil.deleteLocked(redisKey);
        }
    }
}
