package admin.model;
public class Admin {
	
	private String admin_username;
	private String admin_name;
	private String 	password;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(String admin_username,String admin_name,String password) {
		super();
		this.admin_username=admin_username;
		this.admin_name=admin_name;
		this.password = password;
	}

	public String getAdmin_Username() {
		return admin_username;
	}
	public void setAdmin_Username(String admin_username) {
		this.admin_username = admin_username;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
