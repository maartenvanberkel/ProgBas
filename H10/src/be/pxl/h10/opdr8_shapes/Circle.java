package be.pxl.h10.opdr8_shapes;

public class Circle extends Shape {
	private double straal;

	public Circle(int x, int y, double straal) {
		super(x, y);
		setStraal(straal);
	}

	public void setStraal(double straal) {
		this.straal = straal;
	}

	public double getStraal() {
		return straal;
	}

	@Override
	public double getArea() {

		return straal * straal * Math.PI;
	}

	@Override
	public double getPerimeter() {
		return 2 * straal * Math.PI;
	}

	@Override
	public String toString() {
		return "Deze cirkel heeft een straal van " + getStraal() + " een omtrek van " + getPerimeter()
				+ " en een oppervlakte van " + getArea();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(straal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;

		if (Double.doubleToLongBits(straal) != Double.doubleToLongBits(other.straal) || (getY() != other.getY())
				|| (getX() != other.getX()))
			return false;
		return true;
	}

}
