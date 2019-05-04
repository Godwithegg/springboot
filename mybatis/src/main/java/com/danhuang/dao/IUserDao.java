package com.danhuang.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.danhuang.domain.User;

/**
 * 用户的持久层接口
 * @author danhuang
 *
 */
@Repository("userDao")
public interface IUserDao extends JpaRepository<User, Long>{
	
	
}
