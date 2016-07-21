package com.bimapalma;

public class PrinterLoader {
	private IPrinter printer;

	public IPrinter getPrinter() {
		return printer;
	}

	public void setPrinter(IPrinter printer) {
		this.printer = printer;
	}
	
	public void testPrinterColor() {
		printer.showColorMode();
	}
}
