package com.mongodb.camelstarter;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CamelStarterRoute extends RouteBuilder {

    @Autowired
    private PrintBeans printBeans;

    @Override
    public void configure() {
        System.out.println("Hello, World!");
        printBeans.printBeans();

        from("direct:findById")
        .to("mongodb3:mongoBean?database=flights&collection=tickets&operation=findById")
        .to("mock:resultFindById");
    }
}
