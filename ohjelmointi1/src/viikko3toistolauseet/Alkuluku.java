package viikko3toistolauseet;

import java.util.Scanner;

public class Alkuluku {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.print("Syötä jokin positiivinen kokonaisluku: ");
		int annettuLuku = lukija.nextInt();

		boolean lukuOnAlkuluku = true;

		for (int i = 2; i < annettuLuku; i++) {
			if ((annettuLuku % i) == 0) {
				lukuOnAlkuluku = false;
			}
		}
		if (lukuOnAlkuluku == true) {
			System.out.println("Luku " + annettuLuku + " on alkuluku.");
		} else {
			System.out.println("Luku " + annettuLuku + " ei ole alkuluku.");
		}
	}
}
