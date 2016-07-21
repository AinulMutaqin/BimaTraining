package com.por.model;

import java.io.Serializable;
import java.lang.String;
import java.sql.Date;
import javax.persistence.*;

import org.eclipse.persistence.annotations.UuidGenerator;

/**
 * Entity implementation class for Entity: PurchaseOrder
 *
 */
@Entity
@UuidGenerator(name="system-uuid")
public class PurchaseOrder implements Serializable {

	@Id
	@GeneratedValue(generator="system-uuid")
	private String poid;
	private String title;
	private static final long serialVersionUID = 1L;
	
	@Transient
	private double total;
	
	@Temporal(value=TemporalType.DATE)
	private Date orderDate;
	
	public PurchaseOrder() {
		super();
	}   
	public String getPoid() {
		return this.poid;
	}

	public void setPoid(String poid) {
		this.poid = poid;
	}   
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public double calculateTotalOrder() {
		double totalprice = 0.0;
//		if (condition) {
//			
//		} else {
//
//		}
		return totalprice;
	}
}
