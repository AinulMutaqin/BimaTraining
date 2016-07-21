package com.bimapalma.po;

import java.util.ArrayList;
import java.util.Date;

public class POCreator {

	public static void main(String[] args) {
		Item pulpen = new Item("Pulpen", 5, 2500.00);
		Item kertas = new Item("Kertas", 10, 28000.00);
		
		ArrayList<Item> poItems = new ArrayList<Item>();
		poItems.add(pulpen);
		poItems.add(kertas);
		
		Supplier kawanLama = new Supplier("Kawan Lama,  PT", "Jl. Dimana Jakarta");
		
		PurchaseOrder po = new PurchaseOrder(poItems, kawanLama, "Belanja ATK", new Date(), 2.5);
		po.calculateTax(0.1);
		
		System.out.println("Jumlah Basic = Rp " + po.calculateBasicAmount());
		System.out.println("Jumlah Setelah Diskon = Rp " + po.calculateAmountAfterDiscount());
		
		System.out.println("Jumlah Payable = Rp " + po.calculatePayableAmount());
		

	}

}
