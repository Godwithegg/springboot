package com.danhuang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * spring boot的引导类
 * @author danhuang
 *
 */
@SpringBootApplication
@EnableCaching //开启springboot对缓存的支持
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	}
}
