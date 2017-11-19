package be.pxl.h7.oef1;

import java.util.Scanner;

public class H7Oef1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double numbers[] = new double[15];
		int countSmallerThanAverage = 0;
		double average = 0;
		double percentageSmallerThanAverage = 0;

		double sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Enter a number: ");
			numbers[i] = keyboard.nextInt();
			sum = sum + numbers[i];
		}
		average = sum / numbers.length;
		System.out.printf("Het gemiddelde is %.1f\n ", average);

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < average) {
				countSmallerThanAverage++;
			}
		}
		percentageSmallerThanAverage = (double) countSmallerThanAverage / numbers.length * 100;

		System.out.printf("%d zijn kleiner dan het gemiddelde. Dit is %.1f procent. ", countSmallerThanAverage,
				percentageSmallerThanAverage);

		keyboard.close();
	}
}