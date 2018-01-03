package be.pxl.h8.exoef1;

public class DatumBewerkingen {
	// private int dag;
	// private int maand;
	// private int jaar;
	private static String[] maandNamen = { "januari", "februari", "maart", "april", "mei", "juni", "juli", "augustus",
			"september", "oktober", "november", "december" };
	
	private static int[] maandDagen = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public DatumBewerkingen() {

	}

	public void printDatum(int dag, int maand, int jaar) {
		System.out.print(dag + " " + maandNamen[maand - 1] + " " + jaar);
	}

	public boolean bepaalSchrikkelJaar(int jaar) {
		boolean schrikkeljaar = false;

//		if (jaar % 4 == 0) {
//			schrikkeljaar = true;
//		}
//
//		if (jaar % 100 == 0) {
//			schrikkeljaar = false;
//		}
//		
//		if (jaar % 400 == 0) {
//			schrikkeljaar = true;
//		}
		
		if (jaar % 4 == 0) {
			schrikkeljaar = true;
			if (jaar % 100 == 0) {
				schrikkeljaar = false;
				if (jaar % 400 == 0) {
					schrikkeljaar = true;
				}
			}
		}

		if (schrikkeljaar) {
			System.out.println(jaar + " is een schrikkeljaar");
		} else {
			System.out.println(jaar + " is GEEN schrikkeljaar");
		}
		return schrikkeljaar;
	}
	
	public int dagVanHetJaar(int dag, int maand, int jaar) {
		int aantalDagen = 0;
		
		if (bepaalSchrikkelJaar(jaar)) {
			maandDagen[1] = 29;
		}
		
		for (int i = 0; i < maandDagen.length; i++) {
			if (i + 1 == maand) {
				i = 11;
				aantalDagen = aantalDagen + dag;
			} else {
				aantalDagen = aantalDagen + maandDagen[i];
			}
		}
		
		
		return aantalDagen;
	}
}
