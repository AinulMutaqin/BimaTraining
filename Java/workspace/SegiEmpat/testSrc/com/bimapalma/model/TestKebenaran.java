package com.bimapalma.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestKebenaran {

	PersegiEmpat s4 = new PersegiEmpat(5, 6);
	
	@Test
	public void testHitungLuas() {
		assertSame("Tidak sama euy", 30, s4.hitungLuas());
	}

	@Test
	public void testHitungKeliling() {
		assertSame("Keliling tidak sama", 22, s4.hitungKeliling());
	}
	
	@Test
	public void bedakah() {
		assertNotSame("Seharusnya tidak sama", 40, s4.hitungLuas());
	}

}
