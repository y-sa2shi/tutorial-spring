package com.example.demo;

import com.example.demo.service.TargetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AopSampleApplication {

    /**起動*/
    public static void main(String[] args){
        SpringApplication.run(AopSampleApplication.class, args)
                .getBean(AopSampleApplication.class).exe();
    }

    /**DI*/
    @Autowired
    private TargetService service;

    /**実行*/
    private void exe(){
        service.sayHello("Taro");
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
        service.sayGoodbye("Hana");
    }
}
