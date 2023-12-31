package viikko5taulukotjametodit;

public class SplitDemo {

	public static void main(String[] args) {
		// NORDEA PANKKI ANTAA KUSTAKIN KUUKAUDESTA CSV
		// LISTAN, JOSSA YHDELLA RIVILLA ON YKSI PANKKIKORTIN
		// KÄYTTÖ. ARVOT ON EROTELTU ; MERKILLÄ
		String rivi = "15.09.2023;3,5;R-Kioski;Pieni kahvi";
		
		// JAOTELLAAN RIVIN TIEDOT ERILLISIKSI MERKKIJONOIKSI
		// SPLIT-KOMENON AVULLA
		String[] solut = new String[4];
		solut = rivi.split(";");
		String pvmString = solut[0];
		String hintaString = solut[1];
		String paikka = solut[2];
		String ostettuTuote = solut[3];
		System.out.println("Päivä: " + pvmString);
		System.out.println("Hinta: " + hintaString);
		System.out.println("Paikka: " + paikka);
		System.out.println("Ostettu tuote: " + ostettuTuote);
	}
}
