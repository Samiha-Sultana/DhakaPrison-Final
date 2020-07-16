package guard.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import guard.dao.guardDAO;
import guard.model.Guard;


public class guardDaoImplement implements guardDAO {
  private Connection con=null;
  public guardDaoImplement(Connection con) {
    this.con=con;
  }
  
  public boolean insertGuard(Guard guard) {
    int count=0;
    boolean status=false;
    try {
      PreparedStatement ps=con.prepareStatement("insert into guard values(?,?,?)");
      ps.setString(1, guard.getGuard_ID());
      ps.setString(2, guard.getGuard_Name());
      ps.setString(3,guard.getCell_No());
      count=ps.executeUpdate();
      if(count>0) {
        status=true; 
      }
      System.out.println(status+ "in dao impli");
      return status;
      
    }catch (Exception e) {
      System.out.println("Error in INsert DAO : "+e);
    }
    return status;
  }
  
  
  public List<Guard>retrieveGuard(){
    List<Guard> list=new ArrayList<>();
    try {
      Statement st=con.createStatement();
      ResultSet rs=st.executeQuery("select * from guard");
      while(rs.next())
      {
        Guard guard =new Guard();
        guard.setGuard_ID(rs.getString(1));
        guard.setGuard_Name(rs.getString(2));
        guard.setCell_No(rs.getString(3));
        list.add(guard);
      }
      
    }catch (Exception e) {
      System.out.println("Error in Retrieve Guard : "+e);
    }
    return list;
  }
  public int updateGuard(Guard guard ) {
    int update=0;
    try {
      PreparedStatement ps=con.prepareStatement("update guard set Guard_Name=?,Cell_No=?,Guard_ID=? where Guard_ID=?");
      ps.setString(1, guard.getGuard_Name());
      ps.setString(2,guard.getCell_No());
      ps.setString(3,guard.getGuard_ID());
      ps.setString(4,guard.getGuard_ID());
      update=ps.executeUpdate();
    }catch (Exception e) {
      System.out.println("Error in Update : "+e);
    }
    return update;
  }
  
  public int deleteGuard(Guard guard ) {
    int update=0;
    try {
      PreparedStatement ps=con.prepareStatement("delete from guard where Guard_ID=?");
      ps.setString(1, guard.getGuard_ID());
      update=ps.executeUpdate();
    }catch (Exception e) {
      System.out.println("Error in Update : "+e);
    }
    return update;
  }
}
