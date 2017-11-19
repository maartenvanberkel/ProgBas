package be.pxl.h5.exoef02;

import java.util.Scanner;

public class H5ExOef02 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println(
				"Geef de temperatuur weergegeven in graden Fahrenheit in om om te zetten naar graden Celcius:");
		double gradenFahrenheit = keyboard.nextDouble();

		double gradenCelcius = (gradenFahrenheit - 32) / (9.0 / 5.0);

		System.out.println(gradenFahrenheit + " graden Fahrenheit is gelijk aan " + gradenCelcius + " graden Celcius.");

		keyboard.close();
	}
}