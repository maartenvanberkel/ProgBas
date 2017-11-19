package be.pxl.h6.oef3;

import java.util.Scanner;

public class H6Oef3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef een tekst in om om te keren: ");
		String regelTekst = keyboard.nextLine();
		
		for (int i = regelTekst.length() -1; i >= 0; i--) {
			System.out.print(regelTekst.charAt(i));
		}
	}
}