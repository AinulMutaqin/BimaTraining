package com.bimapalma.model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Item
 *
 */
@Entity
@Table(name="PO_ITEM")
public class Item implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int itemId;
	private String itemName;
	
	@Column(name="unit_price")
	private double price;
	private int quantity;
	
	@Transient
	private String infoTambahan;
	
	@OneToOne
	private Product product;
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}

	private static final long serialVersionUID = 1L;

	public Item() {
		super();
	}   
	public int getItemId() {
		return this.itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
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
	
	//Business Logic
	public double totalPrice() {
		return quantity * price;
	}
	
	public String getInfoTambahan() {
		return infoTambahan;
	}
	public void setInfoTambahan(String infoTambahan) {
		this.infoTambahan = infoTambahan;
	}
}
