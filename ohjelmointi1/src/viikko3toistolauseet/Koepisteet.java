package viikko3toistolauseet;

public class Koepisteet {

	public static void main(String[] args) {
		int summa = 0;
		int pisteet;
		int lkm = 0;
		Scanner lukija = new Scanner(System.in);
		System.out.print("Anna koepisteet:");
		pisteet = lukija.nextInt();
		while (pisteet >= 0) {
			summa = summa + pisteet;
			lkm = lkm + 1; // tai lkm++;
			System.out.print("Anna koepisteet: ");
			pisteet = lukija.nextInt();
		}
		double keskiarvo = (double) summa / lkm;
		DecimalFormat desi = new DecimalFormat("0.00");
		System.out.println("Keskiarvo on " + desi.format(keskiarvo));

	}

}
