package be.pxl.h5.exoef07;

import java.util.Scanner;

public class H5ExOef07 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef de verkoopprijs incl. BTW van het artikel:");
		double verkoopPrijs = keyboard.nextDouble();
		
		System.out.println("Geef het artikelnummer in:");
		int artikelNummer = keyboard.nextInt();
		
		double btwPercentage;
		int beginArtikelnummer = artikelNummer / 1000;
		
		
		switch (beginArtikelnummer) {
		case 1:
			btwPercentage = 0.06;
			break;
		case 2:
			btwPercentage = 0.17;
			break;
		case 3:
			btwPercentage = 0.19;
			break;
		case 4:
			btwPercentage = 0.25;
			break;
		case 5:
			btwPercentage = 0.33;
			break;
		default:
			btwPercentage = 0.21;
			break;
		}
		
		
		double btwPrijs = verkoopPrijs * btwPercentage;
		double prijsExclBtw = verkoopPrijs - btwPrijs;
		
		System.out.println("Het btw percentage is " + btwPercentage * 100 + "%, de verkoopprijs excl. btw is " + prijsExclBtw + " en het BTWbedrag is " + btwPrijs);
		
		
		keyboard.close();
	}
}