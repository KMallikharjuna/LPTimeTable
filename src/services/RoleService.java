package services;

import java.util.List;
import java.util.Scanner;

import constants.DBConstants;
import entities.Role;
import repos.RoleRepository;

public class RoleService {
	private RoleRepository roleRepo;
	private Scanner scan = new Scanner(System.in);
	public RoleService() {
		String driver = DBConstants.DRIVER_CLASS;
		String url = DBConstants.CONNECTION_URL;
		String pwd = DBConstants.CONNECTION_PASSWORD;
		String user = DBConstants.CONNETION_USERNAME;
		roleRepo = new RoleRepository(driver, url, user, pwd);
	}
	
	public void getAllRoles() {
		List<Role> availableRoles = roleRepo.findAll();
		if(null != availableRoles && availableRoles.size() != 0) {
			for(Role role : availableRoles) {
				System.out.println(role);
			}
		}
		else {
			System.out.println("No roles added till now.");
		}
	}
	
	public void getById() {
		scan.nextLine();
		System.out.println("Please enter the role id");
		int id = scan.nextInt();
		Role role = roleRepo.findById(id);
		if(null != role) {
			System.out.println(role);
		}
		else{
			System.out.println("No role found with the given Id.");
		}
	}
	
	public void addRole() {
		scan.nextLine();
		System.out.println("Enter the Role Name ");
		String roleName = scan.nextLine();
		scan.nextLine();
		System.out.println("Enter the Role Description");
		String roleDesc = scan.nextLine();
		Role role  = new Role(roleName, roleDesc);
		String msg = roleRepo.save(role);
		System.out.println(msg);
	}
	
	public void menu() {
		while(true) {
			System.out.println("===================MENU=======================");
			System.out.println("\tPress 1 to add a new role");
			System.out.println("\tPress 2 to display all available roles");
			System.out.println("\tPress 3 to display the role by id");
			System.out.println("\tPress 9 to exit from the menu");
			System.out.print("\n\tPlease enter your choice___: ");
			int choice = scan.nextInt();
			switch(choice) {
				case 1 : addRole();break;
				case 2 : getAllRoles();break;
				case 3 : getById();break;
				case 9 : System.exit(choice);
				default : System.out.println("Sorry you've entered a wrong choice");
			}
		}
	}
}
