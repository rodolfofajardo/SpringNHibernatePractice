package com.ixns.practice;

public class SoccerCoach implements Coach {
	
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

}
