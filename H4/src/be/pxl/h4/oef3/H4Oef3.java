package be.pxl.h4.oef3;

import java.util.Scanner;

public class H4Oef3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Hoeveel kost het product per eenheid?");
		int eenheidsprijs = keyboard.nextInt();

		System.out.println("Hoeveel eenheden van dit product koopt de klant?");
		int aantalEenheden = keyboard.nextInt();

		int korting = 0;
		int totaalBedrag = (eenheidsprijs * aantalEenheden);

		if (totaalBedrag > 1000) {
			korting = 22;
		} else {
			if (totaalBedrag > 500) {
				korting = 10;
			}
		}
		int kortingPrijs = (totaalBedrag - korting);

		System.out.println("Het totaalbedrag zonder korting is " + totaalBedrag);
		System.out.println("Het totaalbedrag met korting is " + kortingPrijs);
		keyboard.close();
	}
}