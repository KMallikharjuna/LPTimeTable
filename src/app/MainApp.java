package app;

import services.CourseService;

public class MainApp {
	public static void main(String[] args) {
		CourseService service = new CourseService();
		service.menu();
	}
}
