package viikko2ehtolauseet;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Palkka {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		DecimalFormat formaatteri = new DecimalFormat("0.00");
		System.out.print("Anna palkka: ");
		int palkka = lukija.nextInt();
		// KOSKA LUETTIIN LUKU, NIIN PUSKURIIN JÄI ENTER
		// ENTERIN POISTO
		lukija.nextLine();
		System.out.print("Anna veroprosentti: ");	
		double veroprosentti = lukija.nextDouble();
		lukija.nextLine();
		System.out.print("Anna ikä: ");
		int ika = lukija.nextInt();
		lukija.nextLine();
		
		System.out.println("Bruttopalkka " + palkka);
		double veronOsuus = palkka * (veroprosentti/100);
		System.out.println("Veron osuus " + formaatteri.format(veronOsuus));
		// Työeläkevakuutusmaksun osuus on palkka * XX, missä XX on joko 0.0825 tai 0.0675 riippuen iästä
		double tyoelakeVakuutusMaksu = 0;
		if(ika >=53 && ika <= 62) {
			tyoelakeVakuutusMaksu = 0.0825 * palkka;
		} else {
			tyoelakeVakuutusMaksu = 0.0675 * palkka;
		}
		double tyottomyysvakuutus = palkka * 0.015; 
		System.out.println("Työeläkevakuutusmaksun osuus " + 
				formaatteri.format(tyoelakeVakuutusMaksu));
		System.out.println("Työttömyysvakuutuksen osuus " + 
				formaatteri.format(tyottomyysvakuutus));
		double kaateenJaa = palkka - tyoelakeVakuutusMaksu - tyottomyysvakuutus - veronOsuus;
		System.out.println("Käteen jää  " + formaatteri.format(kaateenJaa));

	}

}
