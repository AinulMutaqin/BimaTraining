package bimazk;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;

public class CalculatorMVVM {
	int bil1;
	int bil2;
	int hasil;
	public int getBil1() {
		return bil1;
	}
	public void setBil1(int bil1) {
		this.bil1 = bil1;
	}
	public int getBil2() {
		return bil2;
	}
	public void setBil2(int bil2) {
		this.bil2 = bil2;
	}
	public int getHasil() {
		return hasil;
	}
	public void setHasil(int hasil) {
		this.hasil = hasil;
	}
	
	@Command
	@NotifyChange("hasil")
	public void tambah() {
		hasil = bil1 + bil2;
	}
	
	@Command
	public void kurang() {
		hasil = bil1 - bil2;
	}
	
	@Command
	public void kali() {
		hasil = bil1 * bil2;
	}
	
	@Command
	public void bagi() {
		hasil = bil2 / bil1;
	}
}
