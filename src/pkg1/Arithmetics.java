package pkg1;

public class Arithmetics {
	public int x;
	public int y;
	
	public Arithmetics(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public Arithmetics() {
		System.out.println("Welcome to Arithmetics");
	}
	
	private void addition() {
		System.out.println(x+y);
	}
	
	void subtraction() {
		System.out.println(x-y);
	}
	
	protected void multiplication() {
		System.out.println("Arithmetics mul function");
		System.out.println(x*y);
	}
	
	public void division() {
		System.out.println(x/y);
	}
	
	public static void main(String[] args) {
		Arithmetics ar = new Arithmetics(10,20);
		ar.addition();
		ar.subtraction();
		ar.multiplication();
		ar.division();
	}
}
