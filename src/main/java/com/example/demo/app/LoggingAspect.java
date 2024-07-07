package com.example.demo.app;

import lombok.Data;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Aspect
@Component
public class LoggingAspect {

//    @Before("execution(* com.example.demo.service.TargetService.*(..))")
    public void beforeAdvice(JoinPoint joinPoint){
        LocalDateTime startTime = LocalDateTime.now();
        String formattedTime = startTime.format(DateTimeFormatter.ofPattern("HH:mm:ss:SSS"));
        System.out.println("---------[@Before]-----------");
        System.out.println("Before method:"+ joinPoint.getSignature());
        System.out.println("method start:"+ formattedTime);
    }

//    @After("execution(* com.example.demo.service.TargetService.*(..))")
    public void afterAdvice(JoinPoint joinPoint){
        LocalDateTime endTime = LocalDateTime.now();
        String formattedTime = endTime.format(DateTimeFormatter.ofPattern("HH:mm:ss:SSS"));
        System.out.println("---------[@After]-----------");
        System.out.println("After method:"+ joinPoint.getSignature());
        System.out.println("method start:"+ formattedTime);
    }

    @Around("execution(* com.example.demo.service.TargetService.*(..))")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable{
        long startTime = System.currentTimeMillis();
        System.out.println("=========[@Around:before]==========");
        System.out.println("[//] Target");
        System.out.println("Class : " + joinPoint.getSignature().getDeclaringTypeName());
        System.out.println("Method : " + joinPoint.getSignature().getName());

        Object result = joinPoint.proceed();

        System.out.println("=========[@Around:after]==========");
        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("Method execution time: " + elapsedTime + "ms");

        return result;

    }
}
