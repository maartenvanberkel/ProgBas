package be.pxl.spel;

import java.util.Scanner;

public class SpelApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		Uitgever uitgever1 = new Uitgever("Jagex", "Cambridge", 1999);
		OnlineSpel spel1 = new OnlineSpel("Runescape", uitgever1);

		uitgever1.setWebsite("www.jagex.com");

		spel1.setMinimumLeeftijd(13);
		spel1.setGenre("mmorpg");
		spel1.setUrl("www.runescape.com");

		System.out.println(spel1.toString());

		System.out.println("Hoeveel spelers gaan het spel beoordelen?: ");
		int aantal = keyboard.nextInt();
		SpelEvaluatie[] evaluaties = new SpelEvaluatie[aantal];

		keyboard.nextLine();

		for (int i = 0; i < aantal; i++) {
			System.out.println("Geef speler naam: ");
			String naam = keyboard.nextLine();

			System.out.println("geef geboortejaar: ");
			int geboortejaar = keyboard.nextInt();

			keyboard.nextLine();

			System.out.println("Geef uw score (0-5): ");
			int score = keyboard.nextInt();

			keyboard.nextLine();

			System.out.println("Geef uw motivatie: ");
			String motivatie = keyboard.nextLine();

			evaluaties[i] = new SpelEvaluatie(spel1, new Speler(naam, geboortejaar));
			evaluaties[i].maakBeoordeling(score, motivatie);
		}

		System.out.println("Evaluatie " + spel1.getNaam() + " " + uitgever1.getNaam());
		System.out.println();

		int totaal = 0;
		int gemiddelde = 0;
		int tellerGeldig = 0;

		for (int i = 0; i < evaluaties.length; i++) {
			char geldigheid = '-';

			if (evaluaties[i].isGeldig()) {
				geldigheid = '+';
				totaal = totaal + evaluaties[i].getScore().getStars().length();
				tellerGeldig++;
			}
			System.out.printf("%-10s %5s %-2s %1c%n", evaluaties[i].getSpeler().getNaam(),
					evaluaties[i].getScore().getStars(), evaluaties[i].getMotivatie(), geldigheid);

		}
		gemiddelde = totaal / tellerGeldig;
		System.out.print("totaalscore: ");
		for (int i = 0; i < gemiddelde; i++) {
			System.out.print("*");
		}

		keyboard.close();
	}
}