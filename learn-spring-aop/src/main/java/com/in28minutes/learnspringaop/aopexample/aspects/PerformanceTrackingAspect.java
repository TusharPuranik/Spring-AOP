package com.in28minutes.learnspringaop.aopexample.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class PerformanceTrackingAspect {
	
	private Logger logger = LoggerFactory.getLogger(getClass());

	
	@Around("execution(* com.in28minutes.learnspringaop.aopexample.*.*(..))")
	public Object findExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		
		long startTimeMillis=System.currentTimeMillis();
		
		Object returnValue=proceedingJoinPoint.proceed();
		
		long stopTimeMillis=System.currentTimeMillis();
		
		long executionDuration=stopTimeMillis-startTimeMillis;
		
		logger.info(" Around Acpect - {} Time of execution is {}",proceedingJoinPoint,executionDuration);

		return returnValue;
	}

}
