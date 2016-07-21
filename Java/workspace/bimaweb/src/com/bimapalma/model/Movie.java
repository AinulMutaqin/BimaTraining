package com.bimapalma.model;

public class Movie {
	String judul;
	String boxOffice;
	
	public Movie() {
	}

	public Movie(String judul, String boxOffice) {
		this.judul = judul;
		this.boxOffice = boxOffice;
	}
	
	public String getJudul() {
		return judul;
	}
	public void setJudul(String judul) {
		this.judul = judul;
	}
	public String getBoxOffice() {
		return boxOffice;
	}
	public void setBoxOffice(String boxOffice) {
		this.boxOffice = boxOffice;
	}
	
	
}
