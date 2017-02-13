package com.shuodao.paigua.db.mapper;

import java.util.List;

import com.shuodao.paigua.db.entity.user;

public interface userMapper {
    int deleteByPrimaryKey(Integer id);

	int insert(user record);

	int insertSelective(user record);

	user selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(user record);

	int updateByPrimaryKey(user record);
    List<user> selectAll();
    
    user selectByName(String name);
}