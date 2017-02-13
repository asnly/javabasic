<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	<title>徘卦系统后台</title>
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<meta name="description" content="" />
	<meta name="author" content="" />
	<link href="${request.contextPath}/css/styles.min.css" rel='stylesheet' type='text/css' />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<script type="text/javascript" src="${request.contextPath}/js/jquery.js"></script>
	<script type="text/javascript">
		$(function(){
			$("#btn1").bind('click',function(){
			window.location.href="register.do";
			})
				
		})
		
	</script>
 </head>
 
<bodyclass="focusedform">
<div class="verticalcenter">
	<div class="panel panel-orange">
		<form action="login" method="post" class="form-horizontal" style="margin-bottom: 0px !important;">
		<div class="panel-body">
			<h4 class="text-center" style="margin-bottom: 25px;">徘卦系统后台</h4>
				
				<input type="hidden" name="from" value="${from!}" />
				<div class="form-group">
				
				
					<div class="col-sm-12">
						<div class="input-group">
							<label>请输入账号</label>
							<input type="text" class="form-control" name="account" id="account"/>
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-12">
						<div class="input-group">
							<label>请输入密码</label>
							<input type="password" class="form-control" name="pwd" id="account"/>
						</div>
					</div>
				</div>
				
				<#if error??&&error=="true">
					<div class="has-error">
						<ul class="help-block list-unstyled"><li><i class="icon-waring-sign"></i>账号/密码错误</li></ul>
					</div>
				</#if>
				<#if nullerror??&&nullerror=="true">
					<div class="has-error">
						<ul class="help-block list-unstyled"><li><i class="icon-waring-sign"></i>账号不存在</li></ul>
					</div>
				</#if>
				
				
			
			<#if lastUpdated??>${lastUpdated?string("yyyy-MM-dd HH:mm:ss")}</#if>

			<div >
			<div class="panel-footer">
				
				<div class="pull-right">
					<input type="submit" class="btn btn-green" id="bt2" value="登陆">
					<input type="button" class="btn btn-primary" id="btn1" name="btn1" value="注册">
				</div>
				
			</div>
		</form>
		
	</div>
 </div>
      
</body>
</html>

