package com.example.demo.Service.impl;

import com.example.demo.Executor.TaskExecutorConfig;
import com.example.demo.Service.ExecutorTestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by jiangbin on 2019/6/1.
 */
@Service
public class ExecutorTestServiceImpl implements ExecutorTestService {
    protected static final Logger logger = LoggerFactory.getLogger(ExecutorTestServiceImpl.class);

    @Override
    @Async
    public String executeAsyncTask(String i) {
        System.out.println(i);
        return null;
    }

    @Override
    @Async
    public String executeAsyncTaskPlus(String i) {
        System.out.println(i);
        return null;
    }
}
