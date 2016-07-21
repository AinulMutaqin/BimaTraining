package com.bimapalma.exe;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bimapalma.model.Nasabah;
import com.bimapalma.model.Rekening;

public class TestManyToMany {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Daay11");
		EntityManager em = emf.createEntityManager();
		
		Nasabah wati = new Nasabah();
		wati.setNasabahName("Wati Surati");
		
		Nasabah james = new Nasabah();
		james.setNasabahName("James Jones");
		
		Nasabah bambang = new Nasabah();
		bambang.setNasabahName("Bambang Parangkas");
		
		Rekening akun1 = new Rekening();
		akun1.setNoAkun("A-20000-2323");
		
		Rekening akun2 = new Rekening();
		akun2.setNoAkun("B-20000-2344");
		
		wati.getReks().add(akun1);
		wati.getReks().add(akun2);
		
		james.getReks().add(akun1);
		bambang.getReks().add(akun2);
		
		akun1.getNasabah().add(wati);
		akun1.getNasabah().add(james);
		akun1.getNasabah().add(bambang);
		
		akun2.getNasabah().add(wati);
		
		em.getTransaction().begin();
		
		em.persist(wati);
		em.persist(james);
		em.persist(bambang);
		em.persist(akun1);
		em.persist(akun2);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
