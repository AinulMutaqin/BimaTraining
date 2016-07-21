package com.bimapalma.sameday;

import com.bimapalma.day4.Bandeng;
import com.bimapalma.day4.Domba;
import com.bimapalma.day4.IkanPaus;
import com.bimapalma.day4.UdangLaut;

public class MainApp {

	public static void main(String[] args) {
		UdangLaut udang = new UdangLaut();
		udang.setHasLeg(true);
		
		Bandeng b= new Bandeng();
		b.setHasLeg(false);
		
		Domba d = new Domba();
		d.setHasLeg(true);
		
		IkanPaus paus = new IkanPaus();
		paus.setHasLeg(false);
		
		KakiTester tester = new KakiTester();
		tester.walkingTest(udang);
		tester.walkingTest(b);
		tester.walkingTest(d);
		tester.walkingTest(paus);
		
		tester.hitungQuadrat(5);
		tester.hitungQuadrat(6);
		tester.hitungQuadrat(9);
		
		b.berenang();
	}

}
