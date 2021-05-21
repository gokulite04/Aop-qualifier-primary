package com.scg.qualifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);

	@Autowired
	@Qualifier("student")
	private Person p1;

	@Autowired
	@Qualifier("manager")
	private Person p2;

	@Autowired
	private Person p3;

	@Override
	public void run(final String... args) throws Exception {

		logger.info("p1 is {} info", p1.info());
		logger.info("p2 is {} info", p2.info());
		logger.info("default bean is {}", p3.info());
	}
}
