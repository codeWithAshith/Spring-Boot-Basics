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

    // execution(* PACKAGE.*.*(..))

    // Join Point - Specific intersection
    // Aspect - combination od join point & advice
    // Weaving - process of implementing Aop around method calls
    // Weaver - the framework which implements is called Weaver

    // Join Point
    @Before("execution(* com.codeWithAshith.SpringBootBasics.business.*.*(..))")
    public void before(JoinPoint joinPoint) {
        // Advice
        System.out.println("Before Intercept calls - " + joinPoint);
    }
}
