package prisonerType2.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import prisonerType2.dao.prisonerType2DAO;
import prisonerType2.model.PrisonerType2;


public class prisonerType2DaoImplement implements prisonerType2DAO {
	private Connection con=null;
	public prisonerType2DaoImplement(Connection con) {
		
		this.con=con;
		}
	
	public boolean insertPrisoner(PrisonerType2 prisoner) {

		int count=0;
		boolean status=false;
		
		try {
				PreparedStatement ps=con.prepareStatement("insert into prisonertype2 values(?,?,?,?,?,?,?)");
				ps.setString(1, prisoner.getNational_ID());
				ps.setString(2, prisoner.getPrisoner_ID());
				ps.setString(3, prisoner.getPrisoner_Name());
				ps.setString(4, prisoner. getEntry_Date());
				ps.setString(5,prisoner.getExecution_Date());
				ps.setString(6,prisoner.getAddress());
				ps.setString(7,prisoner.getCrime_Name());
				
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
	

	public List<PrisonerType2> retrievePrisoners(){
		
		List<PrisonerType2> list=new ArrayList<>();
		try {
			
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from prisonertype2");
			while(rs.next())
			{
				PrisonerType2 prisoner=new PrisonerType2();
				//setNational_ID(String national_ID)
				prisoner.setNational_ID(rs.getString(1));
				prisoner.setPrisoner_ID(rs.getString(2));
				prisoner.setPrisoner_Name(rs.getString(3));
				prisoner.setEntry_Date(rs.getString(4));
				prisoner.setExecution_Date(rs.getString(5));
				prisoner.setAddress(rs.getString(6));
				prisoner.setCrime_Name(rs.getString(7));
				list.add(prisoner);
			}
			
		}catch (Exception e) {
            System.out.println("Error in Retrieve Prisoner : "+e);
		}
		return list;
	}
	public int updatePrisoner(PrisonerType2 prisoner) {
	int update=0;
	try {
		
	PreparedStatement ps=con.prepareStatement("update prisonertype2 set National_ID=?,Prisoner_ID=?,Prisoner_Name=?,Entry_Date=?,Execution_Date=?,Address=?,Crime_Name=? where Prisoner_ID=?");
	
	ps.setString(1, prisoner.getNational_ID());
	ps.setString(2, prisoner.getPrisoner_ID());
	ps.setString(3, prisoner.getPrisoner_Name());
	ps.setString(4, prisoner. getEntry_Date());
	ps.setString(5,prisoner.getExecution_Date());
	ps.setString(6,prisoner.getAddress());
	ps.setString(7,prisoner.getCrime_Name());
	ps.setString(8,prisoner.getPrisoner_ID());
	
	update=ps.executeUpdate();
	}catch (Exception e) {
		System.out.println("Error in Update : "+e);
	}
	return update;}
	
	public int deletePrisoner(PrisonerType2 prisoner) {
		
		int update=0;
		try {
			
		PreparedStatement ps=con.prepareStatement("delete from prisonertype2 where Prisoner_ID=?");
		
		ps.setString(1, prisoner.getPrisoner_ID());
		
		update=ps.executeUpdate();
		}catch (Exception e) {
			System.out.println("Error in Update : "+e);
		}
		return update;
	}
}
