package com.por.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Maintest {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("elink2.5");
		EntityManager em = emf.createEntityManager();
		
		Bijoung2 b2 = new Bijoung2();
		b2.setNamaKu("Tony Blank");
		
		em.getTransaction().begin();
		
		em.persist(b2);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		System.out.println("UUID Bijoung: " + b2.getBId());
	}
	
	/*
	 * TODO Selesaikan method ini
	 */
	public double cak() {
		return 0.0;
	}
}
