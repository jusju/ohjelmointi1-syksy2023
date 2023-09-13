package viikko4paivamaarajamerkkijonot;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Erapaiva {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.print("Anna laskun päivämäärä (vvvv-kk-pp): ");
		String stringPaivamaara = lukija.nextLine();

		LocalDate pvm = LocalDate.parse(stringPaivamaara);
		// MITEN SELVITETÄÄN PÄIVÄMÄÄRÄ 2 VIIKKOA ETEENPÄIN ?
		LocalDate erapaiva = pvm.plusWeeks(2);
		System.out.println("Eräpäivä on " + erapaiva);	
	}
}
