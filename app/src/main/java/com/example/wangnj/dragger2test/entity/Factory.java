package com.example.wangnj.dragger2test.entity;

import javax.inject.Inject;

/**
 * Created by wang.nj on 2017/11/20.
 */

public class Factory {
    public Product product;
    @Inject
    public Factory(Product product){
        this.product = product;
    }
}
