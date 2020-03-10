package com.ixns.practice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeApplication {

	public static void main(String[] args) {
		// first we try the singleton
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Coach theCoach = context.getBean("coach", Coach.class);
		
		System.out.println("the coach says: " + theCoach.getDailyWork());
		System.out.println("the coach fortune is: " + theCoach.getFortune());
		
		Coach otherCoach = context.getBean("coach", Coach.class);

		System.out.println("other coach says: " + otherCoach.getDailyWork());
		System.out.println("other coach fortune is: " + otherCoach.getFortune());
		
		System.out.println("Is the coach the same as other coach: " + 
				(theCoach == otherCoach));
		
		System.out.println("the coach addres: " + theCoach);
		System.out.println("other coach address: " + otherCoach);		
		
		context.close();
		
		// And  then we try prototype scope
		context = 
				new ClassPathXmlApplicationContext("ApplicationContext.xml");

		theCoach = context.getBean("protoCoach", Coach.class);
		
		System.out.println("the coach says: " + theCoach.getDailyWork());
		System.out.println("the coach fortune is: " + theCoach.getFortune());
		
		otherCoach = context.getBean("protoCoach", Coach.class);

		System.out.println("other coach says: " + otherCoach.getDailyWork());
		System.out.println("other coach fortune is: " + otherCoach.getFortune());
		
		System.out.println("Is the coach the same as other coach: " + 
				(theCoach == otherCoach));
		
		System.out.println("the coach addres: " + theCoach);
		System.out.println("other coach address: " + otherCoach);		
		
		context.close();
		
	}

}
