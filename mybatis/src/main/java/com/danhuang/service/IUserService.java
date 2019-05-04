package com.danhuang.service;

import java.util.List;

import com.danhuang.domain.User;

/**
 * 用户的业务层接口
 * @author danhuang
 *
 */
public interface IUserService {
	
	/**
	 * 根据名称查询所有用户
	 * @return
	 */
	List<User> findAllUser(String name);
	/**
	 * 查询所有用户
	 */
	List<User> findAll();
}
