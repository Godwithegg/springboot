package com.danhuang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HelloController {
	
	//@ResponseBody
	@RequestMapping("/hello")
	public String Hello() {
		return "Hello World";
	}
}
