package com.bimapalma.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class QueryTable {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myjpa");
		
		EntityManager manager = emf.createEntityManager();
		
		manager.getTransaction().begin();
		
		List<Item> items = manager.createQuery("SELECT item FROM Item item").getResultList();
		
		for (Item item : items) {
			System.out.println("Purchase " + item.getItemName() + "senilai total" +item.totalPrice());
			
			if (item.getItemId() == 2) {
				manager.remove(item);
			}
			
			if (item.getItemId() == 3) {
				item.setPrice(item.getPrice() + 101.0);
				manager.persist(item);
			}
		}
		
		manager.getTransaction().commit();
		
		manager.close();
		emf.close();
	}

}
