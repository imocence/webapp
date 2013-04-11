package com.tutushare.ws.service;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.Namespace;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.ws.server.endpoint.annotation.XPathParam;

import com.tutushare.ws.model.request.Name;

@Endpoint
public class TestEndpoint {

	private static final String MES_NS_V1 = "http://www.tutushare.com/ws/model/request";
	@PayloadRoot(localPart = "name", namespace =MES_NS_V1)
	@Namespace(prefix = "m", uri = MES_NS_V1)
	@ResponsePayload
	public Name getCount(@RequestPayload Name name) throws Exception {
		System.out.println("请求的参数为:" + name.getMessage());
		return name;
	}
	
}
