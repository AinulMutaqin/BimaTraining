package com.bimapalma.abs;

public abstract class PrinterDriver {
	private String printerName;
	
	public abstract boolean checkPrinterInk();
	
	public String getPrinterName() {
		return printerName;
	}

	public void setPrinterName(String printerName) {
		this.printerName = printerName;
	}
}
