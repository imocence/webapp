package com.tutushare.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.tutushare.entity.user.Role;
import com.tutushare.service.RoleService;

public class QueryRoleTag extends SimpleTagSupport{

	private Long roleId;
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	
	
	public void doTag() throws JspException, IOException {
		//获取当前 ctx
		ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(((PageContext)getJspContext()).getServletContext());
		RoleService roleService = (RoleService)ctx.getBean("roleService");
		if(roleId==null)
			return;
		Role role = roleService.load(roleId);
		
		//　获取页面输出流，并输出字符串
		getJspContext().getOut().write(role.getName());
	}
}
