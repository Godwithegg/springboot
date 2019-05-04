package com.danhuang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.danhuang.dao.IUserDao;
import com.danhuang.dao.IUserMapper;
import com.danhuang.domain.User;
import com.danhuang.service.IUserService;

/**
 * 用户的业务层实现类
 * @author danhuang
 *
 */
@Service("userService")
public class UserServiceImpl implements IUserService{

//	@Autowired
//	private IUserDao userDao;//springdata jpa 实现
	
	@Autowired
	private IUserMapper userMapper;
	@Override
	public List<User> findAllUser(String name) {
		return userMapper.findUserByName(name);
	}
	@Override
	@Cacheable(value="findAllCache",key="'user.findAll'")	//表示当前方法使用缓存并存入redis数据库中
				//value属性：表示存入redis数据库的key
				//key属性：用于指定方法执行返回值的key，该属性是spring用的，不写也有默认值
	public List<User> findAll() {
		System.out.println("执行取数据库查询");
		return userMapper.findAll();
	}
	
	
}
