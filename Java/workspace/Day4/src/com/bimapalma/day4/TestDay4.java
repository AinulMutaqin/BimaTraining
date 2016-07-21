package com.bimapalma.day4;

import com.bimapalma.abs.PrinterDriver;
import com.bimapalma.abs.PrinterLoader;
import com.bimapalma.hp.HPPrinter;

public class TestDay4 {

	public static void main(String[] args) {
		//MAS mengenali HPPrinterDriver sbg subclass dari PrinterDriver
		//lalu dibuatkan objectnya
		PrinterDriver hp = new HPPrinter();
		
		//Akhirnya di-load ketika printer digunakan
		PrinterLoader loader = new PrinterLoader();
		loader.loadDriver(hp);
		
		//tutorialspoint.com
		Hewan hwn = new Ikan();
		Ikan bandeng = new Bandeng();
		
		Object o = new Domba();
		Object b = new Bandeng();
		Object h = new Hewan();
		Object i = new Ikan();
		
		//b.berenang();
		bandeng.berenang();
		
		Ikan bisaberenang = (Ikan) hwn;
		bisaberenang.berenang();
		
//		Mamalia mama = new Mamalia();
//		
//		mama.setHasLeg(true);
//		String paru = mama.getAlatPernapasan();
//		
//		mama.methodRahasia();
//		
//		Ikan fish = new Ikan();
//		fish.setAlatPernapasan("Insang");
	}

}
