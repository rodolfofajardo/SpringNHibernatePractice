package com.ixns.practice;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {
	
	@Override
	public String getDailyWork() {
		return "Try free kick from different distances";
	}
}
