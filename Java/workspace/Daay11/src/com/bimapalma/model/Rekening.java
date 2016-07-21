package com.bimapalma.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * Entity implementation class for Entity: Rekening
 *
 */
@Entity

public class Rekening implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rekId;
	private String noAkun;
	private static final long serialVersionUID = 1L;
	
	@ManyToMany(mappedBy="reks")
	private List<Nasabah> nasabah;

	public Rekening() {
		super();
		this.nasabah = new ArrayList<Nasabah>();
	}   
	public int getRekId() {
		return this.rekId;
	}

	public void setRekId(int rekId) {
		this.rekId = rekId;
	}   
	public String getNoAkun() {
		return this.noAkun;
	}

	public void setNoAkun(String noAkun) {
		this.noAkun = noAkun;
	}
	public List<Nasabah> getNasabah() {
		return nasabah;
	}
	public void setNasabah(List<Nasabah> nasabah) {
		this.nasabah = nasabah;
	}
	
   
}
