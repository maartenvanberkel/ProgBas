package be.pxl.h7.opdr1;

public class H7Opdr1 {

	public static void main(String[] args) {
//		int[] numbers = new int[20];
//		
//		for (int i = 0; i < numbers.length; i++) {
//			numbers[i] = (i+1) * 7;
//		}
//		for (int element : numbers) {
//			System.out.println(element);
//		}
		
		
		
		
//		boolean[] booleans = {true, false, true, false, true, false};
//		for (boolean b : booleans) {
//			System.out.println(b);
//		}
		
		
		
		
		
//		int[] oneven = {1,3,5,7,9,11,13,15,17,19};
//
//		for (int element : oneven) {
//			System.out.println(element);
//		}
		
		
		
		
		int[] oneven = new int[10];
		
		for (int k = 0; k < oneven.length; k++) {
			oneven[k] = (k * 2) + 1;
		}
		for (int element : oneven) {
			System.out.println(element);
		}
	}
}
