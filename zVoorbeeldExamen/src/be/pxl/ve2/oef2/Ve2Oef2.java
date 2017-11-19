package be.pxl.ve2.oef2;

import java.util.Random;
import java.util.Scanner;

public class Ve2Oef2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random willekeurig = new Random();
		
		String[] roman = { "XL", "X", "IX", "V", "IV", "I" };
		int[] waarde = { 40, 10, 9, 5, 4, 1 };
		int willekeurigGetal = willekeurig.nextInt((49 - 1) + 1) + 1;

		
		System.out.println("Geef een letter in: ");
		char letter = keyboard.next().charAt(0);
		
		for(char count = 'a'; count <= letter; count++) {
			System.out.println("Reeks" + count);
			
		}
		
		
		keyboard.close();
	}
	public static void zetOmNaarRomeinsCijfer(int willekeurigGetal) {
		
	}
}