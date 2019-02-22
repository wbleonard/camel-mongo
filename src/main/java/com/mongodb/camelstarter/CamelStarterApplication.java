package com.mongodb.camelstarter;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CamelStarterApplication extends RouteBuilder {

	public static void main(String[] args) {
		SpringApplication.run(CamelStarterApplication.class, args);
		System.out.println("Hello World");

		PrintBeans beans = new PrintBeans();
		beans.printBeans();
	}

	@Override
	public void configure() throws Exception {
		//from("direct:findById")
		//.to("mongodb3:mongoBean?database=flights&collection=tickets&operation=findById")
		//.to("mock:resultFindById");
	}

}
