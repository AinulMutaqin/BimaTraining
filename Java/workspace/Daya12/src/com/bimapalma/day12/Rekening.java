package com.bimapalma.day12;

import java.io.Serializable;

import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the REKENING database table.
 * 
 */
@Entity
@NamedQuery(name="Rekening.findAll", query="SELECT r FROM Rekening r")
public class Rekening implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rekid;

	private String noakun;
	//private Date tglBukaAkun;

	//bi-directional many-to-many association to Nasabah
	@ManyToMany
	@JoinTable(
		name="REKENING_NASABAH"
		, joinColumns={
			@JoinColumn(name="REKS_REKID")
			}
		, inverseJoinColumns={
			@JoinColumn(name="NASABAH_NASABAHID")
			}
		)
	private List<Nasabah> nasabahs;

	public Rekening() {
	}

	public int getRekid() {
		return this.rekid;
	}

	public void setRekid(int rekid) {
		this.rekid = rekid;
	}

	public String getNoakun() {
		return this.noakun;
	}

	public void setNoakun(String noakun) {
		this.noakun = noakun;
	}

	public List<Nasabah> getNasabahs() {
		return this.nasabahs;
	}

	public void setNasabahs(List<Nasabah> nasabahs) {
		this.nasabahs = nasabahs;
	}

}