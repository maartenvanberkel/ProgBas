package be.pxl.h8.opdr13;

import java.util.Scanner;

public class H8Opdr13 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef de oppervlakte van een cirkel om de diameter te bereken: ");
		double oppervlakte = keyboard.nextDouble();
		
		double r = Math.sqrt(oppervlakte / Math.PI);
		double diameter = r * 2;
		
		System.out.println(diameter);
		
		double diameter2 = Math.round(diameter);
		
		System.out.println(diameter2);
		
		System.out.printf("diameter ofgerond op 2 cijfers na de komma: %.2f", diameter);
		
		
	}

}
