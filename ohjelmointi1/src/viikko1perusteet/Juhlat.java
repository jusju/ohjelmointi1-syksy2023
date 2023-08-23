package viikko1perusteet;

import java.util.Scanner;

public class Juhlat {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		
		System.out.print("Anna juhliin tulevien aikuisten määrä: ");
		int aikuiset = lukija.nextInt();
		// 23
		int pulloja = (int) Math.ceil(aikuiset / 7.0);
		
		
		System.out.println("Pulloja tarvitaan " + pulloja + " kappaletta");
		int jaa = pulloja * 7 - aikuiset;
		System.out.println("Viimeisestä pullosta jää 5 lasia");

		
	}

}
