package entities;

public class Rectangle {
	public double width;
	public double height;

	/**
	 * @param width
	 * @param height
	 */
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double area() {
		return height * width;
	}

	public double perimeter() {
		return 2 * height + 2 * width;
	}

	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	
}
