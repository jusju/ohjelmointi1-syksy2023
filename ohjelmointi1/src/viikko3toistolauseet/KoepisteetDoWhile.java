package viikko3toistolauseet;

import java.text.DecimalFormat;
import java.util.Scanner;

public class KoepisteetDoWhile {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);		
		int koepisteet = 0;
		int summa = 0;
		int lkm = 0;
		
		do {

			System.out.print("Anna koepisteet:");
			koepisteet = lukija.nextInt();
			if(koepisteet <= 0) {
				break;
			}
			summa = summa + koepisteet;
			lkm = lkm + 1; // tai lkm++;
		} while(koepisteet >= 0);
		
		double keskiarvo = (double) summa / lkm;
		DecimalFormat desi = new DecimalFormat("0.00");
		System.out.println("Keskiarvo on " + desi.format(keskiarvo));

	}
}
