package com.bimapalma.day6;

public class Pohon {
	private int cabang;
	
	public void infoPohon() {
		this.cabang = 4;
		System.out.println("Pohon ada daunnya");
	}
	
	public int getJumlahCabang() {
		return cabang;
	}
}
