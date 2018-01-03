package be.pxl.h10.opdr8_shapes;

public class Drawing {
	private Shape[] shapes;

	public Drawing(int aantal) {
		shapes = new Shape[aantal];
	}

	public void add(Shape s) {
		if (!isPresent(s)) {
			if (getFreeLocation() != -1) {
				shapes[getFreeLocation()] = s;
			} else {
				System.out.println("de array is vol.");
			}
		} else {
			System.out.println("Deze figuur is al toegevoegd.");
		}
	}

	private boolean isPresent(Shape s) {

		for (int i = 0; i < shapes.length; i++) {
			if (s.equals(shapes[i])) {
				return true;
			}
		}
		return false;
	}

	private int getFreeLocation() {
		for (int i = 0; i < shapes.length; i++) {
			if (shapes[i] == null) {
				return i;
			}
		}
		return -1;
	}
	
	public void remove(Shape s) {
		for (int i = 0; i < shapes.length; i++) {
			if (s.equals(shapes[i])) {
				shapes[i] = null;
				i = shapes.length;
			}
		}
	}

	public void clear() {
		for (int i = 0; i < shapes.length; i++) {
			shapes[i] = null;
		}
	}

	public void print() {
		for (Shape s : shapes) {
			if (s != null) {
				System.out.println(s.toString());
			}
		}
	}
}
