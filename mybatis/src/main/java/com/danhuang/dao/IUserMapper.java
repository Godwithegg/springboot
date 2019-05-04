package com.danhuang.dao;

import java.util.List;

import javax.persistence.MappedSuperclass;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.danhuang.domain.User;

/**
 * 使用mybatis实现对数据库的操作接口
 * @author danhuang
 *
 */
@Mapper	//要求mybatis版本3.3及以上
public interface IUserMapper {
	
	@Select("select * from user where name like '%${value}%'")
	public List<User> findUserByName(String name);

	@Select("select * from user")
	public List<User> findAll();
}
