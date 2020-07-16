package executioner.dao;

import java.util.List;

import executioner.model.PrisonersExecutioner;

public interface PrisonerExecutionerDAO {
	public boolean insertExecutioner(PrisonersExecutioner prisonersExecutioner);
	public List<PrisonersExecutioner> retrieveExecutioner();
	public int updateExecutioner(PrisonersExecutioner prisonersExecutioner);
	public int deletePrisonerExecution(PrisonersExecutioner prisonersExecutioner);


}
