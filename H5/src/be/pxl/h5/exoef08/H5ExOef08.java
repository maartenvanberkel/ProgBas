package be.pxl.h5.exoef08;

import java.util.Scanner;

public class H5ExOef08 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Geef een getal in: ");
		int nummer1 = keyboard.nextInt();
		System.out.print("Geef een tweede getal in: ");
		int nummer2 = keyboard.nextInt();
		System.out.print("Geef een derde getal in: ");
		int nummer3 = keyboard.nextInt();

		int temp;

		if (nummer1 > nummer2) {
			temp = nummer1;
			nummer1 = nummer2;
			nummer2 = temp;
		}
		if (nummer2 > nummer3) {
			temp = nummer2;
			nummer2 = nummer3;
			nummer3 = temp;
		}
		if (nummer1 > nummer2) {
			temp = nummer1;
			nummer1 = nummer2;
			nummer2 = temp;
		}
		System.out.println("De ingegeven nummer van klein naar groot zijn: " + nummer1 + " " + nummer2 + " " + nummer3);
		keyboard.close();
	}
}