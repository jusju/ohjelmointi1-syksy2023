package viikko3toistolauseet;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Puhelinlasku {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		
		System.out.println("Anna rahasumma puhelinlaskulle 1");
		String puhelinlasku1 = lukija.nextLine();
		
		// WRAPPER LUOKAN AVULLA MUUTTUJAN TYYPIN VAIHTAMINEN
		double puhelinLasku1Double = Double.parseDouble(puhelinlasku1);
		
		System.out.println("Anna rahasumma puhelinlaskulle 2");
		String puhelinlasku2 = lukija.nextLine();
		double puhelinLasku2Double = Double.parseDouble(puhelinlasku2);	
		DecimalFormat formaatteri = new DecimalFormat("0.00");
		double yhteensa = puhelinLasku1Double + puhelinLasku2Double;
		System.out.print("Haluttu yhteissumma lukuna on ");
		System.out.println(formaatteri.format(yhteensa) + " euroa");		

	}

}
