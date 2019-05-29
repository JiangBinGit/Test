package com.example.demo.Aspect;

import com.example.demo.Service.AspectService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.logging.Logger;

/**
 * Created by jiangbin on 2019/5/29.
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut("execution(public * com.example.demo.RedisUtil.RedisUtil.*(..))")
    public void aspect(){}
    @Before("aspect()")
    public void before(JoinPoint joinPoint){
        MethodSignature signature= (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        AspectService annotation = method.getAnnotation(AspectService.class);
        System.out.print("拦截式注解"+annotation.name());


    }
}
