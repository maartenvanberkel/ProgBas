package be.pxl.h10.opdr8_shapes;

public abstract class Shape {
	private int x;
	private int y;
	private static int aantal;
	
	{
		aantal++;
	}
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
	public static int getAantal() {
		return aantal;
	}
}
