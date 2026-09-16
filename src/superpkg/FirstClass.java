package superpkg;

public class FirstClass {
	protected int x;
	protected int y;
	protected int z=30;
	
	public FirstClass(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void addition() {
		System.out.println(x+" + "+y+" = "+(x+y));
	}
}
