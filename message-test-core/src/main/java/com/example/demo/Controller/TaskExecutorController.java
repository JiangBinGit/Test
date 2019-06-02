package com.example.demo.Controller;

import com.example.demo.Service.ExecutorTaskService;
import com.example.demo.Service.ExecutorTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiangbin on 2019/6/1.
 */
@RestController
public class TaskExecutorController {
    @Autowired
    public ExecutorTestService service;

    @Autowired
    public ExecutorTaskService taskService;

    @RequestMapping(value = {"/taskExecutor"})
    public String taskExecutor(){
        taskService.call();
        return "this ok";
    }
}
