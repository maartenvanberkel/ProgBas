package be.pxl.h11.oef1;

import java.util.Scanner;

public class MuntApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Geef een bedrag in euro in (groter dan 0 en kleiner dan 10): ");
		double bedrag = Math.round(keyboard.nextDouble() * 100) / 100.0;
		
		while (bedrag <= 0 || bedrag >= 10) {
			System.out.println("Geef een bedrag in euro in (groter dan 0 en kleiner dan 10): ");
			bedrag = Math.round(keyboard.nextDouble() * 100) / 100.0;
		}
		
		
		
		
		
		keyboard.close();
	}
}