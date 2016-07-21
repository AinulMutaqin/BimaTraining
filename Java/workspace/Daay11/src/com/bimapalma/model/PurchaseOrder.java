package com.bimapalma.model;

import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: PurchaseOrder
 *
 */
@Entity

public class PurchaseOrder implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int poId;
	private String poTiitle;
	private double poAmount;
	
	@OneToMany(mappedBy="order")
	private List<Item> items;
	
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}

	private static final long serialVersionUID = 1L;

	public PurchaseOrder() {
		super();
		this.items = new ArrayList();
	}   
	public int getPoId() {
		return this.poId;
	}

	public void setPoId(int poId) {
		this.poId = poId;
	}   
	public String getPoTiitle() {
		return this.poTiitle;
	}

	public void setPoTiitle(String poTiitle) {
		this.poTiitle = poTiitle;
	}   
	public double getPoAmount() {
		return this.poAmount;
	}

	public void setPoAmount(double poAmount) {
		this.poAmount = poAmount;
	}
   
}
