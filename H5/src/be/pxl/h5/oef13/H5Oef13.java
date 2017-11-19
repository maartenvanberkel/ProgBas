package be.pxl.h5.oef13;

import java.util.Scanner;

public class H5Oef13 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int getal;

		System.out.println("Geef een getal tussen 1 en 100 in:");
		getal = keyboard.nextInt();

		while (getal >= 100 || getal <= 1) {
			if (getal >= 100) {
				System.out.println("Fout, het getal moet kleiner zijn dan 100.");
				getal = keyboard.nextInt();
			} else {
				System.out.println("Fout, het getal moet groter zijn dan 1.");
				getal = keyboard.nextInt();
			}

		}
		keyboard.close();
	}
}