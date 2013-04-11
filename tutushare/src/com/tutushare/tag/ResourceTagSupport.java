package com.tutushare.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ResourceTagSupport extends SimpleTagSupport{
	private String value;
	
	public void setValue(String value){
		this.value = value;
	}
	
	public void doTag() throws JspException, IOException {
		if(value==null)
			return;
		String context = ((PageContext) getJspContext()).getServletContext().getContextPath();
		if(!value.startsWith("/"))
			value = "/" + value;
		getJspContext().getOut().write(context + getResourceContext() + value); 
	}
	
	protected String getResourceContext(){
		return "/";
	}

}
