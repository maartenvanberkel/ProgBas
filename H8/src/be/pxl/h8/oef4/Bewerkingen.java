package be.pxl.h8.oef4;

public class Bewerkingen {

	public Bewerkingen() {

	}

	public void trekAf(double x, double y) {
		double result = x - y;
		char teken = '-';

		if (y < 0) {
			y = -y;
			teken = '+';
		}

		System.out.printf("%.02f %c %.02f = %.02f%n", x, teken, y, result);
	}

	public void trekAf(int x, int y) {

		int result = x - y;
		char teken = '-';

		if (y < 0) {
			y = -y;
			teken = '+';
		}

		System.out.printf("%d %c %d = %d%n", x, teken, y, result);
	}

	public void telOp(double x, double y) {

		char teken = '+';
		double result = x + y;

		if (y < 0) {
			y = -y;
			teken = '-';
		}

		System.out.printf("%.2f %c %.2f = %.2f", x, teken, y, result);
	}
	
//	public void telOp(double... variabel) {
//		double result = 0;
//		char teken = '+';
//		
//		for (int i = 0; i < variabel.length; i++) {
//			result = result + variabel[i];
//			System.out.printf("%.2f", variabel[i]);
//			if (i < variabel[i]) {
//				if (variabel[i] < 0) {
//					variabel[i] = -variabel[i];
//					teken = '-';
//				} 
//				System.out.printf( " %c ", teken);
//			}
//		}
//		System.out.printf(" = %.2f", result);
//	}

	public void telOp(double... variabel) {
		double result = 0;
		char teken = 0;
		boolean plus = false;

		for (double getal : variabel) {
			result = result + getal;

			if (plus) {
				if (getal < 0) {
					getal = -getal;
					teken = '-';
				} else {
					teken = '+';
				}
				System.out.printf(" %c ", teken);

			} else {
				plus = true;
			}
			System.out.format("%.2f ", getal);
		}
		System.out.print(" = ");
		System.out.printf("%.2f%n", result);
	}

	public void deel(int x, int y) {

		double result = (double) x / y;

		System.out.printf("%d / %d = %.2f", x, y, result);
	}

	public void faculteit(int x) {
		int result = 1;
		char teken = 'x';

		for (int i = 1; i <= x; i++) {
			result = result * i;
			System.out.printf("%d ", i);
			if (i < x) {
				System.out.printf("%c ", teken);
			}

		}
		System.out.println("= " + result);
	}
}
