package be.pxl.h7.oef5;

import java.awt.Point;
import java.awt.Rectangle;

import javax.lang.model.element.Element;

public class H7Oef5 {

	public static void main(String[] args) {
		int x[] = { 1, 1, 2, 4, 0 };
		int y[] = { 1, 0, 2, 1, 2 };

		Point[] punt = new Point[5];
		for (int i = 0; i < punt.length; i++) {
			punt[i] = new Point(x[i], y[i]);
		}

		Rectangle rect[] = new Rectangle[5];
		for (int i = 0; i < rect.length; i++) {
			rect[i] = new Rectangle(punt[i]);
			rect[i].setSize(1, 3);
		}

		for (int i = 0; i < rect.length; i++) {
			System.out.println(
					"rechthoek nummer " + (i + 1) + ": x = " + (int) rect[i].getX() + "  y = " + (int) rect[i].getY()
							+ "  h = " + (int) rect[i].getHeight() + "  b = " + (int) rect[i].getWidth());
		}

		rect[4].setLocation(0, 0);
		rect[4].setSize(3, 2);

		for (int i = 0; i < rect.length; i++) {
			System.out.print("Rechthoek nummer " + (i + 1) + " bevat: ");
			for (int j = 0; j < rect.length; j++) {
				if (rect[i].contains(punt[j])) {
					System.out.print("punt nummer " + (j + 1) + "  ");
				}
			}
			System.out.println();
		}

		System.out.print("Rechthoeken die rechthoek 5 snijden zijn: ");
		for (int i = 0; i < rect.length - 1; i++) {
			if (rect[4].intersects(rect[i])) {
				System.out.print("rechthoek nummer: " + (i + 1) + "  ");
			}
		}
	}
}
