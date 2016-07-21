package com.bimapalma.exe;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bimapalma.model.Item;
import com.bimapalma.model.PurchaseOrder;

public class TestOneToMany {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Daay11");
		EntityManager em = emf.createEntityManager();
		
		PurchaseOrder order = new PurchaseOrder();
		order.setPoTiitle("Pesanan Kendaraan");
		
		Item motor = new Item();
		motor.setItemName("Motor Honda");
		motor.setPrice(12500000);
		motor.setQuantity(2);
		
		Item mobil = new Item();
		mobil.setItemName("Truck Lapangan");
		mobil.setPrice(12500000);
		mobil.setQuantity(3);
		
		order.getItems().add(motor);
		order.getItems().add(mobil);
		
		motor.setOrder(order);
		mobil.setOrder(order);
		
		em.persist(order);
		em.persist(motor);
		em.persist(mobil);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		System.out.println("Hello");
	}

}
