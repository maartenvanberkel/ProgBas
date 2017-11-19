package be.pxl.h6.oef1;

import java.util.Random;

public class H6Oef1 {

	public static void main(String[] args) {
		int max = 20;
		int min = 0;
		int temp;
		Random rand = new Random();

		for (char x = 'A'; x <= 'F'; x++) {
			System.out.println("Reeks " + x);

			for (int i = 1; i <= 5; i++) {
				int randomNum = rand.nextInt((max - min) + 1) + min;
				int randomNum2 = rand.nextInt(randomNum + 1);

//				if (randomNum < randomNum2) {
//					temp = randomNum;
//					randomNum = randomNum2;
//					randomNum2 = temp;
//				}

				System.out.println("Nummer " + i + ": " + randomNum + " - " + randomNum2 + " =  ");
			}
		}

	}
}