package be.pxl.ve1.oef2oplossing;

import java.math.BigInteger;

public class Ve1Oef2Oplossing {
	public static void main(String[] args) {
		BigInteger uitkomst = BigInteger.valueOf(1);
		
		for (int i = 2; i < 101; i++) {
		uitkomst = uitkomst.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println(uitkomst);
	}
}