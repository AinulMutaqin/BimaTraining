package com.bimapalma.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestOneToOne {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myjpa");
		
		EntityManager manager = emf.createEntityManager();
		
		Item suzuki = new Item();
		//pajero.setItemId(1);
		suzuki.setItemName("Suzuki mio");
		suzuki.setPrice(25000000);
		suzuki.setQuantity(2);
		suzuki.setInfoTambahan("Keluaran tahun 2005");
		
		Product motor = new Product();
		motor.setProductName("Suzuki Motor");
		
		suzuki.setProduct(motor);

		Product mobil = new Product();
		//gergaji.setItemId(1);
		mobil.setProductName("Kijang Innova");
		
		/*EntityTransaction tx = manager.getTransaction();
		tx.begin();*/
		

		manager.getTransaction().begin();
		
		manager.persist(suzuki);
		manager.persist(motor);
		
		manager.getTransaction().commit();
		
		manager.close();
		emf.close();
	}

}
