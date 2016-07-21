package com.bimapalma.day7.user;

public class MainDirection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDirection direct = new UserDirection();
		try {
			direct.goingTo("kidul");
		} catch (Exception e) {
			System.out.println("Arah yang ditulis tidak ada dalam peta");
		}
	}

}
