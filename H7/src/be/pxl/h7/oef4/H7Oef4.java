package be.pxl.h7.oef4;

import java.util.Scanner;

public class H7Oef4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int[] votesCandidates = new int[4];
		int totalVotes = 0;
		double percentage = 0;
		String[] names = { "An Janssen", "Bart Vriends", "Andries Michels", "Ingle klaas" };

		System.out.println(
				"Geef een code in om te stemmen op de volgende kandidaten: (1 Ann Janssen) (2 Bart Vriends) (3 Andries Michels) (4 Inge klaas): ");
		int code = keyboard.nextInt();

		while (code != 0) {
			code = code - 1;
			totalVotes++;
			votesCandidates[code] = votesCandidates[code] + 1;

			System.out.println(
					"Geef een code in om te stemmen op de volgende kandidaten: (1 Ann Janssen) (2 Bart Vriends) (3 Andries Michels) (4 Inge klaas): ");
			code = keyboard.nextInt();
		}

		for (int i = 0; i < names.length; i++) {
			percentage = (double) votesCandidates[i] / totalVotes * 100.0;
			System.out.printf("Er waren %d stemmen voor %s. Dit is %.1f%% van de stemmen. \n", votesCandidates[i],
					names[i], percentage);
		}

		keyboard.close();
	}
}