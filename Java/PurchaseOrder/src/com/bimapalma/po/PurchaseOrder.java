package com.bimapalma.po;

import java.util.ArrayList;
import java.util.Date;

public class PurchaseOrder {

	private ArrayList<Item> poItems;
	private Supplier supplier;
	private String poHeader;
	private Date orderDate;
	private double discountPercent;
	private double ppn;
	
	public PurchaseOrder() {
		poItems = new ArrayList<Item>();
	}

	public PurchaseOrder(ArrayList<Item> poItems, Supplier supplier,
			String poHeader, Date orderDate, double discountPercent) {
		super();
		this.poItems = poItems;
		this.supplier = supplier;
		this.poHeader = poHeader;
		this.orderDate = orderDate;
		this.discountPercent = discountPercent * 0.01;
	}

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

	public String getPoHeader() {
		return poHeader;
	}

	public void setPoHeader(String poHeader) {
		this.poHeader = poHeader;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public double getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = 0.01 * discountPercent;
	}

	public double calculateBasicAmount() {
		double basicAmount = 0.0;
		for (Item item : poItems) {
			basicAmount = basicAmount + item.calculateItemTotalPrice();
		}
		return basicAmount;
	}
	
	public double calculateAmountAfterDiscount() {
		double amount = calculateBasicAmount() - ( calculateBasicAmount() * getDiscountPercent());
		return amount;
	}

	public void calculateTax(double pajakRate) {
		double valueAddedTax = 0.0;
		valueAddedTax = calculateAmountAfterDiscount() * pajakRate;
		this.ppn = valueAddedTax;
	}
	
	public double calculatePayableAmount() {
		double payable = calculateAmountAfterDiscount() + this.ppn;
		return payable;
	}

}
