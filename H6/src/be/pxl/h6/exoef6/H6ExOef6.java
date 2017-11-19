package be.pxl.h6.exoef6;

import java.util.Scanner;

public class H6ExOef6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een productcode in: ");
		String productcode = keyboard.nextLine();

		while (!testenProductcode(productcode)) {
			System.out.println("Geef een productcode in: ");
			productcode = keyboard.nextLine();
		}
		System.out.println(productcode + " is een correcte productcode.");

		keyboard.close();
	}

	public static boolean testenProductcode(String productcode) {

		if (productcode.length() != 8) {
			System.out.println("De productcode is niet van de juiste lengte.");
			return false;
		} else {
			if ((productcode.toLowerCase().startsWith("l") || productcode.toLowerCase().startsWith("r"))
					&& (productcode.toLowerCase().endsWith("bo") || productcode.toLowerCase().endsWith("on"))) {
				return true;
			} else {
				System.out.println("De productcode moet met een l, L , r of een R beginnen. en met on of bo eindigen");
				return false;
			}
		}
	}
}
