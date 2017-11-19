package be.pxl.h5.oef18;

import java.util.Scanner;

public class H5Oef18 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een nummer in om de faculteit te berekenen: ");
		int number = keyboard.nextInt();

		while (number > 0) {

			int prod = 1;
			for (int i = 2; i <= number; i++) {
				prod = prod * i;
			}

			System.out.println("De faculteit van " + number + " is " + prod + "\n");

			System.out.println("Geef een positief getal in om de faculteit te berekenen, geef 0 in om te stoppen: ");
			number = keyboard.nextInt();
		}
		keyboard.close();
	}
}
