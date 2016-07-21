package com.bimapalma;

public class PurchaseOrder {
	String poItem;
	
	public String getPoItem() {
		return poItem;
	}

	public void setPoItem(String poItem) {
		this.poItem = poItem;
	}

	public PurchaseOrder() {
		System.out.println("Construktor PO dipanggil");
	}
	
	public void printPO() {
		System.out.println("Title PO yang diset oleh spring: " +poItem);
	}
}
