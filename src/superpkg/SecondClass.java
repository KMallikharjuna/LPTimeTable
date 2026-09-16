package superpkg;

public class SecondClass extends FirstClass{
	int z = 20;
	public SecondClass(int p, int q) {
		super(p,q);
	}
	
	public void multiplication() {
		System.out.println(x+" X "+y+" = "+(x*y));
	}
	
	public void showZ() {
		int z = 10;
		System.out.println("local  z = "+z);
		System.out.println("class  z = "+this.z);
		System.out.println("Parent z = "+super.z);
		
	}
}
