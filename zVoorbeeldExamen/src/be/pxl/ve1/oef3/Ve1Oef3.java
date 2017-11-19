package be.pxl.ve1.oef3;

import java.util.Scanner;

public class Ve1Oef3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef een tekst in: ");
		String tekst = keyboard.nextLine();
		
		System.out.println("Geef het aantal karakters per regel in: ");
		int karaktersPerRegel = keyboard.nextInt();
		
		keyboard.nextLine();
		
		
		while(karaktersPerRegel > 0) {	
			
			String woorden [] = tekst.split(" ");

			for (String woord : woorden) {
				System.out.println(woord);
			}
			
			System.out.println("Geef een tekst in: ");
			tekst = keyboard.nextLine();
			
			System.out.println("Geef het aantal karakters per regel in: ");
			karaktersPerRegel = keyboard.nextInt();
			
			keyboard.nextLine();
		}
		
		keyboard.close();
	}
}