package com.bimapalma;

public class Item {
	private String itemName;
	private PurchaseOrder purchaseOrder;
	
	public Item() {
		System.out.println("Construktor item dipanggil");
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public void printItemName() {
		System.out.println("Nama item yg diset oleh spring: " +itemName);
	}

	public PurchaseOrder getPurchaseOrder() {
		return purchaseOrder;
	}

	public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}
}
