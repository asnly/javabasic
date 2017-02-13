<#import "mhys_frame.ftl" as main>

<@main.page title="填写数据">

<div id="page-heading">
	<ol class="breadcrumb">
	<li><strong>重新填写数据</strong></li>
	</ol> 

	
</div>
<div class="container">


	<div class="row">
		<div class="col-md-12">
			<div class="panel panel-primary">
				
				<div class="panel-body">
					<form id="validate-form" class="form-horizontal" action="reinput_num" method="post" 
							data-validate="parsley" onsubmit="return $('#validate-form').parsley( 'validate' );">
						<div class="form-group">
							
							<div class="validate-block">
								<label class="col-sm-3 control-label">数字A：</label>
							    <div class="col-sm-6">
							    	 <input type="text" id="num1" name="num1" class="form-control" required="required">
							    </div>
							    
						    </div>
						</div>
						
						<div class="form-group">
							<div class="validate-block">
								<label class="col-sm-3 control-label">数字B：</label>
							    <div class="col-sm-6">
							    	<input type="text" id="num2" name="num2" class="form-control" required="required">
							    </div>
						    </div>
						</div>
						
						<#if error??&&error=="true">
					<div class="has-error">
						<ul class="help block list-unstyled"><li><i class="icon-waring-sign"></i>数字范围是1-8</li></ul>
					</div>
				</#if>
					</form>	
					
					<div class="panel-footer">
			            <div class="row">
			                <div class="col-sm-6 col-sm-offset-5">
			                    <div class="btn-toolbar">
			                        <button class="btn-primary btn" onclick="$('#validate-form').submit();">保存</button>
			                        <a href="javascript:;" onclick="history.go(-1);" class="btn btn-default">取消</a>
			                    </div>
			                </div>
			            </div>
			        </div>
					
					
				</div>
			</div>
		</div>
	</div>


</div>
</@main.page>

