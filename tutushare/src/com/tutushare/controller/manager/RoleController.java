package com.tutushare.controller.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tutushare.service.RoleService;

@Controller
@RequestMapping(value="/manager/role")
public class RoleController {
	@Autowired
	private RoleService roleService;
	
}
