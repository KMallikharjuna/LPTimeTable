package repos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import config.DBConfig;
import entities.Role;

public class RoleRepository {
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private String query = null;
	private static Connection con;
	public RoleRepository(String driver, String url, String user, String pwd) {
		con = DBConfig.getConnection(driver, url, user, pwd);
	}
	public String save(Role role) {
		String msg = "";
		try {
			query = "insert into role(roleName, roleDesc, status) values(?,?,?)";
			ps = con.prepareStatement(query);
			ps.setString(1, role.getRoleName());
			ps.setString(2, role.getRoleDesc());
			ps.setBoolean(3, role.isStatus());
			ps.execute();
			msg = "New role has been inserted Successfully";
		} catch (Exception e) {
			msg = "Unable to insert the new role.";
		}
		return msg;
	}
	
	public Role getRoleByResultSet(ResultSet result) {
		Role role = null;
		try {
			role = new Role();
			role.setId(rs.getInt("id"));
			role.setRoleName(rs.getString("roleName"));
			role.setRoleDesc(rs.getString("roleDesc"));
			role.setStatus(rs.getBoolean("status"));
		} catch (Exception e) {
			System.out.println("Unable to get the record.");
		}
		return role;
	}
	
	public List<Role> findAll() {
		List<Role> availableRoles = null;
		try {
			availableRoles = new ArrayList<Role>();
			query = "select * from role";
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				Role role = getRoleByResultSet(rs);
				availableRoles.add(role);
			}
		} catch (Exception e) {
			System.out.println("Unable to Get the Data from the DB.");
		}
		return availableRoles;
	}
	
	public Role findById(int roleId) {
		try {
			query = "select * from role where id = ?";
			ps = con.prepareStatement(query);
			ps.setInt(1, roleId);
			rs = ps.executeQuery();
			if(rs.next()) {
				Role role = getRoleByResultSet(rs);
				return role;
			}
			else {
				return null;
			}
		} catch (Exception e) {
			System.out.println("Unable to Get the Data from the DB.");
			return null;
		}
	}
	
	public String update(Role role) {
		String msg = "";
		try {
			query = "update role set roleName=?, roleDesc=?, status=? where id=?";
			ps = con.prepareStatement(query);
			ps.setString(1, role.getRoleName());
			ps.setString(2, role.getRoleDesc());
			ps.setBoolean(3, role.isStatus());
			ps.setInt(4, role.getId());
			ps.execute();
			msg = "Role has been updated Successfully";
		} catch (Exception e) {
			msg = "Unable to update the role.";
		}
		return msg;
	}
}
