package prisoner.dao;
import guard.model.*;
import java.util.List;

import prisoner.model.Prisoners;

public interface PrisonerDAO {
	
	public boolean insertPrisoner(Prisoners prisoners);
	public List<Prisoners> retrievePrisoners();
	public int updatePrisoner(Prisoners prisoners);
	public int deletePrisoner(Prisoners prisoners);
	public List<Prisoners> JoinretrievePrisoners(String Guard_ID);
	

}

