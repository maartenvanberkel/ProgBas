package be.pxl.h5.oef23;

import java.util.Scanner;

public class H5Oef23 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef de grootte van de driehoek in: ");
		int grootte = keyboard.nextInt();

		afdrukkenDriehoek(grootte);

		keyboard.close();
	}

	public static void afdrukkenDriehoek(int grootte) {
		for (int i = 0; i < grootte; i++) {
			for (int j = 0; j < grootte - i; j++) {
				System.out.print("@ ");
			}
			System.out.println();
		}
	}
}