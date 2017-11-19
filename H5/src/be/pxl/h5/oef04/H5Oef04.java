package be.pxl.h5.oef04;

import java.util.Scanner;

public class H5Oef04 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een getal (aantal seconden):");
		int aantalSeconden = keyboard.nextInt();

		int uren = aantalSeconden / 3600;
		int minuten = aantalSeconden % 3600 / 60;
		int restSeconden = aantalSeconden % 3600 % 60;

		System.out.println(
				aantalSeconden + " seconden = " + uren + " uur " + minuten + " minuten " + restSeconden + " seconden.");

		keyboard.close();
	}
}