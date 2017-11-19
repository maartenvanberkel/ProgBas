package be.pxl.h7.opdr3;

public class H7Opdr3 {

	public static void main(String[] args) {
		int [][]tabel = new int [4][6];
		
		for (int i =0; i < tabel.length; i++) {
			for (int j = 0; j < tabel[i].length; j++) {
				tabel[i][j] = (i +1 ) * (j + 1);
			}
		}
		
		for (int[] rij : tabel) {
			for ( int element : rij) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}
	}
}