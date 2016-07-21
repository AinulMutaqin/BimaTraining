package com.bimapalma.model;

public class Lingkaran {
	private int jari;

	public Lingkaran() {
	}

	public Lingkaran(int jari) {
		this.jari = jari;
	}
	
	public Lingkaran(String strJari) {
		this.jari = Integer.parseInt(strJari);
	}

	public int getJari() {
		return jari;
	}

	public void setJari(int jari) {
		this.jari = jari;
	}
	
	public int hitungLuas() {
		return (int) (Math.PI * jari*jari);
	}
	
	public int hitungKeliling() {
		return (int) (2 * jari * Math.PI);
	}
}
