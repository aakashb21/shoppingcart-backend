package com.shoppingcart.shoppingcart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class ShoppingcartApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ShoppingcartApplication.class);
	}
	public static void main(String[] args) {

		SpringApplication.run(ShoppingcartApplication.class, args);
		System.out.println("Hello World !!!");
	}

}
