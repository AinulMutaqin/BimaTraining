package com.bimapalma.day6.example;

public class Gaji {
	private double gajiPokok;
	private double tunjangan;

	public double getGajiPokok() {
		return gajiPokok;
	}

	public void setGajiPokok(double gajiPokok) {
		this.gajiPokok = gajiPokok;
	}

	public double getTunjangan() {
		return tunjangan;
	}

	public void setTunjangan(double tunjangan) {
		this.tunjangan = tunjangan;
	}
	
	public double hitungGaji() {
		return gajiPokok + tunjangan;
	}
}
