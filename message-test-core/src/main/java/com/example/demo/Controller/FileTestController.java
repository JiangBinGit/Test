package com.example.demo.Controller;

import com.example.demo.Service.FileTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiangbin on 2019/6/18.
 */
@RestController
public class FileTestController {

    @Autowired
    private FileTestService fileTestService;

    @RequestMapping(value = {"/fileTest"})
    public void fileTest(){

        String fileUrl="f:/新建文本文档.txt";
        fileTestService.fileTest(fileUrl);
    }
}
