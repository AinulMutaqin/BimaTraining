package com.bimapalma.exe;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bimapalma.dao.RekeningDAO;
import com.bimapalma.day12.Rekening;

public class TestDAO {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Daya12");
		EntityManager em = emf.createEntityManager();
		
		RekeningDAO dao = new RekeningDAO(em);
		
		Rekening rek = dao.getRekeningBy(1);
		System.out.println("Rekening " +rek.getNoakun());
		
		List<Rekening> allRek = dao.getAllRekening();
		
		for (Rekening rekening : allRek) {
			System.out.println("Rekening " +rekening.getNoakun());
		}
		dao.deleteRekening(rek.getRekid());
	}

}
