package com.shuodao.paigua.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class MhysIndexController extends MhysBaseController{
	
	
	@RequestMapping(value="/index")
	public String index(Model model){
		return ftl("index_user");
	}
}
