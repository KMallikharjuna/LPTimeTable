package pkg2;

import pkg1.Arithmetics;

public class Calculator extends Arithmetics{
	public Calculator() {
		System.out.println("Welcome to Calculator");
	}
	public void power() {
		int res = 1;
		for(int i=0;i<y; i++) {
			res = res * x; 
		}
		System.out.println(res);
	}
	public void multiplication() {
		System.out.println("Calculator Mul function");
		System.out.println(x * y);
	}
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.x = 2;
		calc.y = 5;
		calc.multiplication();
		calc.division();
		calc.power();
	}
}
