package com.test.dd;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
      private Connection con;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
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
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String sex=request.getParameter("sex");
		String question=request.getParameter("question");
		String answer=request.getParameter("answer");
		String email=request.getParameter("email");
		if(con!=null){
			try {
				String sql="insert into test(username,password,sex,question,answer,email) "+"values(?,?,?,?,?,?)";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1,username);
				ps.setString(2, password);
				ps.setString(3, sex);
				ps.setString(4, question);
				ps.setString(5, answer);
				ps.setString(6, email);
				ps.executeUpdate();
				PrintWriter out =response.getWriter();
				out.print("<h1 align='center'>");
				out.print(username+"注册成功");
				out.print("</h1>");
				out.flush();
				out.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else{
			response.sendError(500,"数据库连接错误");
		}
	}
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://139.196.222.160:3306/pg";
			con=DriverManager.getConnection(url,"root","clc123456");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
