package com.example.demo.Service;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by jiangbin on 2019/5/29.
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AspectService {
    String name();
}
