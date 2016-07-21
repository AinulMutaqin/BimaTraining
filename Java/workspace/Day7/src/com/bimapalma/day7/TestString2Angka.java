package com.bimapalma.day7;

public class TestString2Angka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputAngka = "z5";
		int angka = Integer.valueOf(inputAngka);
		
		String doubleString = "7.5";
		double angkaDouble = Double.valueOf(doubleString);
		double powerUp = Math.pow(angkaDouble, 2);
		
		System.out.println("Angka yang diinput" + powerUp);
	}

}
