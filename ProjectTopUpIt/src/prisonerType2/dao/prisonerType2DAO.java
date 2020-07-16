package prisonerType2.dao;

import java.util.List;

import prisonerType2.model.PrisonerType2;

public interface prisonerType2DAO {

	public boolean insertPrisoner(PrisonerType2 prisoners);
	public List<PrisonerType2> retrievePrisoners();
	public int updatePrisoner(PrisonerType2 prisoners);
	public int deletePrisoner(PrisonerType2 prisoners);
	
}
