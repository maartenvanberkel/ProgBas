package be.pxl.h7.oef2;

import java.util.Random;

public class H7Oef2 {

	public static void main(String[] args) {
		Random willekeurig = new Random();
		
		int getallen[] = new int[500];
		long getallenGroterDan100Opgeteld = 0;
		
		for (int i = 0; i < getallen.length; i++) {
			getallen[i] = willekeurig.nextInt();
		}
		for (int i = 0; i < getallen.length; i++) {
			if (getallen[i] > 100) {
				getallenGroterDan100Opgeteld += getallen[i];
			}
		}
		System.out.println(getallenGroterDan100Opgeteld);
	}
}