package Logged;

import java.util.logging.Logger;

public class LoggedObject {
	private Logger log = Logger.getLogger(LoggedObject.class.getName());
	
	public void countTo(int x) {
		int count = 0;
		log.info("Menghitung jumlah angka sampai " +x);
		if (x > 5) {
			log.warning("Kebanyakan, coba sampai 5 saja");
			for(int i = 0; i <= x; i++) {
				count += i;
				log.info("Sekarang menambahkan " +i);
			}
			log.info("Selesai. Nilai semuanya adalah" +count);
		}
	}
}
