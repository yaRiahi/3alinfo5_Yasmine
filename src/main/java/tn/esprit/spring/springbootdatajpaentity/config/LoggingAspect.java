package tn.esprit.spring.springbootdatajpaentity.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;

@Component
@Aspect
@Slf4j
public class LoggingAspect {
	
	@Before("execution(* tn.esprit.spring.springbootdatajpaentity.service.*.*(..))")
	public void logMethodEntry(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		log.info("In method : " + name + " : ");
	}

	@AfterReturning("execution(* tn.esprit.spring.springbootdatajpaentity.service.*.*(..))")
	public void logMethodExit1(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		log.info("Out of method withoud errors : " + name);
	}
	
	
	@AfterThrowing("execution(* tn.esprit.spring.springbootdatajpaentity.service.*.*(..))")
	public void logMethodExit2(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		log.info("Out of method with errors : " + name);
	}
	
	@After("execution(* tn.esprit.spring.springbootdatajpaentity.service.*.*(..))")
	public void logMethodExit(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		log.info("Out of method : " + name);
	}
}
