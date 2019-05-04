package com.danhuang.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danhuang.domain.User;
import com.danhuang.service.IUserService;

/**
 * 用户的控制器
 * 
 * @author danhuang
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;

	@RequestMapping("/findAll/{name}")
	public List<User> findAllUser(@PathVariable("name") String name) {
		List<User> users = userService.findAllUser(name);
		return users;
	}
	
	@RequestMapping("/findAll")
	public List<User> findAll() {
		List<User> users = userService.findAll();
		return users;
	}
}
