package viikko2ehtolauseet;

import java.util.Scanner;

public class Katsastus {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.print("Onko 1=katsastus, 2=jälkitarkastus: ");
		int tarkastusTyyppi = lukija.nextInt();
		if(tarkastusTyyppi == 1) {
			System.out.print("Mitataanko päästöt 0=ei, 1=kyllä: ");
			int paastoMittaus = lukija.nextInt();
			if(paastoMittaus == 1) {
				System.out.println("Onko auto 0=bensa, 1=diesel: ");
				int bensaVaiDiesel = lukija.nextInt();
				if(bensaVaiDiesel == 0) {
					System.out.println("Hinta on 72");
				} else {
					System.out.println("Hinta on 81");
				}
			} else {
				System.out.println("Hinta on 50");	
			}
		} else  {
			System.out.println("Hinta on 30");
		}
	}
}
