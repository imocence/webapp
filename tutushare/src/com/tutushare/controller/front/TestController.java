package com.tutushare.controller.front;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tutushare.ws.client.TestClient;

@Controller
@RequestMapping("/test")
public class TestController {
	@Autowired
	private TestClient testClient;
	
	@RequestMapping("/test")
	@ResponseBody
	public String getName(){
		return testClient.getName();
	}
}
