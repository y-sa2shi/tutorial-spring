package com.example.demo.example.impl;

import com.example.demo.example.Example;
import com.example.demo.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class ConstructorInjectionExample implements Example {
    /**フィールド*/
    private final SomeService someService;

    /**コンストラクタインジェクション*/
    @Autowired
    public ConstructorInjectionExample(SomeService someService) {
        this.someService = someService;
    }

    /**実行*/
    @Override
    public void run(){
        someService.doService();
    }
}

