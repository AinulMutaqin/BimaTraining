package com.por.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainPO {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PurchaseEntity");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		PurchaseOrder po = new PurchaseOrder();
		po.setTitle("Pembelian Mobil");
	}

}
