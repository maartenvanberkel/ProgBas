package be.pxl.h5.oef16;

import java.util.Scanner;

public class H5Oef16 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int snelste = 999999999;
		int inschrijvingsnummerSnelste = 0;
		double tragerDan1uur = 0;
		double percentageTragerDan1uur = 0;
		int totaalRenners = 0;

		System.out.println("Wat is het inschrijvingsnummer van de renner?: ");
		int inschijvingsNummer = keyboard.nextInt();

		while (inschijvingsNummer >= 0) {
			System.out.println("Wat is de tijd van de renner in seconden?: ");
			int tijd = keyboard.nextInt();

			if (tijd < snelste) {
				snelste = tijd;
				inschrijvingsnummerSnelste = inschijvingsNummer;
			}

			if (tijd > 3600) {
				tragerDan1uur++;
			} 
			totaalRenners++;
			
			percentageTragerDan1uur = tragerDan1uur / totaalRenners * 100.0;

			

			System.out.println("Wat is het inschrijvingsnummer van de renner?: ");
			inschijvingsNummer = keyboard.nextInt();
		}
		System.out.println("De snelste renner met het inschrijvingsnummer " + inschrijvingsnummerSnelste
				+ " heeft een tijd van " + snelste + " seconden.");
		System.out.println("Het percentage trager dan 1 uur is " + percentageTragerDan1uur + "%.");

		keyboard.close();
	}
}