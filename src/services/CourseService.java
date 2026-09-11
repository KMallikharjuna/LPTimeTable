package services;
import java.util.Scanner;

import entities.Course;

public class CourseService {
	private Course courses[] = new Course[100];
	private int id=101;
	private int index = 0;
	private Scanner scan = new Scanner(System.in);
	private boolean status = true;
	public void addCourse() {
		scan.nextLine();
		if(index < 100) {
			System.out.println("Enter the Course Name ");
			String name = scan.nextLine();
			System.out.println("Enter the Duration ");
			int duration = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter the Teaching Medium ");
			String medium = scan.nextLine();
			System.out.println("Enter the Teaching Mode");
			String mode = scan.nextLine();
			System.out.println("Enter the Fee ");
			double fee = scan.nextDouble();
			
			Course course = new Course(id, name, duration, 
					mode, medium, fee, status);
			
			courses[index] = course;
			id++;
			index++;
			System.out.printf("%s is added successfully",name);
			System.out.println();
		}
		else {
			System.out.println("We have reached to over limit of courses");
		}
	}
	public void displayAllCourses() {
		if(index == 0) {
			System.out.println("No course is available");
		}
		else {
			for(int i=0; i<index; i++) {
				Course c = courses[i];
				System.out.println(c.getCourseDetails());
			}
		}
	}
	
	public void displayCourseById() {
		if(index == 0) {
			System.out.println("No course is available");
		}
		else {
			System.out.println("Enter the course Id");
			int courseId = scan.nextInt();
			boolean flag = false;
			Course c = null;
			for(int i = 0; i<index ; i++) {
				c = courses[i];
				if(c.getId() == courseId) {
					flag = true;
					break;
				}
			}
			if(flag) {
				System.out.println(c.getCourseDetails());
			}
		}
	}
	
	public void menu() {
		while(true) {
			System.out.println("======================MENU=======================");
			System.out.println("\tPress 1 for adding a new course");
			System.out.println("\tPress 2 for display all available courses");
			System.out.println("\tPress 3 to get a course by Id");
			System.out.println("\tPress 9 for Exit from the program");
			System.out.println("Please enter your choice");
			int choice = scan.nextInt();
			switch(choice) {
				case 1 : addCourse();break;
				case 2 : displayAllCourses(); break;
				case 3 : displayCourseById(); break;
				case 9 : System.exit(0);
				default : System.out.println("You have entered an invalid value");
			}
		}
	}
}
