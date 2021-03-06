package be.pxl.h7.oef3;

import java.util.Scanner;

public class H7Oef3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int getallen[] = new int[10];
		int aantalPositieveGetallen = 0;
		int aantalNegatieveGetallen = 0;
		int positieNeg = -1;
		int positiePos = -1;
		int kleinsteNegatieveGetal = 999999;
		int grootstePositieveGetal = -999999;

		for (int i = 0; i < getallen.length; i++) {
			System.out.println("Geef een getal in: ");
			getallen[i] = keyboard.nextInt();
			if (getallen[i] < 0) {
				aantalNegatieveGetallen++;
			} else {
				aantalPositieveGetallen++;
			}
		}

		int positieveArray[] = new int[aantalPositieveGetallen];
		int negatieveArray[] = new int[aantalNegatieveGetallen];

		for (int i = 0; i < getallen.length; i++) {
			if (getallen[i] < 0) {
				positieNeg++;
				negatieveArray[positieNeg] = getallen[i];
			} else {
				positiePos++;
				positieveArray[positiePos] = getallen[i];
			}
		}
		System.out.println("Positieve array: ");
		for (int i = 0; i < positieveArray.length; i++) {
			System.out.print(positieveArray[i] + "\t");
		}
		System.out.println();

		System.out.println("Negatieve Array: ");
		for (int i = 0; i < negatieveArray.length; i++) {
			System.out.print(negatieveArray[i] + "\t");

			if (kleinsteNegatieveGetal > getallen[i]) {
				kleinsteNegatieveGetal = getallen[i];
			}
		}
		System.out.println();

		if (kleinsteNegatieveGetal > 0) {
			System.out.println("Er zijn geen negatieve getallen ingegeven");
		} else {
			System.out.println("Het kleinste negatieve getal is: " + kleinsteNegatieveGetal);
		}

		keyboard.close();
	}
}