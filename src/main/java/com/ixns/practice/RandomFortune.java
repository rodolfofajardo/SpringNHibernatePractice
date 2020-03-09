package com.ixns.practice;

import java.util.Random;

public class RandomFortune implements FortuneService {
	
	private String[] fortuneArray;
	
	public RandomFortune(String fortuneArray) {
		this.fortuneArray = fortuneArray.split("\\|");
	}

	@Override
	public String getFortune() {
		Random r = new Random();
		
		return fortuneArray[r.nextInt(fortuneArray.length)];
	}

}
