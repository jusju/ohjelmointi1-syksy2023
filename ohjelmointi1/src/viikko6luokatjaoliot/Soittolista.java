package viikko6luokatjaoliot;

import java.util.ArrayList;

public class Soittolista {
	// YKSITYINEN OLIOMUUTTUJA - PRIVATE ATTRIBUTE
	private ArrayList<Kappale> kappaleet = new ArrayList<Kappale>();

	public Soittolista() {
		kappaleet = new ArrayList<Kappale>();
	}

	public Kappale getKappale(int indeksi) {
		Kappale kappale = new Kappale();
		int listanKoko = kappaleet.size();
		if (indeksi <= listanKoko) {
			kappale = kappaleet.get(indeksi);
		} else {
			return null;
		}
		return kappale;
	}

	public int haeKokonaispituus() {
		int pituusYhteensa = 0;
		for (int i = 0; i < kappaleet.size(); i++) {
			Kappale kappale = kappaleet.get(i);
			pituusYhteensa = pituusYhteensa + kappale.getKesto();
		}
		return pituusYhteensa;
	}

	public void lisaaKappale(Kappale kappale) {
		// LISÄTÄN KAPPALE ARRAYLISTIIN
		kappaleet.add(kappale);
	}

	@Override
	public String toString() {
		String paluuTeksti = "";
		for (int i = 0; i < kappaleet.size(); i++) {
			paluuTeksti = paluuTeksti + ((i + 1) + ": " + kappaleet.get(i).getNimi() + "\n");
		}
		return paluuTeksti;
	}

}
