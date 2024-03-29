package com.example.helloWorldAPI.AOP.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AroundAspect {
	private Logger logger= LoggerFactory.getLogger(this.getClass());
	
//	@Around("execution(* PACKAGE.*.*(..))")
//	@Around("execution(* com.example.helloWorldAPI.AOP.business_dao.*.*(..))")
	@Around("com.example.helloWorldAPI.AOP.aspect.CommonJoinPointConfig.businessLayerExecution()")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable{
		long startTime = System.currentTimeMillis();
		joinPoint.proceed();
		long timeTaken = System.currentTimeMillis() - startTime;
		logger.info("Time taken by {} : {}",joinPoint,timeTaken);
	}
	
}
