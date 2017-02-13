<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1">
<title>Insert title here</title>
<link rel="stylesheet" href="js/jqueryui.css">
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jqueryui-1.10.3.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#birthday").datepicker();
	/* if($("#question").val()=="父亲生日"){
			alert("fadsf");
		} */
		
	
});
function change(value){
	//var obj=$("option").val();
	/* for(var i=0;i<obj.length;i++){
		if(obj[i]=='父亲生日'){
			alert("fda");
			}
		} */
	if(value=='父亲生日'){
		$("#answer").datepicker();
	}
	/* if(obj=='父亲生日'){
		$("#answer").datepicker();
	} */
}
</script>
</head>


<body>
	<form action="show.jsp" method="post">
		<ul style="list-style:none;line-height:30px">
			<li>姓名:<input type="text" name="name" /><br/></li>
			<li>年龄:<input type="text" name="age" /><br/></li>
			<li>出生日期:<input type="text" name="birth" id="birthday"/><br/></li>
			<li>选择密码提示问题
				<select name="question" onchange="change(this.value)">
					<option value="">请选择</option>
					<option value="父亲生日">父亲生日</option>
					<option value="电脑品牌">电脑品牌</option>
					<option value="生活的地方">生活的地方</option>
				</select>
			</li>
			<li>请输入问题答案:<input type="text" name="key" id="answer"></li>
			<li><input type="submit" value="提交" /></li>
		</ul>
	</form>
</body>
</html>