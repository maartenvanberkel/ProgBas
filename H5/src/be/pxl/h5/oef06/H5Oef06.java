package be.pxl.h5.oef06;

import java.util.Scanner;

public class H5Oef06 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hoeveel artikels wil u bestellen?");
		double aantalArtikels = keyboard.nextDouble();
		
		double eenheidsPrijs = 11.5;
		double btwPercentage = 0.21;
		double reductiePercentage = 0.0;
		
		double totaalBedrag = eenheidsPrijs * aantalArtikels * btwPercentage + eenheidsPrijs * aantalArtikels;
		
		if (totaalBedrag > 1000) {
			reductiePercentage = 0.1;
		}
		
		double gereduceerdTotaal = totaalBedrag - totaalBedrag * reductiePercentage;
		
		System.out.println("Het totaalbedrag is " + gereduceerdTotaal + " euro.");
		
		keyboard.close();
	}
}