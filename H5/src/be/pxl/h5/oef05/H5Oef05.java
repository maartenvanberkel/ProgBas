package be.pxl.h5.oef05;

import java.util.Scanner;

public class H5Oef05 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een bedrag in euro in:");
		int bedragEuro = keyboard.nextInt();

		int briefjes20 = bedragEuro / 20;
		double restBedrag = bedragEuro % 20;

		System.out.println("Met " + bedragEuro + " euro kan je " + briefjes20 + " briefjes van 20 maken.");
		System.out.println("Het resterende bedrag is " + restBedrag + " euro.");

		keyboard.close();
	}
}