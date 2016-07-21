package com.bimapalma.day7.user;

import com.bimapalma.day7.Domain;
import com.bimapalma.day7.NumberNotValidException;

public class UserCalculation {
	Domain domain;
	
	public UserCalculation() {
		domain = new Domain();
	}
	
	public void testAngle(int myAngle) {
		int sudutSisa = 0;
		try {
			sudutSisa = domain.calculateAngle(myAngle);
		} catch (NumberNotValidException e) {
			// TODO Auto-generated catch block
			System.out.println("Sudut yang dimasukkan lebih dari 360!");
		}

		System.out.println("Sudut sisa adalah: " +sudutSisa);
	}
}
