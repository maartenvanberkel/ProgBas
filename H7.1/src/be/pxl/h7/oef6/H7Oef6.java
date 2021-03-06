package be.pxl.h7.oef6;

import java.util.Scanner;

public class H7Oef6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int punten[][] = { { 12, 4, 12, 9 }, { 14, 5, 9, 11 }, { 8, 9, 7, 12 }, { 7, 12, 11, 10 }, { 11, 18, 10, 14 } };
		String studenten[] = { "student 1", "student 2", "student 3", "student 4", "student 5" };
		String vakken[] = { "vak 1", "vak 2", "vak 3", "vak 4" };
		int laagstepunt;
		int totaalPerVak;
		double gemiddelde;
		int klnr;

		for (int vak = 0; vak < vakken.length; vak++) {
			totaalPerVak = 0;
			laagstepunt = 21;
			klnr = 0;
			for (int student = 0; student < studenten.length; student++) {
				if (punten[student][vak] < laagstepunt) {
					laagstepunt = punten[student][vak];
					klnr = student;
				}
				totaalPerVak = totaalPerVak + punten[student][vak];
			}
			gemiddelde = (double) totaalPerVak / studenten.length;
			System.out.printf(
					"Het laagst behaald punt voor %s is %d. Dit werd behaald door %s. Het gemiddelde voor dit vak bedraagt %.1f \n",
					vakken[vak], laagstepunt, studenten[klnr], gemiddelde);

		}

		keyboard.close();
	}
}