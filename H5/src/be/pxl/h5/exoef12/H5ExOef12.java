package be.pxl.h5.exoef12;

import java.util.Scanner;

public class H5ExOef12 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef het nummer van de arbeider in: ");
		int nummer = keyboard.nextInt();
		
		int nummerMetMeesteUren = 0;
		double aantalGewerkteUren = 0;
		double meesteUren = 0;
		
		while (nummer != 0) {
			System.out.println("Wat is het uurloon van de arbeider?: ");
			double uurloon = keyboard.nextDouble();
			
			System.out.println("Geef het aantal gewerkte uren van de arbeider in: ");
			aantalGewerkteUren = keyboard.nextDouble();
			
			double weekLoon = aantalGewerkteUren * uurloon;
			
			if (aantalGewerkteUren > 38) {
				weekLoon = weekLoon + (aantalGewerkteUren - 38) * uurloon * 0.5;
			}
			
			if (aantalGewerkteUren > meesteUren) {
				meesteUren = aantalGewerkteUren;
				nummerMetMeesteUren = nummer;
			}
			
			System.out.println("De arbeider met nummer: " + nummer + " heeft deze week " + weekLoon + " euro verdiend. \n");
			
			System.out.println("Geef het nummer van de volgende arbeider in: ");
			nummer = keyboard.nextInt();
		}
		
		System.out.println("De arbeider met nummer " + nummerMetMeesteUren + " heeft de meeste uren gewerkt.");
		
		
		
		
		keyboard.close();
	}
}