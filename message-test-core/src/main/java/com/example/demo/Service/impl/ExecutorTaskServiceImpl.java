package com.example.demo.Service.impl;

import com.example.demo.Executor.TaskExecutorConfig;
import com.example.demo.Service.ExecutorTaskService;
import com.example.demo.Service.ExecutorTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Service;

import java.util.concurrent.Executor;

/**
 * Created by jiangbin on 2019/6/1.
 */
@Service
public class ExecutorTaskServiceImpl implements ExecutorTaskService
{
    @Autowired
    public TaskExecutorConfig executorConfig;

    @Autowired
    private TaskExecutor taskExecutor;


    @Autowired
    public ExecutorTestService testService;


    @Override
    public void call() {


      /*  taskExecutor.execute(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    testService.executeAsyncTask("系统1："+i);
                    testService.executeAsyncTaskPlus("系统2："+i);
                }
            }
        });*/


        Executor asyncExecutor = executorConfig.getAsyncExecutor();
        asyncExecutor.execute(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<100;i++){
                    testService.executeAsyncTaskPlus("线程池1："+i);
                    testService.executeAsyncTask("线程池2："+i);
                }
            }
        });

    }
}
