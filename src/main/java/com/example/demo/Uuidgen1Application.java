package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import com.example.demo.Uuidgen1Application;

@ComponentScan
@SpringBootApplication
public class Uuidgen1Application extends SpringBootServletInitializer {
	
	@Override 
	protected SpringApplicationBuilder configure(SpringApplicationBuilder uuidgen1Application) {
		return uuidgen1Application.sources(Uuidgen1Application.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Uuidgen1Application.class, args);
	}

}
	