package com.example.demo;

import com.example.demo.service.BusinessLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaConfigSampleApplication {

    /**起動メソッド*/
    public  static void main(String[] args){
        SpringApplication.run(JavaConfigSampleApplication.class, args)
                .getBean(JavaConfigSampleApplication.class).exec();
    }

    /**DI*/
    @Autowired
    @Qualifier("test")
    private BusinessLogic business1;

    /**DI*/
    @Autowired
    @Qualifier("sample")
    private BusinessLogic business2;

    private void exec() {
        business1.doLogic();
        business2.doLogic();
    }
}
