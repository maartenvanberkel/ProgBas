package be.pxl.h4.exoef2;

import java.util.Scanner;

public class H4ExOef2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een waarde voor getal a:");
		int a = keyboard.nextInt();

		System.out.println("Geef een waarde voor getal b");
		int b = keyboard.nextInt();

		System.out.println("Geef een waarde voor getal c");
		int c = keyboard.nextInt();

		if (a + b < 20) {
			System.out.println("Het resultaat is " + (a + b + c));
		} else {
			System.out.println("Te groot");
		}
		keyboard.close();
	}
}
