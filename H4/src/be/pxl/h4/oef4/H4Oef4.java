package be.pxl.h4.oef4;

import java.util.Scanner;

public class H4Oef4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int huidigJaartal = 2017;
		int basisprijsFilm = 5;

		System.out.println("Van welk jaartal is de gehuurde film?");
		int jaartalFilm = keyboard.nextInt();

		System.out.println("Wat is de rating van de gehuurde film?");
		int ratingFilm = keyboard.nextInt();

		if (huidigJaartal - jaartalFilm < 2) {
			basisprijsFilm = basisprijsFilm + 1;
		}
		if (ratingFilm >= 4) {
			basisprijsFilm = basisprijsFilm + 2;
		} else {
			if (ratingFilm >= 2) {
				basisprijsFilm = basisprijsFilm + 1;
			}
		}
		if (basisprijsFilm > 7) {
			basisprijsFilm = 7;
		}
		System.out.println("de totale prijs voor de film is " + basisprijsFilm);

		keyboard.close();
	}
}
