package com.codeWithAshith.SpringBootBasics.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAspect {

    @AfterReturning(value= "execution(* com.codeWithAshith.SpringBootBasics.business.*.*(..))",
    returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        // Advice
        System.out.println("After Intercept calls - " + joinPoint);
        System.out.println("After Intercept calls - " + result);
    }

    @After(value= "execution(* com.codeWithAshith.SpringBootBasics.business.*.*(..))")
    public void after(JoinPoint joinPoint) {
        // Advice
        System.out.println("After Intercept calls - " + joinPoint);
    }

}
