package com.test.dd;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection conn;
    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    	super();
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
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		String name=request.getParameter("account");
		String password=request.getParameter("pwd");
		PrintWriter out=response.getWriter();
		
		if(conn!=null){
			if(name.equals("")||password.equals("")){
				out.print("<HTML>");
				out.print("<HEAD>");
				out.print("<TITLE>重新登录</TITLE>");
				out.print("<script type='text/javascript'>");
				out.print("function goback(){");
				out.print("window.location.replace('/Login.jsp')");
				out.print("}");
				out.print("</script>");
				out.print("</HEAD>");
				out.print("<BODY");
				out.print("<tr>填写的信心有误，请重新填写</tr>");
				out.print("<br><input type='button' value='返回' onclick='goback()'>");
				out.print("</BODY>");
				out.print("</HTML");
			}else{
				try {
					String sql="select * from test "+"where username=?";
					PreparedStatement st=conn.prepareStatement(sql);
					st.setString(1, name);
					ResultSet rs=st.executeQuery();
					if(rs.next()){
						String aa=rs.getString("username");
						if(!name.equals(aa)){
							out.print("it is not true");
						}else{
							out.print("您已成功登录");
							
						}
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://139.196.222.160:3306/pg";
			conn=DriverManager.getConnection(url,"root","clc123456");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
