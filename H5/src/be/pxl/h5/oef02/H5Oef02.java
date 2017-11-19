package be.pxl.h5.oef02;

import java.util.Scanner;

public class H5Oef02 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Hoeveel artikels wil u bestellen?");
		int aantalArtikels = keyboard.nextInt();

		final double eenheidsPrijs = 11.5;
		final double btwPercentage = 0.21;

		double bedragExBtw = aantalArtikels * eenheidsPrijs;
		double btwBedrag = aantalArtikels * eenheidsPrijs * btwPercentage;
		double bedragInclBtw = bedragExBtw + btwBedrag;

		System.out.println("Het totaalbedrag exclusief de BTW is " + bedragExBtw + " euro.");
		System.out.println("Het BTW bedrag  is " + btwBedrag + " euro.");
		System.out.println("Het totaalbedrag inclusief de BTW is " + bedragInclBtw + " euro.");

		keyboard.close();
	}
}