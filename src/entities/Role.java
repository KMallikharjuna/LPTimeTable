package entities;

public class Role {
	//Properties in Table
	private int id;
	private String roleDesc;
	private String roleName;
	private boolean status=true;
	
	//Setters and Getters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRoleDesc() {
		return roleDesc;
	}
	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	//Constructor with Arguments (All args constructor)
	public Role(String roleName, String roleDesc) {
		super();
		this.roleDesc = roleDesc;
		this.roleName = roleName;
	}
	//Empty constructor (No Args constructor).
	public Role() {
		
	}
	//To String method.
	@Override
	public String toString() {
		return "Role [id=" + id + ", roleDesc=" + roleDesc + ", roleName=" + roleName + ", status=" + status + "]";
	}
	
}