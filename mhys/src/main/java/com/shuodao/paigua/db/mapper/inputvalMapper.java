package com.shuodao.paigua.db.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import com.shuodao.paigua.db.entity.inputval;

public interface inputvalMapper {
    int deleteByPrimaryKey(Integer id);

	int insert(inputval record);

	int insertSelective(inputval record);

	inputval selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(inputval record);

	int updateByPrimaryKey(inputval record);
    
    List<inputval> selectByUser(Map<String,Object> params,RowBounds rowbounds);
    
    List<inputval> selectAll();
    
    int selectInputValListCountByMultiCondition(Map<String,Object>params);
}