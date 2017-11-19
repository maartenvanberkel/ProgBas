package be.pxl.h5.oef19;

import java.util.Scanner;

public class H5Oef19 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef de grootte van de driehoek in: ");
		int grootte = keyboard.nextInt();

		for (int i = 0; i < grootte; i++) {
			for (int j = 0; j < grootte - i; j++) {
				System.out.print("@ ");
			}
			System.out.println();
		}
		keyboard.close();
	}
}