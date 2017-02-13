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
 * Servlet implementation class CharacterEncodingFilter
 */
public class CharacterEncodingFilter extends HttpServlet implements Filter{
	private static final long serialVersionUID = 1L;
    protected FilterConfig filterConfig=null;
    protected String encoding=null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CharacterEncodingFilter() {
        super();
        // TODO Auto-generated constructor stub
    }
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.filterConfig=filterConfig;
		this.encoding=filterConfig.getInitParameter("encoding");
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest req=(HttpServletRequest) request;
		HttpServletResponse res=(HttpServletResponse) response;
		if(encoding!=null){
			req.setCharacterEncoding(encoding);
			res.setContentType("text/html;charset="+encoding);
		}
		chain.doFilter(req, res);
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		this.encoding=null;
		this.filterConfig=null;
	}
}
