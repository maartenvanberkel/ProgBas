package be.pxl.h5.oef01;

import java.util.Scanner;

public class H5Oef01 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een bedrag in BEF in om om te zetten naar euro:");
		int bedragBEF = keyboard.nextInt();

		final double wisselKoers = 40.3399;
		double bedragEuro = bedragBEF / wisselKoers;

		System.out.println(bedragBEF + " BEF is gelijk aan " + bedragEuro + " euro.");

		keyboard.close();
	}
}