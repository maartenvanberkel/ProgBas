package be.pxl.h7.exoef3;

import java.util.Scanner;

public class H7ExOef3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef een getal in om om te zetten in woorden: ");
		StringBuilder getal = new StringBuilder(keyboard.nextLine());
		
		String[] woorden = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen"};
		
		for (int i = 0; i < getal.length(); i++) {
			System.out.println(getal.replace(i, i + 1, woorden[i]));

		}
		
		
		
		keyboard.close();
	}
}