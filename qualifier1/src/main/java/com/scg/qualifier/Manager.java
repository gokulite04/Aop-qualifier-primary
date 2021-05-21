package com.scg.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Qualifier("manager")
@Configuration
@EnableAspectJAutoProxy
public class Manager implements Person {

	@Override
	public String info() {
		return "Manager";
	}

}
