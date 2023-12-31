package viikko1perusteet;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Alv {
	public static void main(String[] args) {
		
		Scanner lukija = new Scanner(System.in);
		// DESIMALFORMAT ON TYÖKALU, JOLLA SAADAAN LUVUT ESIMERKIKSI
		// KAHDEN DESIMAALIN TARKKUUDELLA 
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		double alvMaara = 0; 
		
		System.out.print("Anna 1. tuotteen hinta: ");
		double hinta1 = lukija.nextDouble();
		alvMaara = hinta1 - (hinta1/1.14);
		System.out.println("Tuotteen 1 ALV on " + desimaalit.format(alvMaara) + " euroa.");
		
		System.out.print("Anna 2. tuotteen hinta: ");
		double hinta2 = lukija.nextDouble();		
		alvMaara = hinta2 - (hinta2/1.14);
		System.out.println("Tuotteen 2 ALV on " + desimaalit.format(alvMaara) + " euroa.");
		

		System.out.print("Anna 3. tuotteen hinta: ");
		double hinta3 = lukija.nextDouble();
		alvMaara = hinta3 - (hinta3/1.14);
		System.out.println("Tuotteen 3 ALV on " + desimaalit.format(alvMaara) + " euroa.");		
		
		//Anna 1. tuotteen hinta: 1,90
		//Tuotteen 1 ALV on 0,23 euroa.
		//Anna 2. tuotteen hinta: 8,90
		//Tuotteen 2 ALV on 1,09 euroa.
		//Anna 3. tuotteen hinta: 83,53
		//Tuotteen 4 ALV on 10,26 euroa.
	}
}
