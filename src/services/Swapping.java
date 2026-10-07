package services;

public class Swapping<X> {
	public void swap(X a, X b) {
		System.out.println("Elements Before swaaping ");
		System.out.println("x => "+a+"          and           y => "+b);
		System.out.println();
		
		X tmp = a;
		a = b;
		b = tmp;
		
		System.out.println("Elements After swaaping ");
		System.out.println("x => "+a+"          and           y => "+b);
		System.out.println();
	}
}
