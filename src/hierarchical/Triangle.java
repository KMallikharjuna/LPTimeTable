package hierarchical;

public class Triangle extends GeometricShape{
	public Triangle(int side1, int side2) {
		super(side1, side2);
	}
	
	public void calculateArea() {
		area = 0.5 * side1 * side2;
	}
	
	public void calculatePerimeter() {
		perimeter = side1 + side2 + Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
	}
}
