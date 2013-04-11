package com.tutushare.aop;

import javax.security.auth.Subject;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PermissionAspect {
	private final static Logger logger = Logger.getLogger(PermissionAspect.class);
	
	@Before("within(com.spar.web.front.FShareInfoController)")
	public void shareInfoPermission() {
		int x = 1;
	}
	
	@Before("within(com.spar.web.front.FTrainingController)")
	public void trainingPermission() {
		
	}
}
