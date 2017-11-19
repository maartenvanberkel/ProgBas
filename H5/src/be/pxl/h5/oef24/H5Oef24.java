package be.pxl.h5.oef24;

import java.util.Scanner;

public class H5Oef24 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int hoeveelheidSterren = 0;
		int jaarFilm = 0;
		int speeltijd = 0;
		int genreNummer = 0;
		double totaalPrijs = 0;
		double gemiddeldePrijs = 0;

		System.out.println("Hoeveel films huurt de klant?: ");
		int aantalFilms = keyboard.nextInt();

		for (int i = 1; i <= aantalFilms; i++) {

			System.out.println("Wat is het genrenummer van de gehuurde film?: ");
			genreNummer = keyboard.nextInt();

			System.out.println("Hoeveel sterren heeft de film?: ");
			hoeveelheidSterren = keyboard.nextInt();

			System.out.println("In welk jaar is de film uitgebracht?: ");
			jaarFilm = keyboard.nextInt();

			System.out.println("Wat is de speeltijd van de film in minuten?: ");
			speeltijd = keyboard.nextInt();

			totaalPrijs = totaalPrijs + berekenenHuurPrijs(hoeveelheidSterren, jaarFilm, genreNummer, speeltijd);
			gemiddeldePrijs = totaalPrijs / aantalFilms;

			System.out.println("De prijs voor film " + i + " is "
					+ berekenenHuurPrijs(hoeveelheidSterren, jaarFilm, genreNummer, speeltijd) + " euro. De film mag "
					+ berekenenHuurTijd(jaarFilm, hoeveelheidSterren, genreNummer) + "dag(en) gehuurd worden. \n");
		}

		berekenenHuurPrijs(hoeveelheidSterren, jaarFilm, genreNummer, speeltijd);

		berekenenHuurTijd(jaarFilm, hoeveelheidSterren, genreNummer);

		System.out.println("De totaalprijs voor de gehuurde films is " + totaalPrijs + " euro.");
		System.out.println("De gemiddelde prijs per gehuurde film is " + gemiddeldePrijs + " euro.");

		keyboard.close();
	}

	public static double berekenenHuurPrijs(int hoeveelheidSterren, int jaarFilm, int genreNummer, int speeltijd) {
		int huidigJaar = 2017;
		double huurPrijs = 0;

		if (genreNummer / 10000 != 1) {
			switch (hoeveelheidSterren) {
			case 1:
				huurPrijs = 3;
				break;
			case 2:
			case 3:
				huurPrijs = 3.75;
				break;
			case 4:
			case 5:
				huurPrijs = 4.5;
				break;
			}

			if (huidigJaar - jaarFilm > 10) {
				huurPrijs = huurPrijs - 0.5;
			}
		} else {
			huurPrijs = speeltijd * 0.005;
		}
		return huurPrijs;
	}

	public static int berekenenHuurTijd(int jaarFilm, int hoeveelheidSterren, int genreNummer) {
		int huurTijd = 2;
		int huidigJaar = 2017;

		if (huidigJaar - jaarFilm <= 2 && (genreNummer / 10000 == 5 || hoeveelheidSterren == 5)) {
			huurTijd = 1;
		}
		return huurTijd;
	}
}