package be.pxl.h5.exoef16;

import java.util.Scanner;

public class H5ExOef16 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef de lengte in: ");
		int lengte = keyboard.nextInt();
		
		System.out.println("Geef de hoogte in: ");
		int hoogte = keyboard.nextInt();
		
		for (int kolom = 1; kolom <= hoogte; kolom++) {
			for (int rij = 1; rij <= lengte; rij++) {
				System.out.print("* \t");
			}
			System.out.println();
		}
		keyboard.close();
	}
}