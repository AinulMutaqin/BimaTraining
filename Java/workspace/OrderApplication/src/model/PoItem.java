package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PO_ITEM database table.
 * 
 */
@Entity
@Table(name="PO_ITEM")
@NamedQuery(name="PoItem.findAll", query="SELECT p FROM PoItem p")
public class PoItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int itemid;

	@Column(length=255)
	private String itemname;

	@Column(name="PRODUCT_PRODUCTID")
	private int productProductid;

	private int quantity;

	@Column(name="UNIT_PRICE")
	private double unitPrice;

	public PoItem() {
	}

	public int getItemid() {
		return this.itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getItemname() {
		return this.itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public int getProductProductid() {
		return this.productProductid;
	}

	public void setProductProductid(int productProductid) {
		this.productProductid = productProductid;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

}