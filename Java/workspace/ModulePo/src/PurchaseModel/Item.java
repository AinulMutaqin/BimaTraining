package PurchaseModel;

public class Item {
	private String itemName;
	private int quantity;
	private double price;
	private String uom; //seperti satuan
	
	public Item() {
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public double getAmount() {
		double hitungHasil = quantity * price;
		return hitungHasil;
	}
	
}
