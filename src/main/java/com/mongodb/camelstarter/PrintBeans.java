package com.mongodb.camelstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class PrintBeans {
    @Autowired
    ApplicationContext applicationContext;

    public void printBeans() {
        System.out.println("===== My Beans =====");
        System.out.println(Arrays.asList(applicationContext.getBeanDefinitionNames()));
        System.out.println("====== Completed Spilling the Beans =====");
    }
}