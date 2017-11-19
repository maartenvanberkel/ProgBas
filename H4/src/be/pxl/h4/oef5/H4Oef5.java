package be.pxl.h4.oef5;

import java.util.Scanner;

public class H4Oef5 {

	public static void main(String[] args) {
//		Scanner keyboard = new Scanner(System.in);
//		int gewichtAppel = keyboard.nextInt();
//
//		int aantalAppelen = 1;
//		while (aantalAppelen <= 100) {
//			System.out.println(aantalAppelen + "    " + aantalAppelen * gewichtAppel);
//			aantalAppelen++;
//		}
//		keyboard.close();
		
		
		
		
		Scanner keyboard = new Scanner(System.in);
		int gewichtAppel = keyboard.nextInt();

		for (int aantalAppelen = 1; aantalAppelen <= 100; aantalAppelen++) {
			System.out.println(aantalAppelen + "    " + gewichtAppel * aantalAppelen);

		}
		keyboard.close();
	}
}
