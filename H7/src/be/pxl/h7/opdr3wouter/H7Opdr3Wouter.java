package be.pxl.h7.opdr3wouter;

public class H7Opdr3Wouter {

	public static void main(String[] args) {
		// aanmaken 2 dim array
		int[][] tabel = new int[4][6];

		// eerste for voor de (4) hoofdelementen door te lopen
		for (int i = 0; i < tabel.length; i++) {
			// tweede for voor de (6) secundaire elementen door te lopen
			for (int j = 0; j < tabel[i].length; j++) {
				// cijfers in de tabel zetten
				// (we doen +1 bij allebei omdat 0*0=0, 0*1=0, ...)
				// laat dit weg en de bovenste rij staat allemaal op 0
				// samen met de 1ste kolom naar beneden
				tabel[i][j] = (i + 1) * (j + 1);
			}
		}
		// voor elk hoofdelement
		for (int[] rij : tabel) {
			// voor elke nummer in het secundaire element
			for (int num : rij) {
				// drukken we af
				System.out.print(num + "\t");
			}
			System.out.println();
		}
	}
}