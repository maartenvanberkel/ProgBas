package be.pxl.h5.oef10;

import java.util.Scanner;

public class H5Oef10 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef het bruto jaarwedde in:");
		double jaarWedde = keyboard.nextDouble();

		System.out.println("Geef de beoordelingscode in:");
		int beoordelingCode = keyboard.nextInt();

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

		System.out.println("De eindejaarspremie is " + eindejaarsPremie);

		keyboard.close();
	}
}