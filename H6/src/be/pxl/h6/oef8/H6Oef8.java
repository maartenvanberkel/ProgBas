package be.pxl.h6.oef8;

import java.awt.Point;
import java.awt.Rectangle;

public class H6Oef8 {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(1, 2, 20, 30);
		Point p = new Point(5, 5);
		
		if (rec.contains(p)) {
			System.out.println("het punt bevindt zich in de rechthoek. \n");
		} else {
			System.out.println("Het punt bevindt zich NIET in de rechthoek. \n");
		}
		
		p.translate(40, 50);
		
		Rectangle rec2 = new Rectangle(p);
		rec2.setSize(100, 110);
		
		System.out.println( "x bevindt zich op " + rec2.getX() + " en y bevindt zich op " + rec2.getY());
		
		if (rec2.contains(rec)) {
			System.out.println("rec bevindt zich in rec2");
		} else {
			System.out.println("rec bevindt zich NIET in rec2");
		}
		
		rec.setSize(rec.width + 40, rec.height + 80);
		
		if (rec.getHeight() == rec2.getHeight()) {
			System.out.println("De hoogten van rec en rec2 zijn gelijk.");
		} else {
			System.out.println("De hoogten van rec en rec 2 zijn NIET gelijk.");
		}
	}
}