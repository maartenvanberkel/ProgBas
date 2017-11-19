package be.pxl.h5.oef15;

import java.util.Scanner;

public class H5Oef15 {

	public static void main(String[] args) {
		double highest = -273.15;
		double temperatuur;
		double som = 0;
		int count;
		double gemiddelde = 0;

		Scanner keyboard = new Scanner(System.in);

		for (count = 1; count <= 10; count++) {
			System.out.println("Geef de temperatuur gemeten op 12.00u in:");
			temperatuur = keyboard.nextDouble();

			if (temperatuur > highest) {
				highest = temperatuur;
			}
			som = som + temperatuur;
			gemiddelde = som / count;
		}
		System.out.println("De hoogst gemeten temperatuur van de laatste 10 dagen is: " + highest + " graden Celcius.");
		System.out.println("De gemiddelde temperatuur van de laatste 10 dagen is: " + gemiddelde + " graden Celcius.");

		keyboard.close();
	}
}