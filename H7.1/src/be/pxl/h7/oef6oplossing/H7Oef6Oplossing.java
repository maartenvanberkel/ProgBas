package be.pxl.h7.oef6oplossing;

import java.util.Scanner;

public class H7Oef6Oplossing {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		//int punten[][] = { { 12, 4, 12, 9 }, { 14, 5, 9, 11 }, { 8, 9, 7, 12 }, { 7, 12, 11, 10 }, { 11, 18, 10, 14 } };
		int[][] punten = new int[5][4];
		String[] vakken = { "vak 1", "vak 2", "vak 3", "vak 4" };
		String[] studenten = { "stud 1", "stud 2", "stud 3", "stud 4", "stud 5" };
		int kleinste;
		int som;
		int klnr;
		double gem;
		for (int i = 0; i < punten.length; i++) {
			System.out.println("Geef de punten van " + studenten[i]);
			for (int j = 0; j < punten[i].length; j++) {
				System.out.println("behaald op " + vakken[j]);
				punten[i][j] = keyboard.nextInt();
			}
		}
		for (int vak = 0; vak < vakken.length; vak++) {
			kleinste = 20;
			som = 0;
			klnr = 0;
			for (int student = 0; student < studenten.length; student++) {
				if (punten[student][vak] < kleinste) {
					kleinste = punten[student][vak];
					klnr = student;
				}
				som = som + punten[student][vak];
			}
			gem = (double) som / studenten.length;
			System.out.printf("%s laagste behaalde score %d behaald door %s gemiddeld behaalde score %.1f \n",
					vakken[vak], kleinste, studenten[klnr], gem);
		}
		keyboard.close();
	}
}