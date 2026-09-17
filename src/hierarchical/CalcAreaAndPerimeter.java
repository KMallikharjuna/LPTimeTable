package hierarchical;

import java.util.Scanner;

public class CalcAreaAndPerimeter {
	public CalcAreaAndPerimeter(GeometricShape shape) {
		shape.calculateArea();
		shape.calculatePerimeter();
	}
	
	public static void main(String[] args) {
		GeometricShape gs = new GeometricShape();
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Please enter the geometrical shape name");
			String geo = scan.next();
			switch(geo.toLowerCase()) {
			case "square":
				System.out.println("Please enter the side in cm");
				int side = scan.nextInt();
				gs = new Square(side);
				break;
			case "rectangle":
				System.out.println("Please enter the length in cm");
				int length = scan.nextInt();
				System.out.println("Please enter the breadth in cm");
				int breadth = scan.nextInt();
				gs = new Rectangle(length, breadth);
				break;
			case "triangle":
				System.out.println("Please enter the height in cm");
				int height = scan.nextInt();
				System.out.println("Please enter the breadth in cm");
				breadth = scan.nextInt();
				gs = new Rectangle(height, breadth);
				break;
			case "exit": System.exit(0);
			}
			
			CalcAreaAndPerimeter calc = new CalcAreaAndPerimeter(gs);
			gs.getArea();
			gs.getPerimeter();
		}
	}
}
