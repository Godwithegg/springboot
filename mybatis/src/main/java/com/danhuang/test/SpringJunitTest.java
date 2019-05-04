package com.danhuang.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.danhuang.Application;
import com.danhuang.domain.User;
import com.danhuang.service.IUserService;

/**
 * springboot整合junit
 * @author danhuang
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)	//属性：用于指定引导类
public class SpringJunitTest {
	
	@Autowired
	private IUserService userService;
	@Test
	public void testFindAll() {
		List<User> list = userService.findAll();
		System.out.println(list);
	}
	
	@Resource
	private Environment env;
	@Test
	public void testReadSpringBootConfig() {
		System.out.println(env.getProperty("spring.jpa.database"));
	}
}
