package viikko5taulukotjametodit;

import java.util.Scanner;

public class Kellonaika {
	// METODIN MÄÄRITYS
	public static String kysyKellonaika() {
		Scanner lukija = new Scanner(System.in);
		String kellonaika = "";
		System.out.println("Anna kellonaika muodossa tt:mm:");
		kellonaika = lukija.nextLine();
		return kellonaika;
	}

	public static boolean tarkastaKellonaika(String kellonaika) {
		boolean kellonAikaOnVaarin = false;

		String[] solut = kellonaika.split(":");
		String minuutitTekstikentta = solut[1];
		String tunnitTekstikentta = solut[0];

		try {
			int tunnit = Integer.parseInt(tunnitTekstikentta);
			int minuutit = Integer.parseInt(minuutitTekstikentta);

			if(minuutit >= 0 && minuutit < 59 && tunnit >= 0 && tunnit < 24) {
				kellonAikaOnVaarin= false;
			} else {
				kellonAikaOnVaarin = true;
			}
		} catch (Exception ex) {
			kellonAikaOnVaarin = true;
		}
		return kellonAikaOnVaarin;
	}

	public static void main(String[] args) {
		// METODIN KUTSU
		String kellonaika = kysyKellonaika();
		boolean kellonAikaOnVaarin = tarkastaKellonaika(kellonaika);
		if(kellonAikaOnVaarin == true) {
			System.out.println("Kellonaika on väärin");
		} else {
			System.out.println("Kellonaika on oikein");
		}

	}
}
