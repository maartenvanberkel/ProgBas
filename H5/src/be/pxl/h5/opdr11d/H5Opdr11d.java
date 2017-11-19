package be.pxl.h5.opdr11d;

import java.util.Scanner;

public class H5Opdr11d {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Wat is uw gewicht?:");
		double gewicht = keyboard.nextDouble();

		System.out.println("Wat is uw lengte?:");
		double lengte = keyboard.nextDouble();

		double bmi = gewicht / (lengte * lengte);

		System.out.println("Bmi " + bmi + "- ");

		if (bmi < 18) {
			System.out.println("Ondergewicht.");
		} else {
			if (bmi < 25) {
				System.out.println("Ok.");
			} else {
				if (bmi < 30) {
					System.out.println("Overgewicht.");
				} else {
					if (bmi < 40) {
						System.out.println("Obesitas.");
					} else {
						System.out.println("Ziekelijk overgewicht");
					}
				}
			}
		}
		keyboard.close();
	}
}