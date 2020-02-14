/**
 * 
 */
package com.pavnik.moviesdbservice.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author thiruganeshkumar
 *
 */
@Aspect
@Component
public class LogExecutionAspect {
	
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Around("@annotation(com.pavnik.moviesdb.aspect.LogExecution)")
	public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
	    long start = System.currentTimeMillis();
	 
	    Object proceed = joinPoint.proceed();
	 
	    long executionTime = System.currentTimeMillis() - start;
	 
	    LOGGER.debug(joinPoint.getSignature() + " executed in " + executionTime + "ms");
	    return proceed;
	}
}
