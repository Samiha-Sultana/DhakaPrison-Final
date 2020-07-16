package executioner.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import executioner.dao.PrisonerExecutionerDAO;
import executioner.model.PrisonersExecutioner;

public class PrisonerExecutionerDAOImpl implements PrisonerExecutionerDAO {

	private Connection con=null;
	public PrisonerExecutionerDAOImpl(Connection con) {
		
		this.con=con;
	}
	@Override
	public boolean insertExecutioner(PrisonersExecutioner prisonersExecutioner) {
		
		int count=0;
		boolean status=false;
		
		try {
				PreparedStatement ps=con.prepareStatement("insert into executioner values(?,?,?,?,?)");
				ps.setString(1, prisonersExecutioner.getNational_ID());
				ps.setString(2, prisonersExecutioner.getExecutioner_ID());
				ps.setString(3, prisonersExecutioner.getExecutioner_Name());
				ps.setString(4, prisonersExecutioner. getPrisoner_ID());
				ps.setString(5,prisonersExecutioner.getDuty_Date());
				
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

	@Override
	public List<PrisonersExecutioner> retrieveExecutioner() {
		
		List<PrisonersExecutioner> list=new ArrayList<>();
		try {
			
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from executioner");
			while(rs.next())
			{
				PrisonersExecutioner prisonersExecutioner=new PrisonersExecutioner();
				//setNational_ID(String national_ID)
				prisonersExecutioner.setNational_ID(rs.getString(1));
				prisonersExecutioner.setExecutioner_ID(rs.getString(2));
				prisonersExecutioner.setExecutioner_Name(rs.getString(3));
				prisonersExecutioner.setPrisoner_ID(rs.getString(4));
				prisonersExecutioner.setDuty_Date(rs.getString(5));
				
				list.add(prisonersExecutioner);
			}
			
		}catch (Exception e) {
            System.out.println("Error in Retrieve Prisoner : "+e);
		}
		return list;
	}

	@Override
	public int updateExecutioner(PrisonersExecutioner prisonersExecutioner) {
		
		int update=0;
		try {
			
		PreparedStatement ps=con.prepareStatement("update executioner set National_ID=?,Executioner_Name=?,Prisoner_ID=?,Duty_Date=? where Executioner_ID=?");
		
		ps.setString(1, prisonersExecutioner.getNational_ID());
		ps.setString(2, prisonersExecutioner.getExecutioner_Name());
		ps.setString(3, prisonersExecutioner. getPrisoner_ID());
		ps.setString(4,prisonersExecutioner.getDuty_Date());
		ps.setString(5,prisonersExecutioner.getExecutioner_ID());
		
		update=ps.executeUpdate();
		}catch (Exception e) {
			System.out.println("Error in Update : "+e);
		}
		return update;
	}

	@Override
	public int deletePrisonerExecution(PrisonersExecutioner prisonersExecutioner) {

		int update=0;
		try {
			
		PreparedStatement ps=con.prepareStatement("delete from executioner where Executioner_ID=?");
		
		ps.setString(1, prisonersExecutioner.getExecutioner_ID());
		
		update=ps.executeUpdate();
		}catch (Exception e) {
			System.out.println("Error in Eexcutioner Update : "+e);
		}
		return update;
	}

}