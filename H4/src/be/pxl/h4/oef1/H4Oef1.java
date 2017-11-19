package be.pxl.h4.oef1;

import java.util.Scanner;

public class H4Oef1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int prijsKind = 15;
		int prijsVolwassen = 28;

		System.out.println("Met hoeveel volwassenen zijn julle?");
		int aantalVolwassenen = keyboard.nextInt(); // input

		System.out.println("Met hoeveel kinderen zijn jullie?");
		int aantalKinderen = keyboard.nextInt(); // input

		int sum = (prijsVolwassen * aantalVolwassenen) + (prijsKind * aantalKinderen);

		System.out.println("De totale prijs is " + sum);

		keyboard.close();
	}
}
