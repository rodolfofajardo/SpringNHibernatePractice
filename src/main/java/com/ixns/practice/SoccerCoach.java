package com.ixns.practice;

import org.springframework.beans.factory.DisposableBean;

public class SoccerCoach implements Coach, DisposableBean {
	
	private FortuneService fortuneService;
	
	public SoccerCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getDailyWork() {
		return "Try free kick from different distances";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("SoccerCoach: Inside destroy method");
	}
	
	public void startup() {
		System.out.println("SoccerCoach: Inside startup method");
	}
	
	public void cleanup() {
		System.out.println("SoccerCoach: Inside cleanup method");
	}

}
