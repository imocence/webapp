package com.tutushare.ws.client;

import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.tutushare.ws.model.request.Name;
import com.tutushare.ws.model.request.ObjectFactory;


@Component
public class TestClient extends WebServiceGatewaySupport{
	
	public String getName(){
		Name name = new ObjectFactory().createName();
		name.setMessage("demo");
		Name response = (Name)this.getWebServiceTemplate().marshalSendAndReceive(name);
		System.out.println("返回的参数为:" + response.getMessage());
		return response.getMessage();
	}
}
