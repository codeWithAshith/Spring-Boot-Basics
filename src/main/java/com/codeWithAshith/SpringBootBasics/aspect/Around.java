package com.codeWithAshith.SpringBootBasics.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

//Aop
//Configuration
@Aspect
@Configuration
public class Around {

    // execution(* PACKAGE.*.*(..))

    // Join Point
    @org.aspectj.lang.annotation.Around("execution(* com.codeWithAshith.SpringBootBasics.business.*.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        // start time
        long startTime = System.currentTimeMillis();
        // allow execution
        joinPoint.proceed();
        // end time
        long timeTake = System.currentTimeMillis() - startTime;
        System.out.println("Around Intercept calls - " + joinPoint);
        System.out.println("Time taken - " + timeTake);
    }
}
