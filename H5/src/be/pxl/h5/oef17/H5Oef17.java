package be.pxl.h5.oef17;

public class H5Oef17 {

	public static void main(String[] args) {

		for (int rijNummer = 1; rijNummer <= 5; rijNummer++) {
			for (int kolomNummer = 1; kolomNummer <= 10; kolomNummer++) {
				System.out.print(rijNummer * kolomNummer + "\t");
			}
			System.out.println();
		}
	}
}