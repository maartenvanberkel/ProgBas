package be.pxl.h10.opdr8_shapes;

public class DrawingApp {

	public static void main(String[] args) {
		Drawing tekening = new Drawing(3);
		
		Circle rondje1 = new Circle(1, 2, 3);
		Triangle driehoekje1 = new Triangle(1, 2, 3, 4, 5);
		Circle rondje2 = new Circle(1, 2, 3);
		Rectangle driehoekje2 = new Rectangle(1, 2, 3, 4);
		Rectangle rechthoekje1 = new Rectangle(6, 7, 8, 9);
		
		tekening.add(rondje1);
		tekening.add(driehoekje1);
		tekening.add(rondje2);
		tekening.add(driehoekje2);
		tekening.add(rechthoekje1);
		
		
		System.out.println("eerste print:");
		System.out.println();
		tekening.print();
		System.out.println();
		
		tekening.clear();
		System.out.println("tweede afdruk:");
		tekening.print();
		
		tekening.remove(rondje2);
		System.out.println();
		tekening.print();
		System.out.println();
		
		tekening.add(rondje1);
		tekening.add(driehoekje1);
		System.out.println("derde afdruk");
		System.out.println();
		tekening.print();
		System.out.println();
		
		System.out.println("vierde afdruk");
		System.out.println();
		tekening.remove(rondje1);
		tekening.print();
	}
}