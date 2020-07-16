package doctor.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import doctor.dao.DoctorDAO;
import doctor.model.Doctors;

public class DoctorDAOImpl implements DoctorDAO {

	private Connection con=null;
	public DoctorDAOImpl(Connection con) {
		
		this.con=con;
	}
	@Override
	public boolean insertPrisoner(Doctors doctors) {
		
		int count=0;
		boolean status=false;
		
		try {
				PreparedStatement ps=con.prepareStatement("insert into doctor values(?,?,?)");
				ps.setString(1, doctors.getDoctor_ID());
				ps.setString(2, doctors.getDoctor_Name());
				ps.setString(3, doctors.getPrisoner_ID());
				
				
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
	public List<Doctors> retrievePrisoners() {
		
		List<Doctors> list=new ArrayList<>();
		try {
			
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from doctor");
			while(rs.next())
			{
				Doctors doctors=new Doctors();
				//setNational_ID(String national_ID)
				doctors.setDoctor_ID(rs.getString(1));
				doctors.setDoctor_Name(rs.getString(2));
				doctors.setPrisoner_ID(rs.getString(3));
				
				list.add(doctors);
			}
			
		}catch (Exception e) {
            System.out.println("Error in Retrieve Doctor : "+e);
		}
		return list;
	}

	@Override
	public int updatePrisoner(Doctors doctors) {
		
		int update=0;
		try {
			
		PreparedStatement ps=con.prepareStatement("update doctor set Doctor_ID=?,Doctor_Name=?,Prisoner_ID=? where  Doctor_ID=?");
		
		ps.setString(1, doctors.getDoctor_ID());
		ps.setString(2, doctors.getDoctor_Name());
		ps.setString(3, doctors.getPrisoner_ID());
		ps.setString(4,doctors.getDoctor_ID());
		

		update=ps.executeUpdate();
		}catch (Exception e) {
			System.out.println("Error in Update : "+e);
		}
		return update;
	}

	@Override
	public int deletePrisoner(Doctors doctors) {

		int update=0;
		try {
			
		PreparedStatement ps=con.prepareStatement("delete from doctor where Doctor_ID=?");
		
		ps.setString(1, doctors.getDoctor_ID());
		
		update=ps.executeUpdate();
		}catch (Exception e) {
			System.out.println("Error in Update : "+e);
		}
		return update;
	}

}
