package be.pxl.h7.oef2;

import java.util.Random;

public class H7Oef2 {

	public static void main(String[] args) {
		Random rand = new Random();
		int numbers[] = new int[500];
		long biggerThan100 = 0;

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt();
			if (numbers[i] > 100) {
				biggerThan100 = biggerThan100 + numbers[i];
			}
		}
		System.out.println("De som van de getallen boven de 100 is " + biggerThan100);
	}
}