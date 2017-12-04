package be.pxl.h8.opdr1;

public class RectangleApp {
	 public static void main(String[] args) {
		 Rectangle rechthoek1 = new Rectangle();
		 Rectangle rechthoek2 = new Rectangle(4, 5);
		 Rectangle rechthoek3 = new Rectangle(4, 5, 1, 2);
		 Rectangle rechthoek4 = new Rectangle(rechthoek3);
		 
		 
//		 rechthoek1.width = 10;
//		 rechthoek1.height = 5;
//		 rechthoek1.setLocation(1, 2);
//		 
//		 System.out.println(rechthoek1.width);
//		 System.out.println(rechthoek1.height);
//		 System.out.println(rechthoek1.x);
//		 System.out.println(rechthoek1.y);
//		 System.out.println();
//		 
//		 Rectangle rechthoek2 = new Rectangle();
//		 
//		 rechthoek2.width = 23;
//		 rechthoek2.height = 11;
//		 rechthoek2.x = 3;
//		 rechthoek2.y = 14;
//		 
//		 System.out.println(rechthoek2.width);
//		 System.out.println(rechthoek2.height);
//		 System.out.println(rechthoek2.x);
//		 System.out.println(rechthoek2.y);
		 
		 rechthoek1.setWidth(-5);
		 rechthoek1.setHeight(7);
		 rechthoek1.setPosition(10, 20);
//		 rechthoek1.grow(-15, 30);
		 rechthoek1.grow(0);
		 
		 
		 System.out.println("Width: " + rechthoek1.getWidth());
		 System.out.println("Height: " + rechthoek1.getHeight());
		 System.out.println("x: " + rechthoek1.getX());
		 System.out.println("y: " + rechthoek1.getY());
		 
		 System.out.println("Area: " + rechthoek1.getArea());
		 System.out.println("Perimeter: " + rechthoek1.getPerimeter());

		 
	 }
}
