package com.example.demo.example.impl;

import com.example.demo.example.Example;
import com.example.demo.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class FieldInjectionExample implements Example {
    /**フィールドインジェクション*/
    @Autowired
    private SomeService someService;

    /**実行*/
    @Override
    public void run(){
        someService.doService();
    }
}
