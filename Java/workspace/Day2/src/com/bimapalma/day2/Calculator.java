package com.bimapalma.day2;

public class Calculator {
	public int bilanganPertama;
	public int bilanganKedua;
	
	public Calculator(int x, int y) {
		this.bilanganPertama = x;
		this.bilanganKedua = y;
	}
	
	public void printBilangan() {
		System.out.println(bilanganPertama + " dan " + bilanganKedua);
	}
	
	public int jumlahKeduaBilangan() {
		int hasil = bilanganPertama + bilanganKedua;
		return hasil;
	}
	
	public int penguranganKeduaBilangan() {
		int hasil = bilanganKedua - bilanganPertama;
		return hasil;
	}
	
	public int perkalianKeduaBilangan() {
		int hasil = bilanganPertama * bilanganKedua;
		return hasil;
	}
	
	public float pembagianKeduaBilangan() {
		float hasil = bilanganKedua / bilanganPertama;
		return hasil;
	}
}
