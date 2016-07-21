package com.bimapalma.day7;

import java.util.ArrayList;

public class POTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PO po = new PO();
		po.setHeader("Purchase pupuk");
		
		Item pupuk = new Item();
		ArrayList daftarItem = po.getItem();
		daftarItem.add(pupuk);
		
//		String namaProd = ((Item));
//		
//		ArrayList items = po.getItem();
//		Item item = 
	}

}
