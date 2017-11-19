package be.pxl.h4.oef6;

import java.util.Scanner;

public class H4Oef6 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int getal = keyboard.nextInt();

		for (int count = 1; count <= 20; count++) {
			System.out.println(count + " * " + getal + " = " + count * getal);
		}
		keyboard.close();
	}
}