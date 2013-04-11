<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>tutushare</title>
<%--
	<jsp:include page=""/> 动态导入指令
	<jsp:directive.include file=""/>、<%@ include file=""/>静态导入指令
	静态的include指令，可以将一个外部文件嵌入到当前jsp文件中，同时解析这个页面 中的jsp语句（如果有的话）。
	即：会把目标页面的其他编译指令也包含进来
	静态的include指令会将被包含的页面加入本页面，融合成一个页面，因此被包含的页面甚至不需要是一个完整的页面。
	如果被嵌入的文件经常需要改变，建议使用<jsp:include>操作指令。
	静态导入和动态导入的区别：
		1、静态导入时价格呗导入页面的代码完全融入，两个页面融合成一个整体servlet；而动态导入则在servlet中使用
		include方法来引入被导入页面的内容。
		2、静态导入时被导入页面的编译指令会起作用；而动态导入时被导入页面的编译指令则失去作用，只是插入被导入页面的body内容。
		3、动态包含还可以增加额外的参数。
 --%>
<jsp:directive.include file="/WEB-INF/views/manager/inc.jsp" />
</head>

<%-- 整个页面的布局   --%>
<body class="easyui-layout">
	<div data-options="region:'north',href:'<c:url value="/manager/layout/north" />'" style="height: 60px;overflow: hidden;" class="logo"></div>
	<div data-options="region:'west',title:'功能导航',href:'<c:url value="/manager/layout/west" />'" style="width: 200px;overflow: hidden;"></div>
	<div data-options="region:'center',title:'欢迎使用tutushare系统',href:'<c:url value="/manager/layout/center" />'" style="overflow: hidden;"></div>
	<div data-options="region:'east',title:'日历',href:'<c:url value="/manager/layout/east" />', split:true" style="width: 200px;overflow: hidden;"></div>
	<div data-options="region:'south',href:'<c:url value="/manager/layout/south" />'" style="height: 27px;overflow: hidden;"></div>
</body>

</html>