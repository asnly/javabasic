package com.shuodao.paigua.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class UserAuthInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {

		String from = request.getServletPath();
		
		String uri = request.getRequestURI();
		if (isIgnoredUri(uri) || "/mhys/".equals(from)||"/mhys/register.do".equals(from)) {
			return true;
		}
		
		Object obj = request.getSession().getAttribute("user");
		if (obj == null) {
			String path = request.getContextPath() + "/mhys/login";
			String queryStr = request.getQueryString();
			if (!StringUtils.isEmpty(queryStr)) {
				from = from + "?" + queryStr;
			}
			
			response.sendRedirect(path + "?from=" + from);
			return false;
		}
		return true;
	}

	protected boolean isIgnoredUri(String uri) {
		return uri.matches(".+(?i)(login|logout|400|403|404|500)+");
	}

	protected boolean isIndexUri(String uri) {
		return uri.matches(".+(?i)(index)+");
	}
}
