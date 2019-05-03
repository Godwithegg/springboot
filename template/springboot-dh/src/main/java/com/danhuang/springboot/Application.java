package com.danhuang.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot的启动类（引导类）
 * @author danhuang
 *
 */
@SpringBootApplication 
//表明当前类是springboot的引导类
public class Application {
	public static void main(String[] args) {
		System.out.println("启动springboot");
		
		SpringApplication.run(Application.class, args);
//以下代码可以去掉吉祥物
//		SpringApplication application = new SpringApplication(Application.class);
//		application.setBannerMode(Mode.OFF);
//		application.run(args);
	}
}
