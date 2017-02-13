<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%request.setCharacterEncoding("UTF-8");
response.setContentType("text/html; charset=UTF-8");
%>
</head>
<body>
<ul style="list-style:none;line-height:30px">
	<li>用户姓名:<%=new String(request.getParameter("name").getBytes("ISO-8859-1"),"UTF-8") %></li>
	<li>年龄:<%=new String(request.getParameter("age").getBytes("ISO-8859-1"),"UTF-8") %></li>
	<li>出生日期:<%=new String(request.getParameter("birth").getBytes("ISO-8859-1"),"UTF-8") %></li>
	<li>密码答案:<%=new String(request.getParameter("key").getBytes("ISO-8859-1"),"UTF-8")%></li>
</ul>
</body>
</html>