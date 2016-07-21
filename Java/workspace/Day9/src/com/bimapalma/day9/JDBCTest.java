package com.bimapalma.day9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JDBCTest {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:derby:C:/Users/Ainul/MyDB";
		String username = "";
		String password = "";
		
		// Buat koneksi ke database
		Connection conn = DriverManager.getConnection(url, username, password);
		
		// Buat statement
		Statement st = conn.createStatement();
		
		// Eksekusi query statement dan tampung hasil ke result set
		ResultSet results = st.executeQuery("SELECT * FROM person");
		
		ArrayList people = new ArrayList();
		// Proses result set
		while(results.next()) {
			Person p = new Person();
			p.setId(results.getInt("Id"));
			p.setPersonName(results.getString("personname"));
			p.setTitle(results.getString("title"));
			
			people.add(p);
			System.out.println(results.getString("personname"));
		}
		// Tutup statement dan koneksi ke database
		System.out.println("Jumlah person dalam database: " +people.size());
		st.close();
		conn.close();
	} 
}
