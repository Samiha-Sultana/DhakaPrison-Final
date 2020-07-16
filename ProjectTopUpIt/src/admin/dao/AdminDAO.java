package admin.dao;

import java.util.List;
import admin.model.Admin;

public interface AdminDAO {
	 
	 public boolean insertAdmin(Admin admin);
	 public List<Admin> retrieveAdmin();
	 public int updateAdmin(Admin admin);
	 public int deleteAdmin();
}
