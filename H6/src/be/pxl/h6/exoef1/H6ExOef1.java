package be.pxl.h6.exoef1;

import java.util.Random;
import java.util.Scanner;

public class H6ExOef1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();

		int max = 10;
		int min = 1;

		int randomNum = rand.nextInt((max - min) + 1) + min;

		for (int i = 1; i <= 4; i++) {
			System.out.println("Probeer het getal tussen 1 en 10 (grenzen inclusief) te raden: ");
			int gok = keyboard.nextInt();

			if (gok < randomNum) {
				System.out.println("HOGER!");
			} else {
				if (gok > randomNum) {
					System.out.println("LAGER!");
				} else {
					System.out.println("PROFICIAT, GETAL GERADEN! HET GETAL WAS " + randomNum);
				}
			}
		}
		System.out.println("HELAAS, JE MAG NIET MEER DAN 4 KEER RADEN! HET GETAL WAS " + randomNum);

		keyboard.close();
	}

}
