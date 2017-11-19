package be.pxl.h5.oef22;

import java.util.Scanner;

public class H5Oef22 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double oppervlakte;

		System.out.println("Geef de lengte van het te verven plafond in (m): ");
		double lengte = keyboard.nextDouble();

		System.out.println("Geef de breedte van het te verven plafond in (m): ");
		double breedte = keyboard.nextDouble();

		oppervlakte = lengte * breedte;

		berekenenBenodigdeVerf(oppervlakte);

		System.out.println("De hoeveelheid verf die nodig is om een plaffond van " + oppervlakte
				+ " vierkante meter te verven is " + berekenenBenodigdeVerf(oppervlakte) + " liter. \n");

		System.out.println("In potten van hoeveel liter wordt de verf verkocht?: ");
		int k = keyboard.nextInt();

		System.out
				.println("Je hebt " + berekenAantalPotten(oppervlakte, k) + " potten verf van " + k + " liter nodig.");

		keyboard.close();
	}

	public static double berekenenBenodigdeVerf(double oppervlakte) {
		double Benodigdeverf = oppervlakte / 7;

		return Benodigdeverf;
	}

	public static int berekenAantalPotten(double oppervlakte, int k) {

		int hoeveelheidPotten = (int) (berekenenBenodigdeVerf(oppervlakte) / k);

		if (berekenenBenodigdeVerf(oppervlakte) % k != 0) {
			hoeveelheidPotten = (int) (berekenenBenodigdeVerf(oppervlakte) / k + 1);
		}

		return hoeveelheidPotten;
	}

}