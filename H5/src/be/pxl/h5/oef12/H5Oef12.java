package be.pxl.h5.oef12;

import java.util.Scanner;

public class H5Oef12 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
//		System.out.println("Geef uw gewicht in (aarde):");
//		int aardeGewicht = keyboard.nextInt();
//		
//		
//		double maanGewicht = 0.165;
//		double jupiterGewicht = 2.537;
//		double marsGewicht =  0.378;
//		
//		
//		while (aardeGewicht > 3 && aardeGewicht < 200) {
//			System.out.println("AARDE -- MAAN -- JUPITER -- MARS");
//			System.out.println(aardeGewicht + "    -- " + aardeGewicht * maanGewicht + " -- " + aardeGewicht * jupiterGewicht + "   -- " + aardeGewicht * marsGewicht);
//			
//			
//
//			System.out.println("Geef uw gewicht in (aarde):");
//			aardeGewicht = keyboard.nextInt();
//		}
		
		double percMaan, percJupiter, percMars;
		System.out.println("Geef het % van het gewicht tov de aarde in voor de maan:");
		percMaan = keyboard.nextDouble();
		
		System.out.println("Geef een % van het gewicht tov de aarde in voor Jupiter:");
		percJupiter = keyboard.nextDouble();
		
		System.out.println("Geef een % van het gewicht tov de aarde in voor Mars:");
		percMars = keyboard.nextDouble();
		
		for (int i = 50; i <= 120; i += 5) {
			
			System.out.println(i + "--" + percMaan * i / 100 + "--" + percJupiter * i / 100 + "--" + percMars * i / 100);
		}
		
		
				
				
				
		
		
		keyboard.close();
	}
}