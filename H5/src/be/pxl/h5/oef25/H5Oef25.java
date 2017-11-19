package be.pxl.h5.oef25;

import java.util.Scanner;

public class H5Oef25 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double lengte = 0;
		double gewicht = 0;
		double aantalPersonen = 0;
		double aantalPersonenMetOvergewicht = 0;
		double percentageMetOvergwicht = 0;
		double gemiddeldeLengteVrouwen = 0;
		double totaalLengteVrouwen = 0;
		double lengteKleinsteMan = 999999999;
		int aantalVrouwen = 0;
		int aantalMannen = 0;

		System.out.println("Bent u een vrouw? druk 0. Bent u een man? druk 1. Om te stoppen drukt u op 2:");
		int geslacht = keyboard.nextInt();

		while (geslacht != 2) {
			System.out.println("Wat is uw lengte? (m): ");
			lengte = keyboard.nextDouble();

			System.out.println("Wat is uw gewich? (kg):");
			gewicht = keyboard.nextDouble();

			aantalPersonen++;
			if (berekeningBmi(lengte, gewicht) >= 25) {
				aantalPersonenMetOvergewicht++;
			}
			percentageMetOvergwicht = aantalPersonenMetOvergewicht / aantalPersonen * 100;

			
			if (geslacht == 0 || geslacht == 1) {
				if (geslacht == 0) {
					aantalVrouwen++;
					totaalLengteVrouwen = totaalLengteVrouwen + lengte;
				} else {
					if (lengte > lengteKleinsteMan) {
						aantalMannen++;
					} else {
						aantalMannen++;
						lengteKleinsteMan = lengte;
					}
				}
			} else {
				System.out.println("foutieve ingave. Geef een 0 indien u een vrouw bent. Geef een 1 indien u een man bent. Om te stoppen, druk 2:");
			}
			
			gemiddeldeLengteVrouwen = totaalLengteVrouwen / aantalVrouwen;

			System.out.println("Bent u een vrouw? druk 0. Bent u een man? druk 1. Om te stoppen drukt u op 2.");
			geslacht = keyboard.nextInt();
		}

		berekeningBmi(lengte, gewicht);

		System.out.println("Het percentage personen met overgewicht is: " + percentageMetOvergwicht + "%. \n");

		if (aantalVrouwen > 0) {
			System.out.println("De gemiddelde lengte van de vrouwen is: " + gemiddeldeLengteVrouwen + " meter. \n");
		} else {
			System.out.println("Er werden geen gegevens van vrouwen geregistreerd. \n");
		}

		if (aantalMannen > 0) {
			System.out.println("De kleinste man heeft een lengte van " + lengteKleinsteMan + " meter.");
		} else {
			System.out.println("Er werden geen gegevens van mannen geregistreerd.");
		}

		keyboard.close();
	}

	public static int berekeningBmi(double lengte, double gewicht) {

		int bmi = (int) (gewicht / lengte * lengte);
		if (bmi < 18) {
			System.out.println("U heeft ondergewicht. \n");
		} else {
			if (bmi < 25) {
				System.out.println("U heeft een normaal gewicht. \n");
			} else {
				if (bmi < 27) {
					System.out.println("U heeft neiging tot overgewicht. \n");
				} else {
					if (bmi < 30) {
						System.out.println("U heeft overgewicht. \n");
					} else {
						if (bmi < 40) {
							System.out.println("U heeft obesitas. \n");
						} else {
							System.out.println("U heeft ernstige obesitas. \n");
						}
					}
				}
			}
		}
		return bmi;
	}
}