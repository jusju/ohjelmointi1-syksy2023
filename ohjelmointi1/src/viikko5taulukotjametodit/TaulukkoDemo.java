package viikko5taulukotjametodit;

public class TaulukkoDemo {

	public static void main(String[] args) {
		// INT TYYPPISIÄ ARVOJA SISÄLTÄVÄ TAULU NIMELTÄÄN PALKAT
		// JOKA SISÄLTÄÄ 3 ARVOA
		int[] palkat = new int[3];
		// YKSI TAPA SIJOITTAA TAULUKKOON ARVOJA ON KERTOA KUNKIN
		// INDEKSI, TAULUKON NIMI JA SOLUN UUSI ARVO
		palkat[0] = 4200;
		palkat[1] = 4800;
		palkat[2] = 4400;
		// TAULUKON TULOSTAMINEN NÄYTÖLLE
		
		for (int i = 0; i < palkat.length; i++) {
			// TULOSTA YHDEN SOLUN ARVO NAYTOLLE
			System.out.println(palkat[i]);
		}
	}
}
