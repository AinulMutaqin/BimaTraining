package com.bimapalma.exe;

import com.bimapalma.day2.Calculator;
import com.bimapalma.day2.SegiEmpat;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Calculator mesinhitung = new Calculator(80, 45);
		SegiEmpat bujursangkar = new SegiEmpat(20);
		int luas = bujursangkar.hitungLuas();
		int keliling = bujursangkar.hitungKeliling();
		//System.out.println("Luas: " + luas + " dan keliling " + keliling);
		System.out.println(bujursangkar);
		
		SegiEmpat persegipanjang = new SegiEmpat(20,30,"cm");
		int luasPP = persegipanjang.hitungLuas();
		int kelilingPP = persegipanjang.hitungKeliling();
		//System.out.println("Luas: " + luasPP + " dan keliling " + kelilingPP);
		System.out.println(persegipanjang);
		
//		mesinhitung.bilanganPertama = 10;
//		mesinhitung.bilanganKedua = 35;

		//mesinhitung.printBilangan();
		
		//int jumlah = mesinhitung.bilanganPertama + mesinhitung.bilanganKedua;
//		int jumlah = mesinhitung.jumlahKeduaBilangan();
//		System.out.println("Jumlah " + jumlah);
//		
//		int kurang = mesinhitung.penguranganKeduaBilangan();
//		System.out.println("Kurang " + kurang);
//		
//		int kali = mesinhitung.perkalianKeduaBilangan();
//		System.out.println("Kali " + kali);
//		
//		float bagi = mesinhitung.pembagianKeduaBilangan();
//		System.out.println("Bagi " + bagi);
//		
//		Calculator simpoa = new Calculator();
//		simpoa.bilanganPertama = 15;
//		simpoa.bilanganKedua = 40;
	}
}
