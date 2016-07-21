package id.go.pajak;

public class TaxCalculation {
	public double calculate(Taxable taxable) {
		double jumlahYangDiPajak = taxable.getBasisAmount();
		double nilaiPajak = jumlahYangDiPajak * 0.05;
		return nilaiPajak;
	}
}
