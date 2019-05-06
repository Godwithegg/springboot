package com.danhuang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication来标注一个主程序类，来说明这是一个springboot应用
 * @author danhuang
 *
 */
@SpringBootApplication
public class HelloWorldApplication {
	
	public static void main(String[] args) {
		//Springboot应用启动起来
		SpringApplication.run(HelloWorldApplication.class, args);
	}
}
