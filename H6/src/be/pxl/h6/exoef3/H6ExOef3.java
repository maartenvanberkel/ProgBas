package be.pxl.h6.exoef3;

import java.util.Random;
import java.util.Scanner;

public class H6ExOef3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		
		int min = 2;
		int max = 24;
		int randomNum = rand.nextInt((max - min) + 1) + min;
		char karakter;

	
		
		System.out.println("Geef een tekst in om te encrypteren: ");
		StringBuilder tekst = new StringBuilder(keyboard.nextLine());
		
		System.out.println(randomNum);
		
		for (int i = 0; i < tekst.length(); i++) {
			karakter = tekst.charAt(i);
			
			for (int j = 0; j <= randomNum; j++) {
				karakter++;
			}
			tekst.setCharAt(i, karakter);
		}
		System.out.println(tekst);
		
		
		
		
		keyboard.close();
	}
}