package com.por.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class PODao {
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional(readOnly = true)
	public List<PurchaseOrder> queryAll() {
		Query query = em.createQuery("SELECT o FROM PurchaseOrder o");
		List<PurchaseOrder	> result = query.getResultList();
		return result;
	}
}
