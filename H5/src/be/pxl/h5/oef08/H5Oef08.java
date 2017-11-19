package be.pxl.h5.oef08;

import java.util.Scanner;

public class H5Oef08 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Hoeveel haalde de leerling op 20 op het vak Programming Basics?:");
		int resultaat1 = keyboard.nextInt();

		System.out.println("Hoeveel haalde de leerling op 20 op het vak Desktop OS?:");
		int resultaat2 = keyboard.nextInt();

		System.out.println("Hoeveel haalde de leerling op het vak Computer Systems?:");
		int resultaat3 = keyboard.nextInt();

		double percentage = (resultaat1 + resultaat2 + resultaat3) / 60.0 * 100;

		if (percentage < 60) {
			System.out.println(percentage + "% is onvoldoende");
		} else {
			if (percentage < 70) {
				System.out.println(percentage + "% is voldoende");
			} else {
				if (percentage < 80) {
					System.out.println(percentage + "% is onderscheiding");
				} else {
					if (percentage < 90) {
						System.out.println(percentage + "% is grote onderscheiding");
					} else {
						System.out.println(percentage + "% is grootste onderscheiding");
					}
				}
			}
		}
		keyboard.close();
	}
}