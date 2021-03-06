package be.pxl.h6.exoef5;

import java.util.Scanner;

public class H6ExOef5 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef een zin in: ");
		StringBuilder tekst = new StringBuilder(keyboard.nextLine());
		
		System.out.println("Geef een karakter in ter vervanging: ");
		String vervang = keyboard.next();
		
		testVervanging(tekst, vervang);
		keyboard.close();
	}

	public static void testVervanging(StringBuilder tekst, String vervang) {
		for (int i = 0; i < tekst.length(); i++) {
			if (tekst.charAt(i) < 'a' || tekst.charAt(i) > 'z') {
				System.out.print(tekst.charAt(i));
			} else {
				System.out.print(vervang);
			}
		}
	}
}