package com.bimapalma.day6.example;

public class Gajian {

	public static void main(String[] args) {
		Gaji gaji = new Gaji();
		gaji.setGajiPokok(1500000);
		gaji.setTunjangan(750000);
		
		System.out.println("Gaji yang dibayarkan Rp " + gaji.hitungGaji());
	}

}
