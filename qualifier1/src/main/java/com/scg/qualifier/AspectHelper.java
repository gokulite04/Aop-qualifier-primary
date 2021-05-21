package com.scg.qualifier;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Aspect
@Component
public class AspectHelper {
	@Before("execution(public String info())")
	public void log() {
		System.out.println("info called");
	}
}
