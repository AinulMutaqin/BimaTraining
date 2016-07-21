package com.bimapalma.latihan;

public class Karyawan {
	private String nama;
	private String nomorId;
	private Salary gaji;
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getNomorId() {
		return nomorId;
	}
	public void setNomorId(String nomorId) {
		this.nomorId = nomorId;
	}
	
	
	public Salary getGaji() {
		return gaji;
	}
	
	
	public void setGaji(Salary gaji) {
		this.gaji = gaji;
	}
	
	
}
