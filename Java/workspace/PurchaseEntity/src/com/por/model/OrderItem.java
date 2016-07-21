package com.por.model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: OrderItem
 *
 */
@Entity

public class OrderItem implements Serializable {

	   
	@Id
	private String itemid;
	private String itemName;
	private double price;
	private int quantity;
	
	@Transient
	private double subtotal;
	
	@ManyToOne
	private PurchaseOrder po;
	private static final long serialVersionUID = 1L;
	
	public OrderItem() {
		super();
	}   
	public String getItemid() {
		return this.itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}   
	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}   
	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}   
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double calculateSubTotal() {
		return price * quantity;
	}
}
