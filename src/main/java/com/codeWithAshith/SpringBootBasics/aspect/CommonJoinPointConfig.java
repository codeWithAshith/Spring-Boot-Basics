package com.codeWithAshith.SpringBootBasics.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

    @Pointcut("execution(* com.codeWithAshith.SpringBootBasics.dao.*.*(..))")
    public void dataLayerExecution(){

    }

    @Pointcut("execution(* com.codeWithAshith.SpringBootBasics.business.*.*(..))")
    public void businessLayerExecution(){

    }


}
