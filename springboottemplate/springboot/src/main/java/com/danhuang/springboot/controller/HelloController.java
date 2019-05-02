package com.danhuang.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * springboot的入门案例：实现基于springboot的springmvc配置
 * @author danhuang
 *
 */
@RestController
@RequestMapping("/springmvc")
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "hello springboot";
	}
}
