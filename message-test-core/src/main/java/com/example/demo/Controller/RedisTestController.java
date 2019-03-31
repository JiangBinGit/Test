package com.example.demo.Controller;

import com.example.demo.Service.RedisTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisTestController {

    private RedisTestService redisTestService;
    @RequestMapping("/redisTest")
    private void redisTest(){
        redisTestService.redisTest();
    }

}
