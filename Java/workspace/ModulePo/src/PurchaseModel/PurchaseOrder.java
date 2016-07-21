package PurchaseModel;

import java.sql.Date;
import java.util.ArrayList;

public class PurchaseOrder {
	private ArrayList<Item> poItem;
	private ArrayList<Addess> poAddress;
	private String poNo;
	private Date tglPo;
	private double discount;
	public ArrayList<Item> getPoItem() {
		return poItem;
	}
	public void setPoItem(ArrayList<Item> poItem) {
		this.poItem = poItem;
	}
	public ArrayList<Addess> getPoAddress() {
		return poAddress;
	}
	public void setPoAddress(ArrayList<Addess> poAddress) {
		this.poAddress = poAddress;
	}
	public String getPoNo() {
		return poNo;
	}
	public void setPoNo(String poNo) {
		this.poNo = poNo;
	}
	public Date getTglPo() {
		return tglPo;
	}
	public void setTglPo(Date tglPo) {
		this.tglPo = tglPo;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	double totalAmount() {
		return totalAmount();
	}
}
