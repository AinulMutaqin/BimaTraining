package bimazk;

public class Item {
	String namaProduk;
	double harga;
	
	
	
	public Item() {
	}
	public Item(String namaProduk, double harga) {
		this.namaProduk = namaProduk;
		this.harga = harga;
	}
	public String getNamaProduk() {
		return namaProduk;
	}
	public void setNamaProduk(String namaProduk) {
		this.namaProduk = namaProduk;
	}
	public double getHarga() {
		return harga;
	}
	public void setHarga(double harga) {
		this.harga = harga;
	}
	
	
}
