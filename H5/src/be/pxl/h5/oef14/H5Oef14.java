package be.pxl.h5.oef14;

import java.util.Scanner;

public class H5Oef14 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef het artikelnummer in:");
		int artikelNummer = keyboard.nextInt();
		int allesOpgeteld = 0;
		int totaalBedrag = 0;

		while (artikelNummer != 999) {

			System.out.println("Hoeveel eenheden koopt u aan van dit artikel?:");
			int hoeveelheid = keyboard.nextInt();

			System.out.println("Wat is de eenheidsprijs van het artikel?:");
			int eenheidsPrijs = keyboard.nextInt();

			totaalBedrag = hoeveelheid * eenheidsPrijs;

			System.out.println("artikelnummer: " + artikelNummer + " kost: " + eenheidsPrijs + ". Indien u hiervan "
					+ hoeveelheid + " eenheden van koopt is het totaalbedrag " + totaalBedrag);

			allesOpgeteld = allesOpgeteld + totaalBedrag;

			System.out.println("Geef het artikelnummer in:");
			artikelNummer = keyboard.nextInt();
		}

		System.out.println("Al uw producten opgeteld kosten: " + allesOpgeteld + " euro.");

		keyboard.close();
	}
}