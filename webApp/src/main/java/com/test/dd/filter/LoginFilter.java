package com.test.dd.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class LoginFilter
 */
public class LoginFilter extends HttpServlet implements Filter {
	protected String name=null;
	protected FilterConfig filter=null;
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.filter=filterConfig;
		this.name=filterConfig.getInitParameter("account");
	}

	

	public void destroy() {
		// TODO Auto-generated method stub
		this.filter=null;
		this.name=null;
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest) request;
		HttpServletResponse res=(HttpServletResponse) response;
		String url=req.getRequestURI();
		if(name==null||name.equals("")){
			if(url!=null&&!url.equals("")&&(url.indexOf("Login")<0&&url.indexOf("login")<0)&&url.indexOf("Reg")<0){
				res.sendRedirect("Login.jsp");
				return;
			}
			
		}
		chain.doFilter(req,res);
	}
}
