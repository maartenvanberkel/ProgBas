package be.pxl.h8.oef7;

import java.util.Random;
import java.util.Scanner;

public class H8Oef7 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random willekeurig = new Random();
		
		System.out.println("Geef een geheel getal in: ");
		int x = keyboard.nextInt();
		
		double y = 1 + (6001 -1) * willekeurig.nextDouble();
		

		double result = Math.E * Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		
		System.out.printf("%.3f", result);
		keyboard.close();
	}
}