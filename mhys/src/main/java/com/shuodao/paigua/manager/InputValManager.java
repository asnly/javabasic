package com.shuodao.paigua.manager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import com.shuodao.paigua.db.entity.inputval;
import com.shuodao.paigua.db.mapper.inputvalMapper;

@Service
public class InputValManager {
	@Resource
	private inputvalMapper inputValMapper;
	@SuppressWarnings("unused")
	private Map<String, inputval> info = new ConcurrentHashMap<String, inputval>();
	
	public inputval getInputValInfo(int id) {
		return inputValMapper.selectByPrimaryKey(id);
	}
	
	private static InputValManager inputValManager;
	public void insertInputValnInfo(inputval info) {
		inputValMapper.insert(info);
	}
	
	public List<inputval> getAllInputValInfoList() {
		return inputValMapper.selectAll();
	}
	public static InputValManager getInstance() {
		return inputValManager;
	}
	public void updateInputValInfo(inputval info)
	{
		inputValMapper.updateByPrimaryKey(info);
	}
	public void deleteInputValInfo(int id)
	{
		inputValMapper.deleteByPrimaryKey(id);
	}
//	public int countByParam(Map<String,Object> params){
//		return inputValMapper.countByParam(params);
//	}
	
	public List<inputval> getInfoByName(String name,int offset,int size){
		Map<String,Object> params =packParams(name);
		return inputValMapper.selectByUser(params, new RowBounds(offset,size));
	}
	
	public Integer getInputValListByMultiCondition(String username){
		Map<String,Object> params =packParams(username);
		return inputValMapper.selectInputValListCountByMultiCondition(params);
	}

	private Map<String, Object> packParams(String username) {
		// TODO Auto-generated method stub
		Map<String,Object> paramsMap=new HashMap<String,Object>();
		if(username!=null){
			paramsMap.put("username", username);
		}
		return paramsMap;
	}
}
