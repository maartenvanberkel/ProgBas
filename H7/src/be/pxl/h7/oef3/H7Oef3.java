package be.pxl.h7.oef3;

import java.util.Scanner;

public class H7Oef3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int numbers[] = new int[10];

		int positiveNumbers = 0;
		int negativeNumbers = 0;
		int positionNeg = -1;
		int positionPos = -1;
		int smallestNegativeNumber = 999999999;

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Geef een getal in: ");
			numbers[i] = keyboard.nextInt();
			if (numbers[i] < 0) {
				negativeNumbers++;
			} else {
				positiveNumbers++;
			}
		}
		int[] pos = new int[positiveNumbers];
		int[] neg = new int[negativeNumbers];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				positionNeg++;
				neg[positionNeg] = numbers[i];

			} else {
				positionPos++;
				pos[positionPos] = numbers[i];
			}
		}

		System.out.println("positieve array:");
		for (int j = 0; j < pos.length; j++) {
			System.out.print(pos[j] + "\t");
		}

		System.out.println();

		System.out.println("negatieve array:");
		for (int j = 0; j < neg.length; j++) {
			System.out.print(neg[j] + "\t");

			if (smallestNegativeNumber > neg[j]) {
				smallestNegativeNumber = neg[j];
			}
		}
		System.out.println();

		if (smallestNegativeNumber > 0) {
			System.out.println("Er zijn geen negatieve getallen ingegeven.");
		} else {
			System.out.println("Het kleinste negatieve getal is " + smallestNegativeNumber);

		}
		keyboard.close();
	}
}