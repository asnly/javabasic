<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
</head>
<body>
<form action="Register" method="post" onsubmit="return reg(this);">
	<table align="center" border="0" width="500">
		<tr>
			<td align="right" width="30%">用户名</td>
			<td><input type="text" name="username" class="box"></td>
		</tr>
		<tr>
			<td align="right">密码</td>
			<td><input type="password" name="password" class="box"></td>
		</tr>
		<tr>
			<td align="right">确认密码</td>
			<td><input type="password" name="repassword" class="box"></td>
		</tr>
		<tr>
			<td align="right">性别</td>
			<td>
				<input type="radio" name="sex" value="male" checked="checked">男
				<input type="radio" name="sex" value="female">女
			</td>
		</tr>
		<tr>
			<td align="right">密码找回问题</td>
			<td><input type="text" name="question" class="box"></td>
		</tr>
		<tr>
			<td align="right">密码找回答案</td>
			<td><input type="text" name="answer" class="box"></td>
		</tr>
		<tr>
			<td align="right">邮箱</td>
			<td><input type="text" name="email" class="box"></td>
		</tr>
		<tr>
			<td colspan="2" align="center" height="40">
				<input type="submit" value="注册">
				<input type="reset" value="重置">
			</td>
		</tr>
	</table>
</form>
</body>
</html>