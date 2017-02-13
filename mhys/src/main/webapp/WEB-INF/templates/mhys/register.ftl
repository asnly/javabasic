<#import "mhys_frame.ftl" as main>

<@main.page title="注册信息">
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="panel panel-primary">
					<div class="panel-body">
						<form action="register.do" id="validate-form" class="form-horizontal"  method="post" 
						data-validate="parsley" onsubmit="return $('#validate-form').parsley('validate');">
						<input type="hidden" name="from" value="${from!}" />
						<div class="form-group">
							<div class="validate-block">
								<label class="col-sm-2 control-label">用户名:</label>
								<div class="col-sm-2">
										<input type="text" id="account" class="form-control" name="account" requird="requird">
										
								</div>
							</div>
						</div>
						<hr>
						<div class="form-group">
							<div class="validate-block">
								<label class="col-sm-2 control-label">密码:</label>
								<div class="col-sm-2">
									<input type="password" id="pwd" class="form-control" name="pwd" requird="requird">
									
								</div>
							</div>
						</div>
					<hr>
					<div class="form-group">
						<div class="validate-block">
							<label class="col-sm-2 control-label">确认密码:</label>
							<div class="col-sm-2">
								<input type="password" id="pwd1" class="form-control" name="pwd1" requird="requird"
								>
							</div>
							
						</div>
					</div>
					<#if pwderror??&&pwderror=="true">
						<div class="has-error">
							<ul class="help-block list-unstyled"><li><i class="icon-waring-sign"></i>两次密码输入不一致</li></ul>
						</div>
					</#if>
					<hr>
					<div class="form-group">
						<div class="validate-block">
							<label class="col-sm-2 control-label">性别:</label>
							
								<label><input type="radio" checked="checked" name="gender" value="male" />
								男</label>
								<label><input type="radio" name="gender" value="female" />
								女</label>
							
						</div>
					</div>
					
					<hr>
					<#if nullerror??&&nullerror=="true">
						<div class="has-error">
							<ul class="help-block list-unstyled"><li><i class="icon-waring-sign"></i>信息不能为空</li></ul>
						</div>
					</#if>
					<div class="row">
						<div class="col-sm-6 col-sm-offset-5">
							<div class="btn-toolbar">
			                        <button class="btn-primary btn" onclick="$('#validate-form').submit()">完成</button>
			                        <input type="button"  class="btn btn-green" onclick=" javascript:window.location.href='login.do' " value="返回" ／>
			                 </div>
						</div>
					</div>
					</form>
					
				</div>
			</div> 
		</div>
	</div>
</@main.page>
