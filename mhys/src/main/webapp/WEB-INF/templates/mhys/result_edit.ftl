<#import "mhys_frame.ftl" as main>


<@main.page title="修改数据">
<div id="page-heading">
	<ol class="breadcrumb">
		<li> <strong>修改数据</strong></li>
	</ol>
</div>
	 
<div class="container">
	<div class="row">
		<div class="col-md-12">
			<div class="panel panel-primary">
				<div class="panel-body">
				
				<form id="validate-form" class="form-horizontal" action="base_info.do" method="post" 
						data-validate="parsley" onsubmit="return $('#validate-form').parsley( 'validate' );">
					  <div class="form-group">
						<#if InputValInfo??>
							<input type="hidden" name="inputValId" value="#{InputValInfo.id}">
						</#if>	
							<div class="validate-block">
								<label class="col-sm-2 control-label">数字A：</label>
							    <div class="col-sm-2"> 
							  		   <input type="text" id="num1" class="form-control" name="num1" required= "required"  <#if InputValInfo??&&InputValInfo.num1??>value="${InputValInfo.num1}"</#if>>
							    </div>
							    
							</div>
					  </div>
					  <hr>
					  <div class="form-group">
					  	 	<div class="validate-block">
									<label class="col-sm-2 control-label">数字B：</label>
							   	 <div class="col-sm-2">
							     	  <input type="text" id="num2 "name="num2"  required= "required" class="form-control"    <#if InputValInfo??&& InputValInfo.num2??>value="${InputValInfo.num2?html}"</#if>/>
							   	 </div>
						 	</div>
						 	</div>
						 </form>
						 <div class="row">
			                <div class="col-sm-6 col-sm-offset-5">
			                    <div class="btn-toolbar">
			                        <button class="btn-primary btn" onclick="$('#validate-form').submit();">保存</button>
			                    
			                    </div>
			                </div>
			            </div>
				</div>
			</div>
		</div>
	</div>
</div>
</@main.page>
