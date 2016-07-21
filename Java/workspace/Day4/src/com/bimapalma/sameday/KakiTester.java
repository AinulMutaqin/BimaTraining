package com.bimapalma.sameday;

import com.bimapalma.day4.Hewan;

public class KakiTester {
	public void walkingTest(Hewan hewan) {
		if(hewan.isHasLeg()) {
			System.out.println("Hewan ini bisa berjalan");
		} else {
			System.out.println("Hewan ini ngesot");
		}
	}
	
	public void hitungQuadrat(int angka) {
		System.out.println("Nilai kuadrat " + angka + " adalah " + Math.pow(angka, 2));
	}
}
