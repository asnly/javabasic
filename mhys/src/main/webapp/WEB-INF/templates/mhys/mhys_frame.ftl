<#macro page title>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	<title>徘卦系统</title>
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<meta name="description" content="" />
	<meta name="author" content="" />
	
    <link href="${request.contextPath}/css/styles.min.css" rel='stylesheet' type='text/css' media="all"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    
</head>

<body class="">
 <header class="navbar navbar-inverse navbar-fixed-top" role="banner">
        <a id="leftmenu-trigger" class="pull-left" data-toggle="tooltip" data-placement="bottom" title="打开/关闭左边栏"></a>
        <div class="navbar-header pull-left">
        	<a class="navbar-brand" href="index"></a>
        </div>
        <ul class="nav navbar-nav pull-left">
        	<li class="dropdown">
        		<a href="index" class="username" ><span class="hidden-xs">后台管理</span></a>
        	</li>
        </ul>
        
        <ul class="nav navbar-nav pull-right toolbar">
        	<li class="dropdown">
        		<a href="#" class="dropdown-toggle username" data-toggle="dropdown"><#if account??>${account?html}</#if> <i class="fa fa-caret-down fa-scale"></i></a>
        		<ul class="dropdown-menu userinfo arrow">
        			<li class="username">
                        <a href="#">
        				    <div class="pull-left"><h5>您好,<#if user??>${user?html}</#if>!</h5></div>
                        </a>
        			</li>
        			<li class="userlinks">
        				<ul class="dropdown-menu">
        					<li><a href="${request.contextPath}/logout" class="text-right">退出</a></li>
        				</ui>
        			</li>
        		</ul>
        </ul>
</header>
	<div id="page-container">
		<!-- BEGIN SIDEBAR -->
		<nav id="page-leftbar" role="navigation">
			<!-- BEGIN SIDEBAR MENU -->
				<ul class="acc-menu" id="sidebar">
					<li> <a href="index"><i class="fa fa-cog"></i><span>首页</span>
					<li><a href="result_info"><i class="fa fa-cog"></i> <span>徘卦结果</span></a></li>
					</ul>
					
					
					
            <!-- END SIDEBAR MENU -->
        </nav>
        <div id="page-content">
        
	<div id='wrap'>
		<#nested>
	</div> <!--wrap -->
</div> <!-- page-content -->

</div> <!-- page-container -->
	
<script type='text/javascript' src='${request.contextPath}/js/jquery-1.10.2.min.js'></script>
<script type='text/javascript' src='${request.contextPath}/js/bootstrap.min.js'></script> 
<script type='text/javascript' src='${request.contextPath}/js/enquire.js'></script> 
<script type='text/javascript' src='${request.contextPath}/js/jquery.cookie.js'></script> 
<script type='text/javascript' src='${request.contextPath}/js/jquery.touchSwipe.min.js'></script> 
<script type='text/javascript' src='${request.contextPath}/js/jquery.nicescroll.min.js'></script>
<script type='text/javascript' src='${request.contextPath}/js/application.js'></script>

<script type='text/javascript' src='${request.contextPath}/plugins/form-toggle/toggle.min.js'></script> 
<script type='text/javascript' src='${request.contextPath}/plugins/form-parsley/parsley.min.js'></script> 
<script type='text/javascript' src='${request.contextPath}/js/formvalidation.js'></script> 

<script type='text/javascript' src='${request.contextPath}/plugins/form-datepicker/js/bootstrap-datepicker.js'></script>
<script type='text/javascript' src='${request.contextPath}/plugins/form-datepicker/js/locales/bootstrap-datepicker.zh-CN.js'></script>
</body>
</html>
</#macro>
