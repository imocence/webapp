<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%--静态包含 --%>
<%@ include file="/WEB-INF/views/manager/ine.jsp" %>
<script type="text/javascript">
	function addTab(url){
		layout_center_addTabFun({
			title : "123122",
			closable : true,
			iconCls : "",
			href: "<c:url value='/manager/user/index' />"
		});
	}
</script>
<div class="easyui-accordion" data-options="fit:true,border:false">
	<div title="导航菜单" data-options="isonCls:'icon-save',tools : [ {
				iconCls : 'icon-reload',
				handler : function() {
					$('#layout_west_tree').tree('reload');
				}
			}, {
				iconCls : 'icon-redo',
				handler : function() {
					var node = $('#layout_west_tree').tree('getSelected');
					if (node) {
						$('#layout_west_tree').tree('expandAll', node.target);
					} else {
						$('#layout_west_tree').tree('expandAll');
					}
				}
			}, {
				iconCls : 'icon-undo',
				handler : function() {
					var node = $('#layout_west_tree').tree('getSelected');
					if (node) {
						$('#layout_west_tree').tree('collapseAll', node.target);
					} else {
						$('#layout_west_tree').tree('collapseAll');
					}
				}
			} ]">
		<ul id="layout_west_tree"></ul>
	</div>
	<div title="系统菜单" data-options="iconCls:'icon-reload'">
		<ul id="sysTree" class="easyui-tree">  
		    <li>  
		        <span>菜单管理</span>  
		        <ul>
		        	<li><a href="#">菜单列表</a></li>
		        </ul>  
		    </li>  
		    <li>  
		        <span>权限管理</span>  
		        <ul>
		        	<li><a href="#">权限列表</a></li>
		        	<li><a href="javascript:add()">用户列表</a></li>
		        	<li><a href="<c:url value='/manager/role/list/0'/>">角色列表</a></li>
		        </ul> 
		    </li>  
		</ul> 
	</div>
</div>