package be.pxl.ve2.oef1;

import java.util.Random;
import java.util.Scanner;

public class Ve2Oef1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random willekeurig = new Random();
		
		int willekerigGetal = willekeurig.nextInt((100 - 1) + 1) + 1;

		
		System.out.println("Geef het aantal getallen dat random zal berekend worden: ");
		int aantalGetallen = keyboard.nextInt();
		
		System.out.println("Geef het veelvoud op: ");
		int veelvoud = keyboard.nextInt();
		
		int arrayGegenereerdeGetallen[] = new int[aantalGetallen];
		
		for (int i = 0; i < arrayGegenereerdeGetallen.length; i++) {
			
		}
		
		
		keyboard.close();
	}
}