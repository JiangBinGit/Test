package com.example.demo.Controller;

import com.example.demo.Service.ExcelTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created by jiangbin on 2019/6/28.
 */
@RestController
public class ExcelTestController {

    @Autowired
    private ExcelTestService excelTestService;

    @RequestMapping(value="excelTest")
    public void excelTest() throws IOException {
        String excel="F:/服务APP流程.xlsx";
        excelTestService.excelTest(excel);
    }
}
