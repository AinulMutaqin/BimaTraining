package com.bimapalma.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.bimapalma.day12.Rekening;

public class RekeningDAO {
	private EntityManager em;
	
	public RekeningDAO(EntityManager em) {
		this.em = em;
	}
	
	public Rekening getRekeningBy(int id) {
		return em.find(Rekening.class, id);
	}
	
	public Rekening RekeningBy(String akun) {
		List<Rekening> reks = em.createQuery("SELECT r FROM Rekening WHERE r, nomoeakun LIKE :akun")
				.setParameter("akun", akun)
				.getResultList();
		return reks.get(0);
	}
	
	public List<Rekening> getAllRekening() {
		List<Rekening> allReks = em.createQuery("SELECT r FROM Rekening r").getResultList();
		return allReks;
	}
	
	public void deleteRekening(int id) {
		Rekening rek = em.find(Rekening.class, id);
		em.getTransaction().begin();
		em.remove(rek);
		em.getTransaction().commit();
	}
	
	public void save(Rekening rek) {
		em.getTransaction().begin();
		em.persist(rek);
		em.getTransaction().commit();
	}
}
