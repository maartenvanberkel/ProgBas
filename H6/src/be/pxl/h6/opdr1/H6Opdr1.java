package be.pxl.h6.opdr1;

import java.util.Random;

public class H6Opdr1 {

	public static void main(String[] args) {
		int max = 30;
		int min = 20;
		Random rand = new Random();
		for (int i = 1; i <= 10; i++) {
			int randomNum = rand.nextInt((max - min) + 1) + min;

			System.out.println("Nummer " + i + ": " + randomNum);
		}
	}
}
