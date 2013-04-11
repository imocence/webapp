package com.tutushare.controller.manager;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tutushare.entity.menu.Menu;

@Controller
@RequestMapping(value="/manager/menu")
public class MenuController {
	
	private String viewPath = "manager/menu";
	
	@RequestMapping(value="")
	@ResponseBody
	public void index(){
		System.out.println(123123);
	}
	
	@RequestMapping(value="/add")
	public void add(ModelMap modelMap){
		
	}
	
	/**
	 * 添加menu
	 * @param modelMap
	 * @param menu
	 */
	@RequestMapping(value="/insert")
	public void insert(ModelMap modelMap, @ModelAttribute Menu menu){
		
		
	}
	
}
