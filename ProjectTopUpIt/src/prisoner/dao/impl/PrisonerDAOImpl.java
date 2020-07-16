package prisoner.dao.impl;
import guard.model.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import prisoner.dao.PrisonerDAO;
import prisoner.model.Prisoners;

public class PrisonerDAOImpl implements PrisonerDAO {

	private Connection con=null;
	public PrisonerDAOImpl(Connection con) {
		
		this.con=con;
	}
	@Override
	public boolean insertPrisoner(Prisoners prisoners) {
		
		int count=0;
		boolean status=false;
		
		try {
				PreparedStatement ps=con.prepareStatement("insert into prisoner values(?,?,?,?,?,?,?,?)");
				ps.setString(1, prisoners.getNational_ID());
				ps.setString(2, prisoners.getPrisoner_ID());
				ps.setString(3, prisoners.getPrisoner_Name());
				ps.setString(4, prisoners. getEntry_Date());
				ps.setString(5,prisoners.getRelease_Date());
				ps.setString(6,prisoners.getAddress());
				ps.setString(7,prisoners.getCrime_Name());
				ps.setString(8,prisoners.getCell_No());
				
				
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
	public List<Prisoners> retrievePrisoners() {
		
		List<Prisoners> list=new ArrayList<>();
		try {
			
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from prisoner");
			while(rs.next())
			{
				Prisoners prisoners=new Prisoners();
				//setNational_ID(String national_ID)
				prisoners.setNational_ID(rs.getString(1));
				prisoners.setPrisoner_ID(rs.getString(2));
				prisoners.setPrisoner_Name(rs.getString(3));
				prisoners.setEntry_Date(rs.getString(4));
				prisoners.setRelease_Date(rs.getString(5));
				prisoners.setAddress(rs.getString(6));
				prisoners.setCrime_Name(rs.getString(7));
				list.add(prisoners);
			}
			
		}catch (Exception e) {
            System.out.println("Error in Retrieve Prisoner : "+e);
		}
		return list;
	}

	@Override
	public int updatePrisoner(Prisoners prisoners) {
		
		int update=0;
		try {
			
		PreparedStatement ps=con.prepareStatement("update prisoner set National_ID=?,Prisoner_ID=?,Prisoner_Name=?,Entry_Date=?,Release_Date=?,Address=?,Crime_Name=? where National_ID=?");
		
		ps.setString(1, prisoners.getNational_ID());
		ps.setString(2, prisoners.getPrisoner_ID());
		ps.setString(3, prisoners.getPrisoner_Name());
		ps.setString(4, prisoners. getEntry_Date());
		ps.setString(5,prisoners.getRelease_Date());
		ps.setString(6,prisoners.getAddress());
		ps.setString(7,prisoners.getCrime_Name());
		ps.setString(8,prisoners.getNational_ID());
		
		update=ps.executeUpdate();
		}catch (Exception e) {
			System.out.println("Error in Update : "+e);
		}
		return update;
	}

	@Override
	public int deletePrisoner(Prisoners prisoners) {

		int update=0;
		try {
			
		PreparedStatement ps=con.prepareStatement("delete from prisoner where Prisoner_ID=?");
		
		ps.setString(1, prisoners.getPrisoner_ID());
		
		update=ps.executeUpdate();
		}catch (Exception e) {
			System.out.println("Error in Update : "+e);
		}
		return update;
	}
	@Override
	public List<Prisoners> JoinretrievePrisoners(String Guard_ID) {
		
		List<Prisoners> list=new ArrayList<>();
		try {
			
			String qry="SELECT prisoner.Prisoner_ID,prisoner.Prisoner_Name,prisoner.Cell_No\r\n" + 
					"FROM Prisoner\r\n" + 
					"INNER JOIN Guard ON Prisoner.Cell_NO = Guard.Cell_NO where Guard.Guard_ID=?";
		PreparedStatement st=con.prepareStatement(qry);
			 st.setString(1,Guard_ID);
					ResultSet rs=st.executeQuery();
					while(rs.next())
					{
						Prisoners prisoners=new Prisoners();
						
						//prisoners.setNational_ID(rs.getString(1));
						prisoners.setPrisoner_ID(rs.getString(1));
						prisoners.setPrisoner_Name(rs.getString(2));
						//prisoners.setEntry_Date(rs.getString(4));
						//prisoners.setRelease_Date(rs.getString(5));
						//prisoners.setAddress(rs.getString(6));
						//prisoners.setCrime_Name(rs.getString(7));
						prisoners.setCell_No(rs.getString(3));
						list.add(prisoners);
					}
		}catch (Exception e) {
           System.out.println("Error in Retrieve Prisoner : "+e);
		}
		return list;
	}

}
