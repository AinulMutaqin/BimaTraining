package com.bimapalma.day7.user;

import com.bimapalma.day7.latihan.DirectNotValidException;
import com.bimapalma.day7.latihan.Travel;

public class UserDirection {
	Travel travel;
	
	public UserDirection() {
		travel = new Travel();
	}
	
	public void goingTo(String arah) {
		
		try {
			int arahPeta = travel.goToDirection(arah);
		} catch (DirectNotValidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println();
		}
	}
}
