package hierarchical;

public class Square extends GeometricShape{
	public Square(int side) {
		super(side);
	}
	
	public void calculateArea() {
		area = side1 * side1;
	}
	
	public void calculatePerimeter() {
		perimeter = 4 * side1;
	}
}
