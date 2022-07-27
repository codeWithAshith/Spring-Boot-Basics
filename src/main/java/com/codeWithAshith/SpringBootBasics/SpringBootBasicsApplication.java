package com.codeWithAshith.SpringBootBasics;

import com.codeWithAshith.SpringBootBasics.business.Business1;
import com.codeWithAshith.SpringBootBasics.business.Business2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootBasicsApplication implements CommandLineRunner {

    @Autowired
    private Business1 business1;

    @Autowired
    private Business2 business2;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBasicsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(business1.calculateSomething());
        System.out.println(business2.calculateSomething());
    }
}
