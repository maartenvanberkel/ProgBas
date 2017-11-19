package be.pxl.h5.oef03;

import java.util.Scanner;

public class H5Oef03 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Hoeveel kilometers legt u per jaar af?");
		int afgKm = keyboard.nextInt();

		System.out.println("Hoeveel liter gebruikt uw auto gemiddeld per 100 kilometer?");
		double verbruik = keyboard.nextDouble();

		System.out.println("Wat is gemiddelde prijs per liter brandstof?");
		double prijsL = keyboard.nextDouble();

		double prijsPerKm = verbruik * prijsL / 100;
		double totaleVerbruiksKosten = prijsPerKm * afgKm;

		System.out.println("De totale verbruikskosten per jaar voor het opgegeven aantal kilometers is "
				+ totaleVerbruiksKosten + " euro.");
		System.out.println("De kostprijs per kilometer is " + prijsPerKm + " euro.");

		keyboard.close();
	}
}