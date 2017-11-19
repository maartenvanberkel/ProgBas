package be.pxl.h4.opdr5;

import java.util.Scanner;

public class H4Opdr5 {

	public static void main(String[] args) {
		int getal;
		int tripple;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("geef een getal; om te stoppen geef een getal kleiner of gelijk aan 100");

		getal = keyboard.nextInt();
		while (getal > 100) {
			tripple = getal * 3;
			System.out.println("Het driedubbele van " + getal + " is " + tripple);

			getal = keyboard.nextInt();
		}
		keyboard.close();
	}
}