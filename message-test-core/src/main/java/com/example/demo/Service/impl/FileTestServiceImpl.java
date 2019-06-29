package com.example.demo.Service.impl;

import com.example.demo.Service.FileTestService;
import org.springframework.stereotype.Service;

import java.io.*;

/**
 * Created by jiangbin on 2019/6/18.
 */
@Service
public class FileTestServiceImpl implements FileTestService{
    @Override
    public void fileTest(String fileUrl) {
        String fileContent = "";
        try {
            File file=new File(fileUrl);
            InputStreamReader is= null;
            try {
                is = new InputStreamReader(new FileInputStream(file),"GBK");
                BufferedReader reader=new BufferedReader(is);
                String line;
                while ((line=reader.readLine())!=null){
                    fileContent=line+fileContent;
                }
                System.out.println("乱码"+fileContent);
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            byte[] b=new byte[500];
            int i=0;
            int index=0;
            try {
               /* while ((i=is.read())!=-1){
                    b[index]=(byte)i;
                    index++;
                }
                String s = String.valueOf(b);
                System.out.println("文件内容"+s);
                is.close();*/
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
