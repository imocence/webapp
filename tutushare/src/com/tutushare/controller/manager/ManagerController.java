package com.tutushare.controller.manager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/manager")
public class ManagerController {
	String viewPath = "manager";
	
	@RequestMapping(value="")
	public String index(){
		
		return  viewPath + "/index";
	}
}
