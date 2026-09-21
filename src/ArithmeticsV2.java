package pkg1;

public class ArithmeticsV2 {
	public static void main(String[] args) {
		Arithmetics ar = new Arithmetics(50,3);
		//ar.addition(); We unable to access the private member.
		ar.subtraction();
		ar.multiplication();
		ar.division();
	}
}
