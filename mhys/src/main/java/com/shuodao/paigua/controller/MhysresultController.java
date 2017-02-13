package com.shuodao.paigua.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.shuodao.paigua.db.entity.inputval;
import com.shuodao.paigua.db.entity.user;
import com.shuodao.paigua.manager.InputValManager;
import com.shuodao.paigua.view.Pagination;

@SuppressWarnings("unused")
@Controller
public class MhysresultController extends MhysBaseController {
	@Resource
	private InputValManager inputValManager;
	private static final int PAGE_LENGTH = 5;
	private inputval inputval;
	private List<inputval> inputvalList = new ArrayList<inputval>();
	private Map<String, String> value = new HashMap<String, String>();

	// @RequestMapping(value = "/tijiao")
	// public String mhys(String from, Model model) {
	// Date dt = new Date();
	// model.addAttribute("lastUpdated", dt);
	// model.addAttribute("from", from);
	// return ftl("tijiao");
	// }

	@RequestMapping(value = "/result_info")
	public String mhysList(Integer pageNum, Model model) {

		String name = (String) session.getAttribute("user");
		if (pageNum == null)
			pageNum = 1;
		inputvalList = inputValManager.getInfoByName(name, (pageNum - 1)
				* PAGE_LENGTH, PAGE_LENGTH);
		int totalCount = inputValManager.getInputValListByMultiCondition(name);
		model.addAttribute("inputValList", inputvalList);
		model.addAttribute("pagination", new Pagination(totalCount, pageNum,
				PAGE_LENGTH));

		return ftl("result_info");

	}

	@RequestMapping(value = "/Input_edit.do")
	public String doadd(Integer inputValId, Integer a, Integer b,
			Integer index1, String ti, String yong, String hu1, String hu2,
			String bian, String from, Model model) {

		if (a > 9 || b > 9) {
			return ftl("reinput_num");
		} else {
			value = info(a, b, index1, ti, yong, hu1, hu2, bian, model);
			inputval = new inputval();
			inputval.setNum1(Integer.parseInt(value.get("num1")));
			inputval.setNum2(Integer.parseInt(value.get("num2")));
			inputval.setPosition(Integer.parseInt(value.get("index1")));
			inputval.setTi(value.get("ti"));
			inputval.setYong(value.get("yong"));
			inputval.setHu1(value.get("hu1"));
			inputval.setHu2(value.get("hu2"));
			inputval.setBian(value.get("bian"));
			inputval.setTipath(value.get("sb1"));
			inputval.setYongpath(value.get("sb2"));
			inputval.setHu1path(value.get("sb3"));
			inputval.setHu2path(value.get("sb4"));
			inputval.setBianpath(value.get("sb5"));
			inputval.setUsername(value.get("user"));
			inputValManager.insertInputValnInfo(inputval);
		}

		return "redirect:result_info";
	}

	@RequestMapping(value = "/reinput_num")
	public String reinput(Integer num1, Integer num2, Integer index1,
			String ti, String yong, String hu1, String hu2, String bian,
			String from, Model model) {

		if (num1 > 9 || num2 > 9) {
			model.addAttribute("error", "true");
			return ftl("reinput_num");
		} else {
			inputval inputval = new inputval();
			value = info(num1, num2, index1, ti, yong, hu1, hu2, bian, model);
			inputval.setNum1(Integer.parseInt(value.get("num1")));
			inputval.setNum2(Integer.parseInt(value.get("num2")));
			inputval.setPosition(Integer.parseInt(value.get("index1")));
			inputval.setTi(value.get("ti"));
			inputval.setYong(value.get("yong"));
			inputval.setHu1(value.get("hu1"));
			inputval.setHu2(value.get("hu2"));
			inputval.setBian(value.get("bian"));
			inputval.setTipath(value.get("sb1"));
			inputval.setYongpath(value.get("sb2"));
			inputval.setHu1path(value.get("sb3"));
			inputval.setHu2path(value.get("sb4"));
			inputval.setBianpath(value.get("sb5"));
			inputval.setUsername(value.get("user"));
			inputValManager.insertInputValnInfo(inputval);
		}

		return "redirect:result_info";

	}

	@RequestMapping(value = "/Input_edit")
	public String infoEdit(Integer inputValId, String action, Model model,
			RedirectAttributes attr) {

		if ("delete".equals(action)) {
			inputValManager.deleteInputValInfo(inputValId);

			return "redirect:result_info";
		}
		return "redirect:result_info";
	}

	@RequestMapping(value = "/result_edit")
	public String quotationInfo(Integer inputValId, Model model,
			RedirectAttributes attr) {
		inputval info = inputValManager.getInputValInfo(inputValId);
		model.addAttribute("InputValInfo", info);
		return ftl("result_edit");

	}

	@RequestMapping(value = "/base_info.do")
	public String doBaseInfo(Integer inputValId, Integer num1, Integer num2,
			Integer index1, String ti, String yong, String hu1, String hu2,
			String bian, String from, Model model) {
		if (num1 > 9 || num2 > 9) {
			model.addAttribute("error", "true");
			return ftl("reinput_num");
		} else {
			value = info(num1, num2, index1, ti, yong, hu1, hu2, bian, model);
			inputval inputval = inputValManager.getInputValInfo(inputValId);
			inputval.setNum1(Integer.parseInt(value.get("num1")));
			inputval.setNum2(Integer.parseInt(value.get("num2")));
			inputval.setPosition(Integer.parseInt(value.get("index1")));
			inputval.setTi(value.get("ti"));
			inputval.setYong(value.get("yong"));
			inputval.setHu1(value.get("hu1"));
			inputval.setHu2(value.get("hu2"));
			inputval.setBian(value.get("bian"));
			inputval.setTipath(value.get("sb1"));
			inputval.setYongpath(value.get("sb2"));
			inputval.setHu1path(value.get("sb3"));
			inputval.setHu2path(value.get("sb4"));
			inputval.setBianpath(value.get("sb5"));
			inputval.setUsername(value.get("user"));
			inputValManager.updateInputValInfo(inputval);
		}

		return "redirect:result_info";
	}

	public Map<String, String> info(Integer num1, Integer num2, Integer index1,
			String ti, String yong, String hu1, String hu2, String bian,
			Model model) {
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = new StringBuffer();
		StringBuffer sb4 = new StringBuffer();
		StringBuffer sb5 = new StringBuffer();
		String user = (String) session.getAttribute("user");
		String m = null;

		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int z = (num1 + num2 + hour) % 6;
		index1 = 6 - z;
		int[][] paigua = new int[][] { { 0, 0, 0 }, { 0, 0, 1 }, { 0, 1, 0 },
				{ 1, 0, 0 }, { 1, 1, 0 }, { 1, 0, 1 }, { 0, 1, 1 }, { 1, 1, 1 } };
		int[] a1 = paigua[num1 - 1];
		int[] b1 = paigua[num2 - 1];
		int[] d = new int[6];
		int[][] total = new int[5][6];
		ti = "";
		yong = "";
		hu1 = "";
		hu2 = "";
		bian = "";
		for (int i = 0; i < a1.length; i++) // 把a中所建立的数组元素导入到新数组中
		{
			d[i] = a1[i];
		}
		for (int j = 0; j < b1.length; j++) // 把b中所建立的数组元素导入到新数组中，将其添加到a数据的最后，这样形成了一个新数组
		{
			d[j + 3] = b1[j];
		}
		for (int index = 0; index < d.length; index++) // 打印出数字所代表的阴阳位置
		{
			int a2 = d[index];
		}

		model.addAttribute("index", index1);
		// 根据C在数组中的上下位置，判断体用
		if (index1 > 0 && index1 <= d.length / 2) {
			// C的位置在数组的上半部分
			// 输出体的位置
			for (int ti1 = 3; ti1 < d.length; ti1++) {

				total[0][ti1] = d[ti1];
				/*
				 * if (total[0][ti1] == 0) { model.addAttribute("a",
				 * total[0][ti1]); } else { model.addAttribute("a",
				 * total[0][ti1]); }
				 */
			}

			// 输出用的结果
			for (int yong1 = 0; yong1 < d.length / 2; yong1++) {
				total[1][yong1] = d[yong1];

			}

		} else {
			// C的位置在数组的下半部分
			// 输出体的结果
			for (int ti1 = 0; ti1 < d.length / 2; ti1++) {
				total[0][ti1] = d[ti1];
			}

			// 输出用的结果
			for (int yong1 = 3; yong1 < d.length; yong1++) {
				total[1][yong1] = d[yong1];
			}

		}
		// 输出互的结果
		for (int hu3 = 1; hu3 < d.length - 2; hu3++) {
			total[2][hu3] = d[hu3];

		}

		// 输出互的结果
		for (int hu4 = 0; hu4 < d.length - 3; hu4++) {
			total[3][hu4] = d[hu4];

		}

		// 变的实现方法

		if (index1 > 0 && index1 <= d.length / 2) {
			if (d[index1 - 1] == 0) {
				d[index1 - 1] = 1;
			} else {
				d[index1 - 1] = 0;
			}
			for (int j = 0; j < d.length / 2; j++) {
				total[4][j] = d[j];
			}

		} else {
			if (d[index1 - 1] == 0) {
				d[index1 - 1] = 1;
			} else {
				d[index1 - 1] = 0;
			}
			for (int j = 3; j < d.length; j++) {
				total[4][j] = d[j];
			}

		}

		for (int i = 0; i < total[0].length; i++) {
			if (total[0][i] == 0) {
				m = "/image/bg0.jpg";
				System.out.println(m);
				// info.setHu1Path(path3);
				sb1.append("<img src=" + "\"" + m + "\"" + "/>");
				sb1.append("<br>");

			} else {
				m = "/image/bg1.jpg";
				System.out.println(m);
				sb1.append("<img src=" + "\"" + m + "\"" + "/>");
				sb1.append("<br>");

			}

			ti += total[0][i];
		}

		for (int i = 0; i < total[1].length; i++) {
			if (total[1][i] == 0) {
				m = "/image/bg0.jpg";
				// info.setHu1Path(path3);
				System.out.println(m);
				sb2.append("<img src=" + "\"" + m + "\"" + "/>");
				sb2.append("<br>");

			} else {
				m = "/image/bg1.jpg";
				System.out.println(m);
				sb2.append("<img src=" + "\"" + m + "\"" + "/>");
				sb2.append("<br>");

			}
			yong += total[1][i];
		}
		for (int i = 0; i < total[2].length; i++) {
			if (total[2][i] == 0) {
				m = "/image/bg0.jpg";
				System.out.println(m);
				// info.setHu1Path(path3);
				sb3.append("<img src=" + "\"" + m + "\"" + "/>");
				sb3.append("<br>");

			} else {
				m = "/image/bg1.jpg";
				System.out.println(m);
				sb3.append("<img src=" + "\"" + m + "\"" + "/>");
				sb3.append("<br>");

			}
			hu1 += total[2][i];
		}
		for (int i = 0; i < total[3].length; i++) {
			if (total[3][i] == 0) {
				m = "/image/bg0.jpg";
				// info.setHu1Path(path3);
				System.out.println(m);
				sb4.append("<img src=" + "\"" + m + "\"" + "/>");
				sb4.append("<br>");

			} else {
				m = "/image/bg1.jpg";
				System.out.println(m);
				sb4.append("<img src=" + "\"" + m + "\"" + "/>");
				sb4.append("<br>");

			}
			hu2 += total[3][i];
		}
		for (int i = 0; i < total[4].length; i++) {
			if (total[4][i] == 0) {
				m = "/image/bg0.jpg";
				// info.setHu1Path(path3);
				System.out.println(m);
				sb5.append("<img src=" + "\"" + m + "\"" + "/>");
				sb5.append("<br>");

			} else {
				m = "/image/bg1.jpg";
				System.out.println(m);
				sb5.append("<img src=" + "\"" + m + "\"" + "/>");
				sb5.append("<br>");

			}
			bian += total[4][i];
		}
		value.put("num1", num1.toString());
		value.put("num2", num2.toString());
		value.put("index1", index1.toString());
		value.put("ti", ti);
		value.put("yong", yong);
		value.put("hu1", hu1);
		value.put("hu2", hu2);
		value.put("bian", bian);
		value.put("sb1", sb1.toString());
		value.put("sb2", sb2.toString());
		value.put("sb3", sb3.toString());
		value.put("sb4", sb4.toString());
		value.put("sb5", sb5.toString());
		value.put("user", user);
		return value;

	}
}
