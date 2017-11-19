package be.pxl.h5.opdr16;

import java.util.Scanner;

public class H5Opdr16 {

	// public static void main(String[] args) {
	// Scanner keyboard = new Scanner(System.in);
	//
	// System.out.println("Geef een getal waarvan je de tafel wil zien: ");
	// int getal = keyboard.nextInt();
	//
	// toonTafel(getal);
	//
	// keyboard.close();
	// }
	//
	// public static void toonTafel(int getal) {
	//
	// for (int teller = 1; teller <= 10; teller++) {
	// int result = teller * getal;
	//
	// System.out.println(teller + " X " + getal + " = " + result);
	// }
	// }

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een bedrag in om te belasten: ");
		int bedrag = keyboard.nextInt();

		berekeningBelasting(bedrag);
		


		keyboard.close();
		
		System.out.println("Voor een bedrag van " + bedrag + " euro moet je " + berekeningBelasting(bedrag) + " euro belasting betalen.");

	}

	public static double berekeningBelasting(int bedrag) {

		double resultaat = 0;

		if (bedrag <= 25000) {
			resultaat = bedrag * 0.384;
		} else {
			if (bedrag <= 55000) {
				resultaat = 25000 * 0.384 + (bedrag - 25000) * 0.5;
			} else {
				resultaat = 25000 * 0.384 + 30000 * 0.5 + (bedrag - 55000) * 0.6;
			}
		}
		return resultaat;
	}
}
