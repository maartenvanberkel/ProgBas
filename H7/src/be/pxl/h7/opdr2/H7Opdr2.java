package be.pxl.h7.opdr2;

import java.util.Scanner;

public class H7Opdr2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef input: ");
		String tekst = keyboard.nextLine();
		
		String[] woorden = tekst.split(" ");

		for (String woord : woorden) {
			System.out.println(woord);
		}
		keyboard.close();
	}
}