package admin.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import admin.dao.AdminDAO;
import admin.model.Admin;

public class AdminDAOImplement implements AdminDAO {

 private Connection con=null;
 
 
 public AdminDAOImplement(Connection con) {
  super();
  this.con = con;
 }

 @Override
 public boolean insertAdmin(Admin admin) {
  
  boolean status=false;
  
  try {
    PreparedStatement ps=con.prepareStatement("insert into admin values(?,?,?)");
    ps.setString(1, admin.getAdmin_Username());
    ps.setString(2, admin.getAdmin_name());
    ps.setString(3, admin.getPassword());
    status=ps.execute();
    return status;
  }catch (Exception e) {
   System.out.println("Error in Insert DAO : "+e);
  }
  
  return status;
 }

 @Override
 public List<Admin> retrieveAdmin() {
  
  List<Admin> list=new ArrayList<>();
  try {
   
   Statement st=con.createStatement();
   ResultSet rs=st.executeQuery("select * from login");
   while(rs.next())
   {
    Admin admin=new Admin();
    admin.setAdmin_Username(rs.getString(1));
    admin.setAdmin_name(rs.getString(2));
    admin.setPassword(rs.getString(3));
    list.add(admin);
   }
   
  }catch (Exception e) {
            System.out.println("Error in Retrive Admin : "+e);
  }
  return list;
 }

 //@Override

 public int deleteAdmin() {
  // TODO Auto-generated method stub
  int update=0;
  try {
 Admin admin=new Admin();
  PreparedStatement ps=con.prepareStatement("delete from admin where admin_Username=?");
  
  ps.setString(1,admin.getAdmin_Username());
  
  update=ps.executeUpdate();
  }catch (Exception e) {
   System.out.println("Error in Update : "+e);
  }
  return update;
 }

@Override
public int updateAdmin(Admin admin) {
	// TODO Auto-generated method stub

		  
		  int update=0;
		  try {
		   
		  PreparedStatement ps=con.prepareStatement("update admin set Admin_UserName=?,password=? where Admin_name=?");
		  
		  
		  ps.setString(1, admin.getAdmin_Username());
		  ps.setString(2, admin.getPassword());
		  ps.setString(3, admin.getAdmin_name());
		  update=ps.executeUpdate();
		  }catch (Exception e) {
		   System.out.println("Error in Update : "+e);
		  }
		  return update;
		 }
}

