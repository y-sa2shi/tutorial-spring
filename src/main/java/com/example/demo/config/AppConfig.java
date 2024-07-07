package com.example.demo.config;

import com.example.demo.service.BusinessLogic;
import com.example.demo.service.impl.SampleLogicImpl;
import com.example.demo.service.impl.TestLogicImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "test")
    public BusinessLogic dataLogic(){
        return new TestLogicImpl();
    }

    @Bean(name = "sample")
    public BusinessLogic viewLogic(){
        return new SampleLogicImpl();
    }
}

