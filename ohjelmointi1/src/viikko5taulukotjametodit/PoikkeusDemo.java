package viikko5taulukotjametodit;

import java.util.Scanner;

public class PoikkeusDemo {

	public static void main(String[] args) {
		// MARS OHJELMA TÄMÄN KERRAN PAKOLLISISSA HARKOISSA
		// OTTAA SYÖTTEEKSEEN LUVUN JA JOS LUVUN SIJASTA SYÖTTÄÄ
		// MERKKIJONON NIIN OHJELMA KAATU
		Scanner lukija = new Scanner(System.in);
		System.out.println("Anna yksi lämpötila Marsista (-100 - 2): ");
		try {
			int lampotila = lukija.nextInt();
			System.out.println("Annoit lämpötilan: " + lampotila);
		} catch (Exception ex) {
			System.out.println("Annoit lämpötilan väärässä muodossa.");
			System.out.println("Shit happens.");
		} finally {
			lukija.close();	
		}

	}
}
