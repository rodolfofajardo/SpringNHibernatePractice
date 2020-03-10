package com.ixns.practice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Coach coach = context.getBean("soccerCoach", Coach.class);
		System.out.println(coach.getDailyWork());
		context.close();
	}

}
