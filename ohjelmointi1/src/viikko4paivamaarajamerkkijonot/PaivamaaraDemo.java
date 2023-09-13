package viikko4paivamaarajamerkkijonot;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PaivamaaraDemo {
	public static void main(String[] args) {
		// LOCALDATE TYYPPISEN MUUTUJAN LUONTI
		LocalDate syyskuunEka = LocalDate.parse("2023-09-01");

		DateTimeFormatter muotoilu = DateTimeFormatter.ofPattern("d.M.yyyy");
		System.out.println(syyskuunEka.format(muotoilu));
	}
}
