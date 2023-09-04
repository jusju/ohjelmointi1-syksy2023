package viikko2ehtolauseet;

import java.util.Scanner;

public class Rikesakko {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.print("Anna nopeusrajoitus: ");
		int nopeusrajoitus = lukija.nextInt();
		System.out.print("Anna nopeutesi: ");
		int nopeusNyt = lukija.nextInt();
		
		int ylinopeus = nopeusNyt - nopeusrajoitus;
		int sakonMaara = 0;
		
		if(ylinopeus > 20) {
			System.out.println("Menee päiväsakoille");
		} else if(nopeusrajoitus >= 10 && nopeusrajoitus <= 60){
			if(ylinopeus <= 15) {
				sakonMaara = 170;
			} else if(ylinopeus > 15 && ylinopeus <= 20) {
				sakonMaara = 200;
			}	
		}
		System.out.println("Sakonmäärä: " + sakonMaara);
	}
}
