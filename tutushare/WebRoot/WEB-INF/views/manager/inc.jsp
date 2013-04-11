<%-- 存放非指令文件 --%>
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%--静态包含 --%>
<%@ include file="/WEB-INF/views/manager/ine.jsp" %>

<%-- easyui控件 --%>
<link id="easyuiTheme" rel="stylesheet" href="<res:back value='js/easyui/themes/gray/easyui.css' />" type="text/css"></link>
<link rel="stylesheet" href="<res:back value='js/easyui/themes/icon.css' />" type="text/css"></link>
<script type="text/javascript" src="<res:back value='js/easyui/jquery-1.8.0.min.js' />"></script>
<script type="text/javascript" src="<res:back value='js/easyui/jquery.easyui.min.js' />"></script>
<script type="text/javascript" src="<res:back value='js/easyui/locale/easyui-lang-zh_CN.js' />"></script>

<%-- easyui portal插件 --%>
<link rel="stylesheet" href="<res:back value='js/easyui-portal/portal.css' />" type="text/css"></link>
<script type="text/javascript" src="<res:back value='js/easyui-portal/jquery.portal.js' />"></script>

<%-- cookie插件 --%>
<script type="text/javascript" src="<res:back value='js/jquery.cookie.js' />" charset="utf-8"></script>

<%-- --%>
<link rel="stylesheet" href="<res:back value='style/tutushare.css' />" type="text/css"></link>
<script type="text/javascript" src="<res:back value='js/tutushareUtil.js' />" ></script>