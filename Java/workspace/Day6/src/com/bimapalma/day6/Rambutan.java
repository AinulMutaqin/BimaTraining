package com.bimapalma.day6;

public class Rambutan extends Pohon {
	private boolean berambut;
	
	@Override
	public void infoPohon() {
		super.infoPohon();
		berambut = true;
		
		System.out.println("Rambutan juga punya daun");
		System.out.println("Jumlah cabang " + super.getJumlahCabang());
	}
}
