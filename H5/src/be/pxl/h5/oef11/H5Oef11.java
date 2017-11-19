package be.pxl.h5.oef11;

import java.util.Scanner;

public class H5Oef11 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int getal;
		int som = 0;
		int tel = 0;

		System.out.println("Geef een getal in: ");

		getal = keyboard.nextInt();

		while (getal != 0) {
			som = som + getal;
			if (getal < 0) {
				tel++;
			}
			System.out.println("Geef een getal in: ");
			getal = keyboard.nextInt();
		}

		System.out.println("de som is " + som);
		System.out.println("Er zijn " + tel + " strikt negatieve getallen ingegeven.");

		keyboard.close();
	}
}