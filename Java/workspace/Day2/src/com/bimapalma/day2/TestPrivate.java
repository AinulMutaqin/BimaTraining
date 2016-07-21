package com.bimapalma.day2;

public class TestPrivate {
	public static void main(String[] args) {
		SudutLingkaran sLing = new SudutLingkaran();
		sLing.setAngle(360);
		int sudut= sLing.getAngle();
		System.out.println("Sudut yang diset adalah " + sudut);
	}
}
