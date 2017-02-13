package com.test.dd.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CountFilter
 */
public class CountFilter extends HttpServlet implements Filter{
	private static final long serialVersionUID = 1L;
    protected FilterConfig filterConfig=null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CountFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
		this.filterConfig=filterConfig;
		//this.count=(Integer) context.getAttribute("counter");
		
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		ServletContext context=filterConfig.getServletContext();
		Integer count=(Integer)context.getAttribute("counter");
		if(count==null){
			count=1;
			context.setAttribute("counter", count);
		}else{
			context.setAttribute("counter", count+1);
		}
		chain.doFilter(request, response);
	}

}
