package app;

import services.CourseService;
import services.Swapping;

public class MainApp {
	public static void main(String[] args) {
		/*CourseService service = new CourseService();
		service.menu();*/
		Swapping<String> s=new Swapping();
		s.swap("Pavan", "Varun");
	}
}
