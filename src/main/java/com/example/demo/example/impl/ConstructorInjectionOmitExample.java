package com.example.demo.example.impl;

import com.example.demo.example.Example;
import com.example.demo.service.SomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ConstructorInjectionOmitExample implements Example {

    /**フィールド*/
    private final SomeService someService;

    /**実行*/
    @Override
    public void run(){
        someService.doService();
    }
}
