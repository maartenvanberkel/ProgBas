package be.pxl.h5.oef09;

import java.util.Scanner;

public class H5Oef09 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een waarde in voor a:");
		int a = keyboard.nextInt();

		System.out.println("Geef een waarde in voor b:");
		int b = keyboard.nextInt();

		System.out.println("Geef een code in van 1 t.e.m. 5:");
		int code = keyboard.nextInt();

		int resultaat;

		switch (code) {
		case 1:
			resultaat = a + b;
			System.out.println(a + " en " + b + " met code " + code + " = " + resultaat);
			break;
		case 2:
			resultaat = a - b;
			System.out.println(a + " en " + b + " met code " + code + " = " + resultaat);
			break;
		case 3:
			resultaat = a * b;
			System.out.println(a + " en " + b + " met code " + code + " = " + resultaat);
			break;
		case 4:
			resultaat = a * a;
			System.out.println(a + " en " + b + " met code " + code + " = " + resultaat);
			break;
		case 5:
			resultaat = b * b;
			System.out.println(a + " en " + b + " met code " + code + " = " + resultaat);
			break;
		default:
			System.out.println("Foutieve code");
		}
		keyboard.close();
	}
}