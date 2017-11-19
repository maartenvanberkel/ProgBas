package be.pxl.h5.exoef10;

import java.util.Scanner;

public class H5ExOef10 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een jaartal in om te controleren of het een schrikkeljaar is: ");
		int jaartal = keyboard.nextInt();

		if (jaartal % 4 != 0) {
			System.out.println(jaartal + " is GEEN schrikkeljaar.");

		} else {
			if (jaartal % 100 == 0) {
				if (jaartal % 400 == 0) {
					System.out.println(jaartal + " is WEL een schrikkeljaar.");
				} else {
					System.out.println(jaartal + " is GEEN schrikkeljaar.");
				}
			} else {
				System.out.println(jaartal + " is WEL een schrikkeljaar.");
			}
		}
		keyboard.close();
	}
}