package be.pxl.h4.oef2;

import java.util.Scanner;

public class H4Oef2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int productGetal = 5;
		int biggest;
		int smallest;
		int rest;
		int multiply;

		System.out.println("Geef een getal in:");
		int a = keyboard.nextInt(); // input

		System.out.println("Geef nog een getal in:");
		int b = keyboard.nextInt(); // input

		if (a > b) {
			biggest = a;
			smallest = b;
		} else {
			biggest = b;
			smallest = a;
		}
		rest = biggest - smallest;
		multiply = rest * productGetal;

		System.out.println(biggest + "-" + smallest + "=" + rest);
		System.out.println(rest + "*" + productGetal + "=" + multiply);

		keyboard.close();
	}
}
