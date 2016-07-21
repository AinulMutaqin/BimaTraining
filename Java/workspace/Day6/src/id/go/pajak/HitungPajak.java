package id.go.pajak;

import com.bimapalma.day6.example.TaxableGaji;

public class HitungPajak {

	public static void main(String[] args) {
		Taxable tax = new TaxableGaji();
		TaxCalculation calc = new TaxCalculation();
		double amount = calc.calculate(tax);
	}

}
