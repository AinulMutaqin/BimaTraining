package com.bimapalma.day3;

import java.util.ArrayList;

public class MainDay3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList daftarAlamat = new ArrayList();
		
		Address alamat1 = new Address();
		Address alamat2 = new Address();
		Address alamat3 = new Address();
		
		daftarAlamat.add(alamat1);
		daftarAlamat.add(alamat2);
		daftarAlamat.add(alamat3);
		
		daftarAlamat.add(new String("bimapalma"));
		
		Employee karyawan = new Employee();
		karyawan.setAddress(daftarAlamat);
		
		//Casting objek address
		Address index1 = (Address) karyawan.getAddress().get(0);
		
		ArrayList daftar = karyawan.getAddress();
		Object o = daftar.get(0);
		Address index2 = (Address) o;
	} 

}
