package bimazk;

import java.util.ArrayList;

public class ItemMVVM {
	private ArrayList<Item> items = new ArrayList<Item>();
	private String purchaseOrderTitle;
	
	public ItemMVVM() {
		items.add(new Item("Kertas A4", 5000.0));
		items.add(new Item("Mac D", 25000.0));
		items.add(new Item("Nasi Uduk", 4500.0));
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public String getPurchaseOrderTitle() {
		return purchaseOrderTitle;
	}

	public void setPurchaseOrderTitle(String purchaseOrderTitle) {
		this.purchaseOrderTitle = purchaseOrderTitle;
	}
	
	
}
