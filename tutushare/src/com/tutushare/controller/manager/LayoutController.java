package com.tutushare.controller.manager;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LayoutController {
	
	/**
	 * 隐射所有jsp页面
	 */
	@RequestMapping(value="/manager/layout/**")
	public String getAbout(HttpServletRequest  request){
		//例如：/tutushare/layout/easy
		String uri = request.getRequestURI();
		//例如：/layout/easy
		String view_path = uri.substring(uri.indexOf("/", 1)+1, uri.length());
		return view_path;
	}
}
