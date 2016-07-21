package com.bimapalma.latihan;

public class Salary {
	double gajiPokok;
	double tunjangan;
	
	public double getGajiPokok() {
		return gajiPokok;
	}
	public double getTunjangan() {
		return tunjangan;
	}
	public void setTunjangan(double tunjangan) {
		this.tunjangan = tunjangan;
	}
	public void setGajiPokok(double gajiPokok) {
		this.gajiPokok = gajiPokok;
	}
	
	public double hitungGaji() {
		double gaji = this.getGajiPokok() + this.getTunjangan();
		return gaji;
	}
}
