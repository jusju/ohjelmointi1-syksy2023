package viikko1perusteet;

import java.util.Scanner;

public class HeiEtunimi {

	public static void main(String[] args) {
		// SKANNERI MUUTTUJAN LUONTI
		Scanner lukija = new Scanner(System.in);
		System.out.println("Syötä etunimi: ");
		// KYSYTÄÄN NIMI NEXTLINE-KOMENNON AVULLA
		// JA TALLETETAAN VASTAUS MUUTTUJAAN NIMELTÄÄN
		// NIMI
		String nimi = lukija.nextLine();
		// PLUS MERKKI JAVA-OHJELMASSA VOI TARKOITTAA
		// MUUTAMAA ASIAA
		// 1) LASKEA KAKSI LUKUA YHTEEN
		// 2) "PÖTKÖTTÄÄ" tekstin pätkiä toisten perään
		// ELI KONKATETOIDA
		System.out.println("Hei " + nimi + "!");
	}
}
