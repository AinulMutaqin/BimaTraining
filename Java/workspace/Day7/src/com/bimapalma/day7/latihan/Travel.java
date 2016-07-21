package com.bimapalma.day7.latihan;

public class Travel extends DirectNotValidException {
	public int goToDirection(String direction) throws DirectNotValidException {
		int arahSudutPeta = 0;
		
		if (direction.equalsIgnoreCase("north")) {
			arahSudutPeta = 0;
		} else if (direction.equalsIgnoreCase("west")) {
			arahSudutPeta = 90;
		} else if (direction.equalsIgnoreCase("south")) {
			arahSudutPeta = 180;
		} else if (direction.equalsIgnoreCase("east")) {
			arahSudutPeta = 270;
		} else {
			throw new DirectNotValidException();
		}
		
		return arahSudutPeta;
		
	}
}
