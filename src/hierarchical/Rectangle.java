package hierarchical;

public class Rectangle extends GeometricShape{
	public Rectangle(int side1, int side2) {
		super(side1, side2);
	}
	
	public void calculateArea() {
		area = side1 * side2;
	}
	
	public void calculatePerimeter() {
		perimeter = 2 * (side1 + side2);
	}
}
