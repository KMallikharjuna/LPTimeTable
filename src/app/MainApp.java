package app;

import services.RoleService;

public class MainApp {
	public static void main(String[] args){
		RoleService service = new RoleService();
		service.menu();
	}
}
