package be.pxl.h4.exoef1;

import java.util.Scanner;

public class H4ExOef1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een getal in ");
		int getalA = keyboard.nextInt();

		System.out.println("Geef nog een getal in ");
		int getalB = keyboard.nextInt();

		int smallest;

		if (getalA > getalB) {
			smallest = getalB;
		} else {
			smallest = getalA;
		}

		System.out.println("Het kleinste getal is " + smallest);
		System.out.println("Het kwadraad van het kleeinste getal is " + (smallest * smallest));
		keyboard.close();
	}
}