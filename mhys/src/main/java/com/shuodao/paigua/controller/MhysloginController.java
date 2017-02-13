package com.shuodao.paigua.controller;

import java.util.Date;

import java.util.Random;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shuodao.paigua.db.entity.user;

import com.shuodao.paigua.manager.RegManager;

@Controller
public class MhysloginController extends MhysBaseController {
	@Resource
	private RegManager regManager;

	Random random = new Random();

	Integer a = random.nextInt(1000) + 9000;

	@RequestMapping(value = "/")
	public String root() {
		if (getUser() != null) {
			return "redirect:index";
		} else {
			return "redirect:login";
		}
	}

	@RequestMapping(value = "/login")
	public String mhys(String account, String pwd, String form, Model model) {
		Date dt = new Date();

		user u = regManager.getuserinfoname(account);
		// if(account.equals(null)&&pwd.equals(null)){
		// return ftl("login");
		// }

		if (account != null && pwd != null) {
			if (u != null) {
				if (u.getAccount() != null || u.getPwd() != null) {
					if (!(account.equals(u.getAccount()))
							|| !(pwd.equals(u.getPwd()))) {
						model.addAttribute("error", "true");
					}
					if (account.equals(u.getAccount())
							&& (pwd.equals(u.getPwd()))) {
						session.setAttribute("user", account);
						if (form != null && form.length() > 0)
							return "redirect:" + form;
						return "redirect:index";
					}
				}
			} else {
				model.addAttribute("nullerror", "true");
			}
		}

		// if ((account != null && pwd != null)
		// && (account.equals(u.getAccount()) && (pwd.equals(u.getPwd())))) {
		// session.setAttribute("user", account);
		// if (form != null && form.length() > 0)
		// return "redirect:" + form;
		// return "redirect:index";
		// }

		model.addAttribute("lastUpdated", dt);
		model.addAttribute("from", form);
		return ftl("login");

	}

	@RequestMapping(value = "/register")
	public String reg(String account, String pwd, String pwd1, String gender,
			String from, Model model) {
		if ((account != null && gender != null && pwd != null && pwd1 != null)) {
			user u = new user();
			u.setAccount(account);
			u.setGender(gender);
			u.setPwd(pwd);
			u.setPwd1(pwd1);
			if ((u.getPwd() != null && u.getPwd1() != null)
					&& !(u.getPwd().equals(u.getPwd1()))) {
				model.addAttribute("pwderror", "true");
			} else if (u.getAccount().equals("") || u.getPwd().equals("")
					|| u.getPwd1().equals("") || u.getGender().equals("")) {
				model.addAttribute("nullerror", "true");
			} else {
				regManager.insert(u);
				model.addAttribute("user", u);
				model.addAttribute("from", from);
				return "redirect:login";
			}
		}

		return ftl("register");
	}

	@RequestMapping(value = "/logout")
	public String logout() {
		session.removeAttribute("user");
		return "redirect:login";

	}
}
