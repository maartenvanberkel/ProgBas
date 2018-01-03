package be.pxl.h8.oef3;

public class BankrekeningApp {

	public static void main(String[] args) {
		Bankrekening rekening1 = new Bankrekening();
		
		Bankrekening rekening2 = new Bankrekening("BE99834527234", "van Berkel", 40234.79, 1.5);
		rekening1.setRekeningnummer("BE123213123");
		rekening1.setNaam("Hoeven");
//		System.out.println(rekening1.getSaldo());
//		rekening2.print();
		
//		System.out.println();
		
//		rekening2.setSaldo(100);
//		rekening2.stort(500000);
//		rekening2.stort(23867);
//		rekening2.verrichting(-100, 200, 400, -300);
//		rekening2.schrijfRenteBij();
		rekening2.verrichting(100, 200 , -100);
//		rekening1.stort(rekening2.getSaldo());

		System.out.println(rekening1.getSaldo());
	}
}