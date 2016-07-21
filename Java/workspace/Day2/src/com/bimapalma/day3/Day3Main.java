package com.bimapalma.day3;

public class Day3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean condition = true;
		
		while (condition) {
			System.out.println();
		}
		do {
			System.out.println();
		} while (condition);
		
		int pizza = 100;
		//Alternatif pendeklarasian
		pizza = pizza - 1;
		
		System.out.println("Pizzaku " + --pizza);
		System.out.println("Pizzaku sekarang " + pizza);
		
		/*
		 * Casting untuk objek
		Hewan bin = new Hewan();
		Hewan atang = new Ayam();
		
		Ayam chicken = new Ayam();
		//Ayam cock = (Ayam) bin;
		
		System.out.println("AYam adalah hewan: " + (chicken instanceof Hewan));
		
		double angka1 = 1000.40;
		Double angkaObject = Double.valueOf(angka1);
		*/
		
		
		/*
		 * Promosi
		byte contoh1 = 5;
		int newcontoh = (int) contoh1;
		
		//Casting
		int bilbul = 50;
		short pendek = (short)bilbul;
		
		float pecah = bilbul;
		System.out.println("Nilai pecahan dari 50 " + pecah);
		
		double harga = 5500.50;
		int hargafix = (int) harga;
		
		System.out.println(hargafix);
		
		int pembilang = 50;
		int penyebut = 3;
		
		double hasilPembagi = (double) pembilang/penyebut;
		System.out.println("Hasil bagi 50/3 adalah " + hasilPembagi);
		
		long panjangsekali = 1000000000000000000L;
		int down = (int) panjangsekali;
		System.out.println("Hasil downcasting long " + panjangsekali + "ke int " + down);
		
		char data = 'a';
		int angkanya = data;
		System.out.println("Hasil casting char " +data + "ke int " +angkanya);
		
		int sample = 2;
		char huruf = (char) sample;
		System.out.println("Hasil downcasting int " +sample + " ke char " +huruf);
		
		char hurufAneh = '\u0132';
		System.out.println(hurufAneh);
		*/
	}

}
