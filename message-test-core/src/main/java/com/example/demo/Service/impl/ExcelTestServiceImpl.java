package com.example.demo.Service.impl;

import com.example.demo.Service.ExcelTestService;
import org.apache.poi.xssf.usermodel.*;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by jiangbin on 2019/6/28.
 */
@Service
public class ExcelTestServiceImpl implements ExcelTestService{
    @Override
    public void excelTest(String excelFile) throws IOException {
        //创建文件输入流
        FileInputStream fis=new FileInputStream(excelFile);
        //由输入流对象得到工作对象
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        //获取第一个sheet
        XSSFSheet xs=wb.getSheetAt(0);
        //获取表格最后一行行数
        int lastIndex = xs.getLastRowNum();
        for(int i=1;i<=lastIndex;i++){
            System.out.println();
            //获取每一行
            XSSFRow row=xs.getRow(i);
            //获取列数
            int columnNum=row.getLastCellNum();
            for(int j=0;j<columnNum;j++){
                XSSFCell cell = row.getCell(j);
//                double numericCellValue = cell.getNumericCellValue();
                String stringCellValue = cell.getStringCellValue();
                System.out.print(stringCellValue);
            }
        }
    }
}
