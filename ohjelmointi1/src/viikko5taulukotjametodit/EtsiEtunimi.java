package viikko5taulukotjametodit;

import java.util.Scanner;

public class EtsiEtunimi {
	// 	ITSE MÄÄRITELLYT METODIT TULEVAT MAIN-METODIN ULKOPUOLELLE
	// ESIMERKIKSI HETI PUBLIC CLASS MAAREEN JÄLKEEN TAI SEN JÄLKEISEEN
	// TILAAN
	
	// MÄÄRITELLÄÄN METODI, JOKA ETSII PARAMETRINÄ SAAMASTAAN
	// SYÖTTEESTÄ ETUNIMEN, METODI ELI FUNKTIO PALAUTTAA SIIS
	// MERKKIJONON JA SAA PARAMETRINA MERKKIJONON. METODIN
	// KUTSUMINEN ON YKSINKERTAISEMPAA, SILLÄ KÄYTÖSSÄ STATIC-METODI
	// METODI PALAUTTAA ETUNIMEN 
	public static String etsiEtunimi(String nimi) {
		String[] solut = nimi.split(" ");
		String etunimi = solut[0];
		return etunimi;
	}
	
	
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.print("Anna koko nimesi: ");
		String kokoNimi = lukija.nextLine();
		// KUTSUTAAN METODIA JA LUETAAN SEN PALAUTTAMA ARVO
		String etunimi = etsiEtunimi(kokoNimi);
		System.out.println("Etunimesi on: " + etunimi);
	}
}
