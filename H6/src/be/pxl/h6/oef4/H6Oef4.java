package be.pxl.h6.oef4;

import java.util.Scanner;

public class H6Oef4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een tekst in: ");
		String regelTekst1 = keyboard.nextLine();

		System.out.println("Geef nog een tekst in: ");
		String regelTekst2 = keyboard.nextLine();

		String extra1 = regelTekst1 + "****";
		String extra2 = "++++" + regelTekst2;

//		if (regelTekst1.length() < 4) {
//			regelTekst1 = regelTekst1.concat(extra1);
//		}
//
//		if (regelTekst2.length() < 4) {
//			regelTekst2 = regelTekst2.concat(extra2);
//		}
//
//		System.out.println(regelTekst1.substring(0, 4).toUpperCase()
//				.concat(regelTekst2.substring(regelTekst2.length() - 4, regelTekst2.length())));
		
		String resultaat = regelTekst1.substring(0,4).toUpperCase() + regelTekst2.substring(regelTekst2.length() -4);
		
		System.out.println(resultaat);

		keyboard.close();
	}
}