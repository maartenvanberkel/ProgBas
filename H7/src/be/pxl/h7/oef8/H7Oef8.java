package be.pxl.h7.oef8;

import java.util.Scanner;

public class H7Oef8 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef de uw naam in: ");
		String naam = keyboard.nextLine();

		System.out.println("Geef uw geboortedag in: ");
		int geboortedag = keyboard.nextInt();

		System.out.println("Geef uw geboortemaand in: ");
		int geboortemaand = keyboard.nextInt();

		String sterrenbeelden[] = { "waterman", "vissen", "ram", "stier", "tweelingen", "kreeft", "leeuw", "maagd",
				"weegschaal", "schorpioen", "boogschutter", "steenbok" };
		String maanden[] = { "januari", "februari", "maart", "april", "mei", "juni", "juli", "augustus", "september",
				"oktober", "november", "december" };
		
		for (int i = 0; i < maanden.length; i++) {
			if (maanden[i].equals(i)) {
				
			}
		}

		keyboard.close();
	}
}