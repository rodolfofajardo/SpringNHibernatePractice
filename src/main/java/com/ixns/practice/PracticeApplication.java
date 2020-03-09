package com.ixns.practice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Coach theCoach = context.getBean("coach", Coach.class);
		System.out.println(theCoach.getDailyWork());
		System.out.println(theCoach.getFortune());
		context.close();
	}

}
