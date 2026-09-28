package multipleInheritance;

public class MultiInheritanceApp {
	public static void main(String[] args) {
		SmartMobile smart1 = new SmartMobile();
		smart1.addition(10, 20);
		smart1.takePic();
		smart1.makeACall(299389283L);
		
		Camera cam = new SmartMobile();
		cam.takePic();
		cam.slowMotion();
		
		Mobile mob = new SmartMobile();
		mob.makeACall(9388398839L);
		mob.dropCall(9388398839L);
		mob.takePic();
		
		Calculator calc = new SmartMobile();
		calc.addition(0, 0);
		calc.multiplication(0, 0);
	}
}
