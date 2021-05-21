package com.scg.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("student")
@Primary
public class Student implements Person {

	@Override
	public String info() {

		return "Student";
	}

}
