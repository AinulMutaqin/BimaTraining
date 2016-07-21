package com.bimapalma.po;

public class Item {

	private String itemName;
	private int jumlahItem;
	private double price;

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(String itemName, int jumlahItem, double price) {
		super();
		this.itemName = itemName;
		this.jumlahItem = jumlahItem;
		this.price = price;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getJumlahItem() {
		return jumlahItem;
	}

	public void setJumlahItem(int jumlahItem) {
		this.jumlahItem = jumlahItem;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double calculateItemTotalPrice() {
		double total = this.getJumlahItem() * this.getPrice();
		return total;
	}

}
