package com.bimapalma.latihan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestArray {

	public static void main(String[] args) {
		ArrayList<Karyawan> dataEmployee = new ArrayList<Karyawan>();
//		dataEmployee.add("Jakarta");
//		dataEmployee.add("Bandung");
		
		Karyawan k = new Karyawan();
		k.setNama("Paula");
		dataEmployee.add(k);
		
		Mandor somad = new Mandor();
		somad.setNama("Abdul Somad");
		dataEmployee.add(somad);
		
		Karyawan bambang = dataEmployee.get(0);
		
		for (Karyawan karyawan : dataEmployee) {
			System.out.println("Nama karyawan " +karyawan.getNama());
		}
		
		/**
		 * HashMap contact = new HashMap();
		contact.put("Ainul", "089639301018");
		contact.put("Mutaqin", "085624077807");
		contact.put("Nurya", "081317167698");
		
		String noPhoneOfAinul = (String) contact.get("Ainul");
		System.out.println("No telpon Ainul adalah " +noPhoneOfAinul);
		
		Mandor mandor = new Mandor();
		mandor.setNama("Somad");
		mandor.setLokasi("Kalimantan");
		
		contact.put("Somad", mandor);
		 */
		
		
		/**
		 * ArrayList keranjang = new ArrayList();
		
		Employee staf1 = new Employee();
		staf1.setNama("Ainul Mutaqin");
		keranjang.add(staf1);
		
		Finance keuangan = new Finance();
		keuangan.setNama("Yus");
		keranjang.add(keuangan);
		
		System.out.println("Isi keranjang = " +keranjang.size());
		
		//Cara memeriksa si isi keranjang
		Object staf2 = keranjang.get(0);
		Employee stafUtuh = (Employee) staf2;
		
		Object staf3 = keranjang.get(1);
		Finance f = (Finance) staf3;
		
		for(Iterator iterator = keranjang.iterator(); iterator.hasNext();) {
			Employee e = (Employee) iterator.next();
			System.out.println("Karyawan dari keranjang adalah");
		}
		
		System.out.println("Karyawan dari keranjang adalah " +stafUtuh.getNama());
		
		//deklarasi list
		ArrayList list = new ArrayList();
		
		//menambahkan elemen ke dalam list
		//string adalah object
		list.add("Elemen pertama");
		list.add("Elemen kedua");
		
		//mengambil ukuran list
		int listSize = list.size();
		
		//print ukuran list dan elemen pertama
		System.out.println(listSize);
		System.out.println(list.get(0));
		
		//tambahkan elemen pertama ke dalam list
		list.add(0, "Elemen tambahan");
		
		//gunakan iterator list
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			//tampilkan elemen berikutnya dalam list
			System.out.println(iterator.next());
		}
		 */
		
		
		/**
		 * Employee[] staff = new Employee[3];
		
		String jabatan = "mandor";
		String kerjaan = new String("mandor");
		
		if(jabatan.equalsIgnoreCase("MANDOR")) {
			System.out.println("Emang mandor");
		}
		
		staff[0] = new Employee();
		staff[1] = new Employee();
		staff[2] = new Employee();
		
		//Contoh lain, inisialisasi array dengan iterasi for
		int[] oriNumberTo100 = new int[100];
		int jumlahBilanganAsli = 0;
		
		//Inisialiasi array
		//Inisialisasi anggota array
		for (int i = 0; i < oriNumberTo100.length; i++) {
			//Jumlahkan
			oriNumberTo100[i] = i + 1;
			jumlahBilanganAsli = jumlahBilanganAsli + oriNumberTo100[i];
			
		}
		
		int randomNumber = (int) (Math.random() * 100);
		
		System.out.println("Bilangan random yang diperoleh " +randomNumber);
		
		int[][] randomArray = new int[3][6];
		
		for(int i=0; i < randomArray.length; i++) {
			for(int j=0; j < randomArray[i].length; j++) {
				randomArray[i][j] = (int) (Math.random() * 100);
			}
		}
		
		System.out.println("Panjang array " +randomArray.length);
		for(int i=0; i < randomArray.length; i++) {
			for(int j=0; j < randomArray[i].length; j++) {
				System.out.print(randomArray[i][j] + "\t");
			}
			System.out.println();
		}
		 */
		
	}

}
