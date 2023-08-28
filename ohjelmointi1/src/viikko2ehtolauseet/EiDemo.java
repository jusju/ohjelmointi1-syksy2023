package viikko2ehtolauseet;

import java.util.Scanner;

public class EiDemo {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.println("Anna nimesi: ");
		String nimi = lukija.nextLine();
		
		// JAVA-KIELESSÄ KOMENTO EQUALS MAHDOLLISTAA MERKKIJONOJEN VERTAILUN
		// VERTAILUA EI VOI TEHDÄ JAVASSA == MERKILLÄ, KUTEN TEHDÄÄN NUMEROILLE
		// ! ELI EI KÄÄNTÄÄ TRUE/FALSE ARVON TOISINPÄIN
		if(!nimi.equals("Jonathan")) {
			System.out.println("Nimesi ei ole Jonathan!");
		}

	}

}
