package viikko5taulukotjametodit;

import java.util.Scanner;

public class Veriryhma {

	public void aja() {
		Scanner lukija = new Scanner(System.in);
		String veriryhma = "";
		int veriryhmaOplusMaara=0;
		int veriryhmaOmiinusMaara=0;
		int veriryhmaAplusMaara=0;
		int veriryhmaAmiinusMaara=0;
		int veriryhmaBplusMaara=0;
		int veriryhmaBmiinusMaara=0;
		int luovutustenMaara = 0;
		
		while (!veriryhma.equals("-")) {
			// METODIN KUTSU
			kysyVeriryhma();
			veriryhma = lukija.nextLine();

			if(veriryhma.equals("-")) {
				// break HYPPÄÄ ULOS LÄHIMMÄSTÄ SILMUKASTA
				break;
			}
			luovutustenMaara++;
			if(veriryhma.equals("O+")) {
				veriryhmaOplusMaara++;
			} else if(veriryhma.equals("O-")) {
				veriryhmaOmiinusMaara++;
			} else if(veriryhma.equals("A+")) {
				veriryhmaAplusMaara++;
			} else if(veriryhma.equals("A-")) {
				veriryhmaAmiinusMaara++;
			} else if(veriryhma.equals("B+")) {
				veriryhmaBplusMaara++;
			} else if(veriryhma.equals("B-")) {
				veriryhmaBmiinusMaara++;
			}

		}
		System.out.println("Luovutuksia oli yhteensä " + luovutustenMaara);
		System.out.println("Minkä veriryhmän luovutusten määrän haluat tietää: ");
		String minkaMaara = lukija.nextLine();
		if(minkaMaara.equals("O+")) {
			System.out.println("Veriryhmän O- luovutuksia oli " + veriryhmaOplusMaara);
		} else if(minkaMaara.equals("O-")) {
			System.out.println("Veriryhmän O- luovutuksia oli " + veriryhmaOmiinusMaara);
		} else if(minkaMaara.equals("A+")) {
			System.out.println("Veriryhmän A+ luovutuksia oli " + veriryhmaAplusMaara);
		} else if(minkaMaara.equals("A-")) {
			System.out.println("Veriryhmän A- luovutuksia oli " + veriryhmaAmiinusMaara);
		} else if(minkaMaara.equals("B+")) {
			System.out.println("Veriryhmän B+ luovutuksia oli " + veriryhmaBplusMaara);
		} else if(minkaMaara.equals("B-")) {
			System.out.println("Veriryhmän B- luovutuksia oli " + veriryhmaBmiinusMaara);
		}
	}

	// METODIN/FUNKTION MÄÄRITYS
	public void kysyVeriryhma() {
		System.out.print("Anna veriryhmä (- lopettaa): ");
	}

	public static void main(String[] args) {
		Veriryhma olio = new Veriryhma();
		olio.aja();
	}
}
