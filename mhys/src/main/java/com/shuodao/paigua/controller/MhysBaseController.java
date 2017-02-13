package com.shuodao.paigua.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shuodao.paigua.db.entity.user;

@Controller

public class MhysBaseController {

	protected static final String NAMESPACE = "mhys";

	@Autowired
	protected HttpSession session;

	@Autowired
	protected HttpServletRequest request;
	
	protected static final String USER_SESSION_KEY="user";
	protected String ftl(String ftlFileName) {
		return NAMESPACE + "/" + ftlFileName;
	}

	public user getUser(){
		return (user) session.getAttribute(USER_SESSION_KEY);
	}
 
	public String getRefererUrl() {
		return request.getHeader("referer");
	}

	
}