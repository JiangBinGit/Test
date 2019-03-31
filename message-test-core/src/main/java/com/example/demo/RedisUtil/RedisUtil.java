package com.example.demo.RedisUtil;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Author: jiangb
 * @Date: 2019/3/31 22:49
 * @Version 1.0
 */
@Service
public class RedisUtil {
    public RedisTemplate redisTemplate;

    /**
     * 上锁
     * @param timeOut 超时时长
     * @return
     */
    public boolean locked(String lockedKey, long timeOut) {
        boolean locked = redisTemplate.opsForValue().setIfAbsent(lockedKey, "locked");
        if (locked) {
            redisTemplate.expire(lockedKey, timeOut, TimeUnit.SECONDS);
        }
        return locked;
    }

    /**
     * 释放锁
     * @param lockedKey
     */
    public void deleteLocked(String lockedKey) {
        redisTemplate.delete(lockedKey);
    }
}
