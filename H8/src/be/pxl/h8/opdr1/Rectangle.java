package be.pxl.h8.opdr1;

public class Rectangle {
//	public int x;
//	public int y;
//	public int height;
//	public int width;
	
	
	private int x;
	private int y;
	private int height;
	private int width;
	
	public Rectangle() {
		this(0,0,0,0);
		
	}
	
	public Rectangle(int width, int height) {
//		this.width = width;
//		this.height = height;
		
		this(width, height, 0, 0);
	}
	
	public Rectangle(int width, int height, int x, int y) {
//		this.width = width;
//		this.height = height;
//		this.x = x;
//		this.y = y;
		
		setWidth(width);
		setHeight(height);
		setX(x);
		setY(y);
	}
	
	public Rectangle(Rectangle rechthoek1) {
//		this.height = rechthoek1.height;
//		this.width = rechthoek1.width;
//		this.x = rechthoek1.x;
//		this.y = rechthoek1.y;
		
		this(rechthoek1.height, rechthoek1.width, rechthoek1.x, rechthoek1.y);
	}
	
	public void setWidth(int width) {
		if (width >= 0) {
			this.width = width;
		} else {
			this.width = -width;
		}
	}
	
	public void setHeight(int height) {
		if (height >= 0) {
			this.height = height;
		} else {
			this.height = -height;
		}
	}
	
	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void grow(int dw, int dh) {
		width+=dw;
		height+=dh;
		
		if (width < 0) {
			width = 0;
		}
		if (height < 0) {
			height = 0;
		}
	}
	
	public void grow(int dx) {
//		width+=dx;
//		height+=dx;
//		
//		if (width < 0) {
//			width = 0;
//		}
//		if (height < 0) {
//			height = 0;
//		}
//      roep hieronder de eerder geschreven methode grow op met 2 keer dezelfde parameter. dit is korter en dus efficienter.		

		grow(dx,dx);
	}
	
	public int getArea() {
		return height * width;
	}
	
	public int getPerimeter() {
		return height * 2 + width * 2;
	}
}
