package viikko2ehtolauseet;

import java.util.Scanner;

public class IkaDemo {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.print("Anna ikä: ");
		int ika = lukija.nextInt();
		if (ika < 0 || ika > 120) {
			System.out.println("Virheellinen ikä");
		} else if ((ika < 0 || ika > 120) && ika < 18) {
			System.out.println("Alaikäinen");
		} else if(ika < 0) {
			System.out.println("Et ole syntynyt!");
		} else if(ika > 24) {
			System.out.println("Pääset mummotunneliin!!");
		} else {
			System.out.println("Täysi-ikäinen");
		}
	}
}
