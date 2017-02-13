package com.shuodao.paigua.manager;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shuodao.paigua.db.entity.user;
import com.shuodao.paigua.db.mapper.userMapper;
@Service
public class RegManager {
	@Resource
	private userMapper userMapper;
	private static RegManager regManager;
	
	public List<user> getAlluserList(){
		return userMapper.selectAll();
	}
	public void insert(user info){
		userMapper.insert(info);
	}
	public user getuserinfo(Integer uid){
		return userMapper.selectByPrimaryKey(uid);
	}
	
	public user getuserinfoname(String account){
		return userMapper.selectByName(account);
	}
	public static RegManager getInstance(){
		return regManager;
		
	}
	
}
