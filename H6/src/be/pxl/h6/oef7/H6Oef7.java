package be.pxl.h6.oef7;

import java.awt.Point;

public class H6Oef7 {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.x = 5;
		p1.y = 8;
		
		Point p2 = new Point(p1);
		
		if (p1.equals(p2)) {
			System.out.println("punten hebben dezelfde waarde voor x en y");
		} else {
			System.out.println("punten hebben NIET dezelfde waarde voor x en y");
		}
		
		if (p1 == p2) {
			System.out.println("Punten zijn hetzelfde.");
		} else {
			System.out.println("Punten zijn NIET hetzelfde.");
		}
		
		
				
		p2.translate(2, 3);
		
		System.out.println("De x en y voor p1 zijn: " + p1.getX() + "-" + p1.getY());
		System.out.println("De x en y voor p2 zijn: " + p2.getX() + "-" + p2.getY());
		
	}
}