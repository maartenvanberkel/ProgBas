package be.pxl.h8.opdr12;

import java.util.Scanner;

public class H8Opdr12 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef een geheel getal in om tot de macht 3 te verheffen:");
		int x = keyboard.nextInt();
		
		int resultaat = (int) Math.pow(x, 3);
		
		System.out.println(resultaat);
		
		keyboard.close();
	}
}