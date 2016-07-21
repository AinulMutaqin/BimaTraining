package com.bimapalma.po;

public class Supplier {

	private String supplierName;
	private String supplierAddress;

	public Supplier() {
		// TODO Auto-generated constructor stub
	}

	public Supplier(String supplierName, String supplierAddress) {
		super();
		this.supplierName = supplierName;
		this.supplierAddress = supplierAddress;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierAddress() {
		return supplierAddress;
	}

	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}

}
