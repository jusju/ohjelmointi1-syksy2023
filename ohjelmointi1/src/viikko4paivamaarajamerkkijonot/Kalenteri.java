package viikko4paivamaarajamerkkijonot;

import java.time.LocalDate;
import java.util.Scanner;

public class Kalenteri {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.print("Syötä vuosi: ");
		int vuosi = lukija.nextInt();
		System.out.print("Syötä kuukausi: ");
		int kuukausi = lukija.nextInt();

		LocalDate paivamaara = LocalDate.of(vuosi, kuukausi, 1);
		System.out.println();
		System.out.println("Ma Ti Ke To Pe La Su");
		boolean ekanPaivamaaranViikonpaivaOnTama = false;
		while (paivamaara.getMonthValue() == kuukausi) {
			while (ekanPaivamaaranViikonpaivaOnTama == false) {
				if (paivamaara.getDayOfWeek().getValue() == 2) {
					System.out.print(" 1 ");
					ekanPaivamaaranViikonpaivaOnTama = true;
				} else if (paivamaara.getDayOfWeek().getValue() == 3) {
					System.out.print("    1 ");
					ekanPaivamaaranViikonpaivaOnTama = true;
				} else if (paivamaara.getDayOfWeek().getValue() == 4) {
					System.out.print("       1 ");
					ekanPaivamaaranViikonpaivaOnTama = true;
				} else if (paivamaara.getDayOfWeek().getValue() == 5) {
					System.out.print("          1 ");
					ekanPaivamaaranViikonpaivaOnTama = true;
				} else if (paivamaara.getDayOfWeek().getValue() == 6) {
					System.out.print("             1 ");
					ekanPaivamaaranViikonpaivaOnTama = true;
				} else if (paivamaara.getDayOfWeek().getValue() == 7) {
					System.out.print("                1 ");
					ekanPaivamaaranViikonpaivaOnTama = false;
				} else if (paivamaara.getDayOfWeek().getValue() == 1) {
					System.out.print("                   1 ");
					ekanPaivamaaranViikonpaivaOnTama = true;
				}
			}
			System.exit(0);

		}

	}

}
