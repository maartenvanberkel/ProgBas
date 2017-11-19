package be.pxl.h5.exoef14;

import java.util.Scanner;

public class H5ExOef14 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef uw geslacht in. Voor mannen druk 1. Voor vrouwen druk 2: ");
		int geslacht = keyboard.nextInt();

		int aantalWerknemers = 0;
		int aantalSlechteConditie = 0;
		double percentageSlechteConditie = 0;
		double conditieGetal;

		while (geslacht == 1 || geslacht == 2) {

			System.out.println("Geef de afgelegde kilometers in 12 minuten in van de werknemen: ");
			double afgKm = keyboard.nextDouble();

			conditieGetal = (afgKm * 1000 - 504.9) / 44.73;
			aantalWerknemers++;

			if (geslacht == 1) {
				if (conditieGetal < 36) {
					aantalSlechteConditie++;
				}

			} else {
				if (conditieGetal < 29) {
					aantalSlechteConditie++;
				}
			}
			percentageSlechteConditie = (double) aantalSlechteConditie / aantalWerknemers * 100.0;
			
			System.out.println("Geef uw geslacht in. Voor mannen druk 1. Voor vrouwen druk 2: ");
			geslacht = keyboard.nextInt();
		}
		System.out.println("Het percentage van werknemers met een slechte conditie is " + percentageSlechteConditie + "%.");

		keyboard.close();
	}
}