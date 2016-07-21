package com.bimapalma.model;

public class PersegiEmpat {
	private int tinggi;
	private int lebar;
	
	public PersegiEmpat() {
	}

	public PersegiEmpat(int tinggi, int lebar) {
		this.tinggi = tinggi;
		this.lebar = lebar;
	}

	public PersegiEmpat(String strTinggi, int strLebar) {
		this.tinggi = Integer.valueOf(strTinggi);
		this.lebar = Integer.valueOf(strLebar);
	}

	public int getTinggi() {
		return tinggi;
	}

	public void setTinggi(int tinggi) {
		this.tinggi = tinggi;
	}

	public int getLebar() {
		return lebar;
	}

	public void setLebar(int lebar) {
		this.lebar = lebar;
	}
	
	public int hitungLuas() {
		return tinggi * lebar;
	}
	
	public int hitungKeliling() {
		return (2*tinggi) + (2*lebar);
	}
}
