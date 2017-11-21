package com.example.wangnj.dragger2test.entity;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by wang.nj on 2017/11/20.
 */
@Singleton
public class Factory {
    public Product product;
    @Inject
    public Factory(Product product){
        this.product = product;
    }
}
