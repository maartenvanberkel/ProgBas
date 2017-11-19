package be.pxl.h5.exoef09;

import java.util.Scanner;

public class H5ExOef09 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("In welk jaar bent u geboren?:");
		int geboorteJaar = keyboard.nextInt();
		
		System.out.println("In welke maand bent u geboren?:");
		int geboorteMaand = keyboard.nextInt();
		
		System.out.println("Op welke dag van de maand bent u geboren?:");
		int geboorteDag = keyboard.nextInt();
		
		System.out.println("Welk jaar zijn we nu?:");
		int huidigJaar = keyboard.nextInt();
		
		System.out.println("Welke maand zijn we nu?");
		int huidigeMaand = keyboard.nextInt();
		
		System.out.println("De hoeveelste dag van de maand zijn we vandaag?:");
		int huidigeDag = keyboard.nextInt();
		
		int berekendeJaren = huidigJaar - geboorteJaar;
		
		
		System.out.println("Uw leeftijd is " + berekendeJaren);
		
		keyboard.close();
	}
}