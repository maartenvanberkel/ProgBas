package be.pxl.h5.exoef06;

import java.util.Scanner;

public class H5ExOef06 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Hoeveel gram weeg de brief?:");
		int gewicht = keyboard.nextInt();

		double prijs;

		if (gewicht <= 20) {
			prijs = 0.3;
		} else {
			if (gewicht <= 50) {
				prijs = 0.5;
			} else {
				if (gewicht <= 150) {
					prijs = 0.7;
				} else {
					if (gewicht <= 250) {
						prijs = 1.0;
					} else {
						prijs = 1.9;
					}
				}
			}
		}
		System.out.println(
				"Een brief met een gewicht van " + gewicht + " gram moet " + prijs + " euro gefrankeerd worden.");
		keyboard.close();
	}
}