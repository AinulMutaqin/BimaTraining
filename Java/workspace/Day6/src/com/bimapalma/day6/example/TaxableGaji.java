package com.bimapalma.day6.example;

import id.go.pajak.Taxable;

public class TaxableGaji extends Gaji implements Taxable {

	private final double limit = 2000000.0;
	
	@Override
	public double getBasisAmount() {
		double basicAmount = 0.0;
		
		if(super.hitungGaji() > limit) {
			basicAmount = super.hitungGaji()-limit;
		} 
		return basicAmount;
	}
	
	

}
