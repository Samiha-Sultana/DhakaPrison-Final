package doctor.dao;

import java.util.List;

import doctor.model.Doctors;

public interface DoctorDAO {
	public boolean insertPrisoner(Doctors doctors);
	public List<Doctors> retrievePrisoners();
	public int updatePrisoner(Doctors doctors);
	public int deletePrisoner(Doctors doctors);
}
