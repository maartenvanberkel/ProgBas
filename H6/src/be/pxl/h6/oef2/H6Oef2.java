package be.pxl.h6.oef2;

import java.util.Scanner;

public class H6Oef2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef een tekst in: ");
		String regelTekst = keyboard.nextLine();
		
		String find1 = "t";

		if (regelTekst.indexOf(find1) == -1) {
			System.out.println("er komt geen letter " + find1 + " in deze string voor.");
		} else {
			if (regelTekst.length() % 2 == 0) {
				System.out.println(regelTekst.substring(regelTekst.indexOf(find1)).toLowerCase());
			} else {
				System.out.println(regelTekst.substring(regelTekst.indexOf(find1)).toUpperCase());
			}
		}
		keyboard.close();
	}
}
