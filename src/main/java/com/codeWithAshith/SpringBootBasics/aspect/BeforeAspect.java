package com.codeWithAshith.SpringBootBasics.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

//Aop
//Configuration
@Aspect
@Configuration
public class BeforeAspect {

    //execution(* PACKAGE.*.*(..))

    @Before("execution(* com.codeWithAshith.SpringBootBasics.business.*.*(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("Before Intercept calls - " + joinPoint);
    }
}
