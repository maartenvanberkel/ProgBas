package be.pxl.h5.exoef04;

import java.util.Scanner;

public class H5ExOef04 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een getal voor a:");
		int a = keyboard.nextInt();

		System.out.println("Geef een getal voor b:");
		int b = keyboard.nextInt();

		System.out.println("Geef een getal voor c:");
		int c = keyboard.nextInt();

		b = a;
		c = b;
		c = a;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

		keyboard.close();
	}
}