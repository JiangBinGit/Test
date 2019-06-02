package com.example.demo.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.Nullable;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * Created by jiangbin on 2019/5/31.
 */
@Configuration
@EnableAsync
public class TaskExecutorConfig implements AsyncConfigurer{
    @Nullable
    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor taskExecutor=new ThreadPoolTaskExecutor();
        //线程池维护线程的最少数量
        taskExecutor.setCorePoolSize(5);
        //线程池维护线程的最大数量
        taskExecutor.setMaxPoolSize(100);
        //线程池所使用的缓冲队列
        taskExecutor.setQueueCapacity(25);
        //线程池维护线程所允许的空闲时间
        taskExecutor.setKeepAliveSeconds(30000);
        taskExecutor.initialize();
        return taskExecutor;
    }

    @Nullable
    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}
