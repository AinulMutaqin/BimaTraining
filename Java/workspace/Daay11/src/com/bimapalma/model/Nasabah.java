package com.bimapalma.model;

import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Nasabah
 *
 */
@Entity

public class Nasabah implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int nasabahId;
	private String nasabahName;
	
	@ManyToMany
	private List<Rekening> reks;
	
	private static final long serialVersionUID = 1L;

	public Nasabah() {
		super();
		this.reks = new ArrayList<Rekening>();
	}   
	public int getNasabahId() {
		return this.nasabahId;
	}

	public void setNasabahId(int nasabahId) {
		this.nasabahId = nasabahId;
	}   
	public String getNasabahName() {
		return this.nasabahName;
	}

	public void setNasabahName(String nasabahName) {
		this.nasabahName = nasabahName;
	}
	public List<Rekening> getReks() {
		return reks;
	}
	public void setReks(List<Rekening> reks) {
		this.reks = reks;
	}
   
}
