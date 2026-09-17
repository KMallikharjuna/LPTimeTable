package hierarchical;

public class GeometricShape {
	int side1, side2;
	double area = 0.0;
	double perimeter = 0.0;
	public GeometricShape() {
		
	}
	
	public GeometricShape(int side1, int side2) {
		this.side1 = side1;
		this.side2 = side2;
	}
	
	public GeometricShape(int side1) {
		this.side1 = side1;
	}
	
	public void getArea() {
		System.out.println("Geometrical Shapes Area is + "+area);
	}
	
	public void getPerimeter() {
		System.out.println("Geometrical Shapes Perimeter is + "+perimeter);
	}
	
	public void calculateArea() {
		
	}
	public void calculatePerimeter() {
		
	}
}
