package com.bimapalma.day12;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the NASABAH database table.
 * 
 */
@Entity
//@NamedQuery(name="Nasabah.findAll", query="SELECT n FROM Nasabah n")
//@NamedQuery(name="Nasabah.findByNasabahName" query="SELECT")
//@NamedQueries( {@NamedQuery(name="Nasabah.findAll", query="SELECT n FROM Nasabah n"),
//		@NamedQuery(name="Nasabnah.findByNasabahName" query="SELECT n FROM Nasabah n WHERE n.namanasabah LIKE :nama"}))
public class Nasabah implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int nasabahid;

	private String nasabahname;

	//bi-directional many-to-many association to Rekening
	@ManyToMany(mappedBy="nasabahs")
	private List<Rekening> rekenings;

	public Nasabah() {
	}

	public int getNasabahid() {
		return this.nasabahid;
	}

	public void setNasabahid(int nasabahid) {
		this.nasabahid = nasabahid;
	}

	public String getNasabahname() {
		return this.nasabahname;
	}

	public void setNasabahname(String nasabahname) {
		this.nasabahname = nasabahname;
	}

	public List<Rekening> getRekenings() {
		return this.rekenings;
	}

	public void setRekenings(List<Rekening> rekenings) {
		this.rekenings = rekenings;
	}

}