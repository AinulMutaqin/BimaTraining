package papan.catur;

public class MainCatur {
	private String bidak;
	private String k = "a3";
	
	public MainCatur() {
	}
	
	public MainCatur(String bidak, String k) {
		this.bidak = bidak;
		this.k = k;
	}
	
	public String log() {
		System.out.println("Posisi bidak saat ini " +k);
		return bidak;
	}
	
	public String log(String k) {
		k = "a3";
		System.out.println("Posisi bidak sekarang " +this.k);
		return k;
	}

	public String getK() {
		return k;
	}

	public void setK(String k) {
		this.k = k;
	}
	
	public String getBidak() {
		return bidak;
	}

	public void setBidak(String bidak) {
		this.bidak = bidak;
	}
	
	
}
