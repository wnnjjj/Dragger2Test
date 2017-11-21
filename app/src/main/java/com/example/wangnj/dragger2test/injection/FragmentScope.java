package com.example.wangnj.dragger2test.injection;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by wang.nj on 2017/11/21.
 */
@Scope
@Documented
@Retention(value = RetentionPolicy.RUNTIME)
public @interface FragmentScope{}

