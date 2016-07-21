package com.bimapalma.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class MainJPA {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myjpa");
		
		EntityManager manager = emf.createEntityManager();
		
		Item pajero = new Item();
		//pajero.setItemId(1);
		pajero.setItemName("Suzuki mio");
		pajero.setPrice(25000000);
		pajero.setQuantity(2);
		
		Item gergaji = new Item();
		//gergaji.setItemId(1);
		gergaji.setItemName("Suzuki motor");
		gergaji.setPrice(10800);
		gergaji.setQuantity(2);
		
		/*EntityTransaction tx = manager.getTransaction();
		tx.begin();*/
		
		manager.getTransaction().begin();
		
		manager.persist(pajero); //Setara dengan menginsert
		manager.persist(gergaji);
		
		manager.getTransaction().commit();
		
		manager.close();
		emf.close();
	}

}
