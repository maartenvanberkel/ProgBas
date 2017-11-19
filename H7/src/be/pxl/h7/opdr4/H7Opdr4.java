package be.pxl.h7.opdr4;

import java.util.Scanner;

public class H7Opdr4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef een getal in voor de maand waarvan u het aantal dagen wil zien.");
		int month = keyboard.nextInt();
		
		int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.println(months[month -1] + " dagen.") ;
		
		
		keyboard.close();
	}
}