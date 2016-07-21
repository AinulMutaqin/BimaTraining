package com.bimapalma.purchase;

public class Item {
	private String itemCode;
	private String itemName;
	private int quantity;
	private double price;
	
	public Item() {
	}
	
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double hitungItem() {
		double hasil = quantity * price;
		return hasil;
	}
}
