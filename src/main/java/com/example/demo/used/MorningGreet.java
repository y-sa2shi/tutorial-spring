package com.example.demo.used;

import org.springframework.stereotype.Component;

@Component
public class MorningGreet implements Greet{
    @Override
    public String greeting(){
        return "Good Morning";
    }
}

