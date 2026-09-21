package finalex;

public final class FinalExample {
	final int x;
	public FinalExample(int x) {
		this.x = x;
	}
	final public void showX() {
		//x = x+1;
		System.out.println(x);
	}
}
