package com.tutushare.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class FrontController {
	@RequestMapping("")
	public String index(){
		System.out.println(1111);
		return "index";
	}
}
