package com.tutushare.controller.manager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/jsp")
public class JspController {
	
	@RequestMapping(value="/query")
	public String query(){
		return "manager/query";
	}
}
