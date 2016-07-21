package PurchaseModel;

import java.util.ArrayList;

public class Supplier {
	private String supplierName;
	private String email;
	private ArrayList<Addess> supplierAddress;
	
	public Supplier() {
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Addess> getSupplierAddress() {
		return supplierAddress;
	}

	public void setSupplierAddress(ArrayList<Addess> supplierAddress) {
		this.supplierAddress = supplierAddress;
	}

	
	
}
