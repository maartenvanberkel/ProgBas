package be.pxl.h4.opdr2;

import java.util.Scanner;

public class H4Opdr2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter a number:");
		int a = keyboard.nextInt(); // Input

		System.out.println("Enter another number:");
		int b = keyboard.nextInt(); // Input

		int sum = a + b;

		System.out.println("The sum is " + sum); // Output

		keyboard.close();
	}
}