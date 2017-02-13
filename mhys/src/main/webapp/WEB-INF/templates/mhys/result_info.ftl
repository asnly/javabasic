<#import "mhys_frame.ftl" as main>
<#import "pagination.ftl" as pager>
<@main.page title="填写报价单">
<#assign filterUrl>
</#assign>
<script type="text/javascript" src="${request.contextPath}/js/jquery.js"></script>
<script type="text/javascript">
function del(){
return window.confirm("你确定要删除吗?");

}
$(function(){
	$("#btn").bind('click',function(){
		var a=$("#a").val();
		var b=$("#b").val();
		if(parseInt(a)>8||parseInt(b)>8){
			alert("请输入1-8的数字");
		}
		
		
	})
})
</script>
	<div class="container">
	<div class="row">
		<div class="col-md-12">
		<div class="panel panel-white">
 	
		<div class="panel-body">
			
				<p style="float:left">
						 <a id="btntext" type="button" value="添加数据" class="btn btn-success btn-sm" data-toggle="modal" data-target="#myModal" ><i class="fa fa-pencil"></i> 添加数据</a>
					</p>
				<table class="table table-condensed" id="tab">
					<thead>
					    <tr>
					      <th style="width:110px">数字A</th>
					      <th style="width:110px" >数字B</th>
					      <th style="width:120px">C所在位置</th>
					      <th style="width:5%"  >体</th>
					      <th style="width:8%"  >体卦</th>
					      <th style="width:5%" >用</th>
					       <th style="width:8%"  >用卦</th>
					      <th style="width:5%" >互</th>
					      <th style="width:8%"  >互卦1</th>
					      <th style="width:5%">互</th>
					      <th style="width:8%"  >互卦2</th>
					      <th style="width:5%">变</th>
					      <th style="width:8%"  >变卦</th>
					      <th style="width:5%" >操作</th>
					    </tr>
					  </thead>
					  <tbody>
					  		<#if inputValList?exists>
					  			<#list inputValList as InputVal>
					  		<#if InputVal??>
					  			 <tr>
					  			 <td id ="p#{InputVal.id}"><#if InputVal.num1??>${InputVal.num1?html}</#if></td>
								<td id ="n#{InputVal.id}"><#if InputVal.num2??>${InputVal.num2?html}</#if></td>
								<td><#if InputVal.position??>${InputVal.position?html}</#if></td>
								<td><#if InputVal.ti??>${InputVal.ti?html}</#if></td>
								<td><#if InputVal.tipath??>${InputVal.tipath}</#if>
								</td>
								<td><#if InputVal.yong??>${InputVal.yong?html}</#if></td>
								<td><#if InputVal.yongpath??>${InputVal.yongpath}</#if>
								
								<td><#if InputVal.hu1??>${InputVal.hu1?html}</#if></td>
								<td><#if InputVal.hu1path??>${InputVal.hu1path}</#if>
								
								</td>
								<td><#if InputVal.hu2??>${InputVal.hu2?html}</#if></td>
								<td><#if InputVal.hu2path??>${InputVal.hu2path}</#if>
								
								</td>
								<td><#if InputVal.bian??>${InputVal.bian?html}</#if></td>
								<td><#if InputVal.bianpath??>${InputVal.bianpath}</#if>
								
								</td>
								
								
				
				<td><a href="result_edit?inputValId=#{InputVal.id}" class="btn btn-success btn-sm"><i class="fa fa-sign-in"></i>修改</a></td>
				<td><a href="Input_edit?action=delete&inputValId=#{InputVal.id}" onclick="return del();" class="btn btn-default btn-sm"><i class="fa fa-times"></i></a></td>
				
				</tr>
					  		</#if>
					  		
					  		</#list>
					  		</#if>
					  		
					 
					  </tbody>
				
				</table>
			<#assign currentUrl>result_info?_t=1${filterUrl!}&</#assign>
				<@pager.pageul pagination=pagination url="${currentUrl}" />
				
			</div>
			
			
			
			</div>

		</div>
</div>
</div>
	
		
	</div>
	<!-- 模态框（Modal） 添加报价单-->

<div class="modal fade" id="myModal" tabindex="-1" role="dialog" 
   aria-labelledby="myModalLabel" aria-hidden="true">
   <div class="modal-dialog">
      <div class="modal-content">
         <div class="modal-header">
            <button type="button" class="close" 
               data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>
            <h4 class="modal-title" id="myModalLabel">
               添加数据
            </h4>
         </div>
        	 <div class="modal-body">
        		<form id="validate-form" class="form-horizontal" action="Input_edit.do" method="post" 
							data-validate="parsley" onsubmit="return $('#validate-form').parsley( 'validate' );">
						<div class="form-group">
							<#if InputVal??>
							<input type="hidden" name="id" value=#{InputVal.id}>
							</#if>	
							<#if error??&&error=="true">
					<div class="has-error">
						<ul class="help block list-unstyled"><li><i class="icon-waring-sign"></i>账号/密码错误</li></ul>
					</div>
				</#if> 				
							<div class="validate-block">
								<label class="col-sm-3 control-label">数字A：</label>
							    <div class="col-sm-6">
							    	  <input type="text" id="a" name="a" class="form-control" required="required">
							    </div>
						    </div>
						</div>						
						<div class="form-group">
							<div class="validate-block">
								<label class="col-sm-3 control-label">数字B：</label>
							    <div class="col-sm-6">
							    	<input type="text" id="b" name="b" class="form-control" required="required">
							    </div>
						    </div>
						</div>
					</form>	
       		  </div>
         	  <div class="modal-footer">
           		 <button type="button" class="btn btn-default" 
              	 data-dismiss="modal">关闭
           		 </button>
             <button class="btn-primary btn" id="btn" onclick="$('#validate-form').submit();">保存</button>
             
			             	</div>
         </div>
      </div><!-- /.modal-content -->
</div><!-- /.modal -->

</@main.page>

			            





