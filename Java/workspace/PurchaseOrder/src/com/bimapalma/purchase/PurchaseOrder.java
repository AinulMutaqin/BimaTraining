package com.bimapalma.purchase;

import java.util.ArrayList;

public class PurchaseOrder {
	private ArrayList<Item> poItems;
	private Supplier supplier;
	private double jumlah;
	private String poHeader;
	private double ppn;
	public ArrayList<Item> getPoItems() {
		return poItems;
	}
	public void setPoItems(ArrayList<Item> poItems) {
		this.poItems = poItems;
	}

	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public double getJumlah() {
		return jumlah;
	}
	public void setJumlah(double jumlah) {
		this.jumlah = jumlah;
	}
	public String getPoHeader() {
		return poHeader;
	}
	public void setPoHeader(String poHeader) {
		this.poHeader = poHeader;
	}
	public double getPpn() {
		return ppn;
	}
	public void setPpn(double ppn) {
		this.ppn = ppn;
	}
	
//	public double calculateBasicAmount() {
//		amount = calculateBasicAmount()
//		return am
//	}
}
