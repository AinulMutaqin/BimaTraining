package PurchaseModel;

import java.util.ArrayList;

public class Produk {
	private String produkName;
	private ArrayList<Item> produkItem;
	
	public Produk() {
	}

	public String getProdukName() {
		return produkName;
	}

	public void setProdukName(String produkName) {
		this.produkName = produkName;
	}

	public ArrayList<Item> getProdukItem() {
		return produkItem;
	}

	public void setProdukItem(ArrayList<Item> produkItem) {
		this.produkItem = produkItem;
	}

	
}
