package be.pxl.h7.oef4;

import java.util.Scanner;

public class H7Oef4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("breng je stem uit op een kandidaat (1, 2, 3 of 4): ");
		int code = keyboard.nextInt();

		int totaalStemmen = 0;
		int stemmen[] = new int[4];
		String namen[] = { "An Janssen", "Bart Vriends", "Andries Michels", "Inge klaas" };
		double percentage = 0;

		while (code != 0) {
			code = code - 1;
			totaalStemmen++;
			stemmen[code] = stemmen[code] + 1;

			System.out.println("breng je stem uit op een kandidaat (1, 2, 3 of 4): ");
			code = keyboard.nextInt();
		}

		for (int i = 0; i < stemmen.length; i++) {
			percentage = (double) stemmen[i] / totaalStemmen * 100.0;
			System.out.printf(
					"Er werden %d stemmen uitgebracht voor kandidaat %s. Dit is %.1f%% van het totaal aantal stemmen. \n",
					stemmen[i], namen[i], percentage);
		}

		keyboard.close();
	}
}