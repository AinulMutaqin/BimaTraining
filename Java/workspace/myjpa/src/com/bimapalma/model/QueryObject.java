package com.bimapalma.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class QueryObject {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myjpa");
		
		EntityManager manager = emf.createEntityManager();
		
		manager.getTransaction().begin();
		
		Item pajero = manager.find(Item.class, 1);
		
		System.out.println("Item yang dibeli: " +pajero.getItemName() + " USD" + pajero.getPrice());
		
		manager.getTransaction().commit();
		
		manager.close();
		emf.close();
	}

}
