package be.pxl.h7.oef1;

import java.util.Scanner;

public class H7Oef1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int getallen[] = new int[15];
		int som = 0;
		double gemiddelde = 0;
		int kleinerDanGemiddelde = 0;
		double percentageKleinerDanGemiddelde = 0;
		
		for (int i = 0; i < getallen.length; i++) {
			
			System.out.println("Geef een getal in: ");
			getallen[i] = keyboard.nextInt();
			som += getallen[i];
		}
		gemiddelde = (double) som / getallen.length;
		
		
		for (int i = 0; i < getallen.length; i++) {
			if (getallen[i] < gemiddelde) {
				kleinerDanGemiddelde++;
			}
		}
		percentageKleinerDanGemiddelde = (double) kleinerDanGemiddelde / getallen.length * 100;
		
		System.out.printf("%d getallen zijn kleiner dan gemiddeld. Dit is %.1f%% van het totaal aantal ingegeven getallen.", kleinerDanGemiddelde, percentageKleinerDanGemiddelde);
		
		keyboard.close();
	}
}