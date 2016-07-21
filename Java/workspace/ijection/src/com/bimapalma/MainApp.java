package com.bimapalma;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		/*
		PrinterLoader loader = new PrinterLoader();
		
		IPrinter printer = new CanonPrinter();
		loader.setPrinter(printer);
		loader.testPrinterColor();
		
		IPrinter cPrinter = new CanonPrinter();
		loader.setPrinter(cPrinter);
		loader.testPrinterColor();
		*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		PrinterLoader loader = (PrinterLoader) context.getBean("printerLoader");
		loader.testPrinterColor();
	}

}
