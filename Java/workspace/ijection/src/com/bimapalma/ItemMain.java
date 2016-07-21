package com.bimapalma;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemMain {

	public static void main(String[] args) {
		//Item item = new Item();
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Item item = (Item) context.getBean("item"); //new item
		item.printItemName();
		
		item.getPurchaseOrder().printPO();
		
//		PurchaseOrder po = (PurchaseOrder) context.getBean("po"); //new item
//		po.printPO();
	}

}
