package be.pxl.h10.opdr8_shapes;

public class ShapeApp {

	public static void main(String[] args) {
		
//		Shape figuurtje = new Shape(4,5); <==== gaat niet omwille van het feit dat de klasse abstract is
		
		
		Circle rondje = new Circle(3, 2, 5.0);
		Circle rondjevandezaak = new Circle(3, 2, 5.0);
		
//		rondje.setPosition(7, 8);
//		rondje.setStraal(1);
		
		System.out.println(rondje.getPerimeter());
		System.out.println(rondje.getArea());
		System.out.println(rondje.getStraal());
		System.out.println(rondje.getX());
		System.out.println(rondje.getY());
		System.out.println();
		System.out.println(Circle.getAantal());
		System.out.println(Shape.getAantal());
		
		//opdracht9;
		
		System.out.println(rondje);
		System.out.println(rondje.toString());
		System.out.println(rondje.equals(rondjevandezaak));
		
		//opdracht11
		
		Shape[] shapes = new Shape[5];
		
		shapes[0] = new Circle(1, 2, 3);
		shapes[1] = new Rectangle(1, 2, 3, 4);
		shapes[2] = new Triangle(1, 2, 3, 4, 5);
		shapes[3] = new Circle(1, 2, 3);
		shapes[4] = new Rectangle(1, 2, 3, 4);
		
		for (Shape s : shapes) {
			System.out.printf("omtrek: %8.0f  oppervlakte: %8.0f %5s", s.getPerimeter(), s.getArea(), " ");
			if (s instanceof Rectangle) {
				System.out.println("Rechthoek");
			} else {
				if (s instanceof Circle) {
					System.out.println("Cirkel");
				} else {
					System.out.println("Driehoek");
				}
			}
		}
	}
}