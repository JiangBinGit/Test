package com.example.demo.Service.impl;

/**
 * Created by jiangbin on 2019/6/25.
 */
public class SinglePatternServiceImpl {
    private  static SinglePatternServiceImpl patternService;

    private SinglePatternServiceImpl(){

    }

    public static SinglePatternServiceImpl getPatternService() {

        if(patternService==null){
            patternService=new SinglePatternServiceImpl();
        }
        return patternService;
    }
}
