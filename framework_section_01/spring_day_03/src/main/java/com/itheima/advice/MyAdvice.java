package com.itheima.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

	//抽取切面表达式
	@Pointcut("execution(* com.itheima.dao.*impl.*.add*(..))")
	public void pointCut() {}

	@Before("pointCut()")
	public void Before() {
		System.out.println("前置增强...");
	}

	@AfterReturning("pointCut()")
	public void afterReturning() {
		System.out.println("后置增强...");
	}

	@AfterThrowing("pointCut()")
	public void afterThrowing() {
		System.out.println("异常抛出后增强...");
	}

	@After("pointCut()")
	public void after() {
		System.out.println("最终增强...");
	}

//	@Around("pointCut()")
	public Object surround(ProceedingJoinPoint proceedingJoinPoint) {

		Object proceed = null;
		try {
			System.out.println("环绕前通知");
			proceed = proceedingJoinPoint.proceed();
			System.out.println("环绕后通知");
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			System.out.println("异常抛出通知");
		} finally {
			System.out.println("最终通知");
		}

		return proceed;

	}
}
