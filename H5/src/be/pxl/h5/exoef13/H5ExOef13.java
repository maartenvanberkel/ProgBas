package be.pxl.h5.exoef13;

import java.util.Scanner;

public class H5ExOef13 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Wat is het beginkapitaal?:");
		double beginKapitaal = keyboard.nextDouble();
		
		System.out.println("Wat is de rentevoet?:");
		double renteVoet = keyboard.nextDouble();
		
		System.out.println("Wat is is het aantal jaren van de investering?:");
		int aantalJaren = keyboard.nextInt();
		
		
		double eindKapitaal = beginKapitaal *  Math.pow((1 + renteVoet / 100), aantalJaren );
		
		System.out.println("Het eindkapitaal is "+ eindKapitaal + " euro.");
		
		
		
		
		
		keyboard.close();
	}
}