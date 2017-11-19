package be.pxl.h5.exoef05;

import java.util.Scanner;

public class H5ExOef05 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een getal in :");
		int getal = keyboard.nextInt();

		System.out.println(getal % 1000);

		keyboard.close();
	}
}