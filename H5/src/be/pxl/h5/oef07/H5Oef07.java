package be.pxl.h5.oef07;

import java.util.Scanner;

public class H5Oef07 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Wat is de afstand (km) van de vlucht?:");
		int afstand = keyboard.nextInt();

		System.out.println("Wat is de klasse (1 of 2 of 3) van de vlucht?: ");
		int klasse = keyboard.nextInt();

		double prijsKm = 0.12;

		if (afstand < 1000) {
			prijsKm = 0.25;
		} else {
			if (afstand <= 2999) {
				prijsKm = 0.20;
			}
		}

		int prijsTicket = (int) (afstand * prijsKm);

		double extraZakenreis = 1.30;
		double kortingCharter = 0.20;

		if (klasse == 1) {
			prijsTicket = prijsTicket;

		} else {
			if (klasse == 2) {
				prijsTicket = (int) (prijsTicket - prijsTicket * kortingCharter);
			} else {
				prijsTicket = (int) (prijsTicket * extraZakenreis);
			}
		}

		System.out.println("De prijs van het ticket is " + prijsTicket + " euro.");

		keyboard.close();
	}
}