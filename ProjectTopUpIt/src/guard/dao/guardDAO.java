package guard.dao;

import guard.model.Guard;
import java.util.List;


public interface guardDAO {
	public boolean insertGuard(Guard guard);
	public List<Guard> retrieveGuard();
	public int updateGuard(Guard guard);
	public int deleteGuard(Guard guard);
}
