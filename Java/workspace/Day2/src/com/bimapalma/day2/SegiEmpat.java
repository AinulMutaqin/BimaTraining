package com.bimapalma.day2;

public class SegiEmpat {
	private int panjang;
	private int lebar;
	private String satuan;
	
	public SegiEmpat() {
		
	}
	
	public SegiEmpat(int sisi) {
		this.panjang = sisi;
		this.lebar = sisi;
		this.satuan = "m";
	}
	
	
	/**
	 * Gunakan construktor ini untuk membuat segi empat dengan panjang
	 * @param p
	 * @param l
	 * @param satuan
	 */
	public SegiEmpat(int p, int l, String satuan) {
		this.panjang = p;
		this.lebar = l;
		this.satuan = satuan;
	}
	
	
	/**
	 * Untuk menghitung luas baik bujursangkar maupun persegi panjang
	 * @return
	 */
	public int hitungLuas() {
		int luas = panjang * lebar;
		return luas;
	}
	
	/**
	 * Method baru untuk menghitung luas
	 * @param satuan
	 * @return
	 * @author Ainul
	 */
	public int hitungLuas(String satuan) {
		return 1;
	}
	
	
	/**
	 * Method untuk menghitung keliling
	 * @return
	 */
	public int hitungKeliling() {
		int keliling = 2*panjang + 2*lebar;
		return keliling;
	}
	
//	public void printLuas() {
//		System.out.println("Luas segi empat adalah: ");
//	}
//	
//	public void printKeliling() {
//		System.out.println("Keliling segi empat adalah: ");
//	}
	
	public int getPanjang() {
		return panjang;
	}
	public void setPanjang(int panjang) {
		this.panjang = panjang;
	}
	public int getLebar() {
		return lebar;
	}
	public void setLebar(int lebar) {
		this.lebar = lebar;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		int luas = this.hitungLuas();
		int keliling = this.hitungKeliling();
		String ObjectBujurSangkar = "Luas = " + luas + satuan + "2 keliling" + keliling + satuan;
		return ObjectBujurSangkar;
	}
	
}
