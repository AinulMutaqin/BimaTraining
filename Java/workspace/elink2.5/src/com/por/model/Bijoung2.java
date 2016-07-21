package com.por.model;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;

import org.eclipse.persistence.annotations.UuidGenerator;

/**
 * Entity implementation class for Entity: Bijoung2
 *
 */
@Entity
@UuidGenerator(name="system-uuid")
public class Bijoung2 implements Serializable {

	   
	@Id
	@GeneratedValue(generator="system-uuid")
	private String bId;
	private String namaKu;
	private static final long serialVersionUID = 1L;

	public Bijoung2() {
		super();
	}   
	public String getBId() {
		return this.bId;
	}

	public void setBId(String bId) {
		this.bId = bId;
	}   
	public String getNamaKu() {
		return this.namaKu;
	}

	public void setNamaKu(String namaKu) {
		this.namaKu = namaKu;
	}
   
}
