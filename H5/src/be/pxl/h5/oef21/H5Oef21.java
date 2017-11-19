package be.pxl.h5.oef21;

import java.util.Scanner;

public class H5Oef21 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int beoordelingCode = 0;
		int aantalIngave = 0;
		int aantalSchitterend = 0;
		double percentageSchitterend;

		System.out.println("Geef het bruto jaarwedde in:");
		double jaarWedde = keyboard.nextDouble();

		while (jaarWedde != 0) {
			System.out.println("Geef de beoordelingscode in:");
			beoordelingCode = keyboard.nextInt();

			System.out.println("De eindejaarspremie is " + berekenEindejaarsPremie(jaarWedde, beoordelingCode) + "\n");

			aantalIngave++;
			
			if (beoordelingCode == 4) {
				aantalSchitterend++;
			}

			System.out.println("Geef het bruto jaarwedde in:");
			jaarWedde = keyboard.nextDouble();
		}
		percentageSchitterend = (double) aantalSchitterend / aantalIngave * 100;
		
		System.out.println("Het percentage van de personeelsleden met beoordelingscode schitterend is: "
				+ percentageSchitterend + "%.");

		keyboard.close();
	}

	public static double berekenEindejaarsPremie(double jaarWedde, int beoordelingCode) {
		double vastGedeelte = jaarWedde * 0.05;
		double percentage = 0;
		double eindejaarsPremie;

		switch (beoordelingCode) {
		case 1:
			percentage = 0;
			break;
		case 2:
			percentage = 0.18;
			break;
		case 3:
			percentage = 0.25;
			break;
		case 4:
			percentage = 0.33;
			break;
		}
		eindejaarsPremie = vastGedeelte + vastGedeelte * percentage;

		return eindejaarsPremie;
	}
}