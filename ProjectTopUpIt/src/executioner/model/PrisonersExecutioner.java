package executioner.model;

public class PrisonersExecutioner{



private String National_ID;
private String Executioner_ID;
private String Executioner_Name;
private String Prisoner_ID;
private String Duty_Date;

public PrisonersExecutioner(){
	super();
}

public PrisonersExecutioner(String national_ID, String executioner_ID, String executioner_Name, String prisoner_ID,
		String duty_Date) {
	super();
	National_ID = national_ID;
	Executioner_ID = executioner_ID;
	Executioner_Name = executioner_Name;
	Prisoner_ID = prisoner_ID;
	Duty_Date = duty_Date;
}

public String getNational_ID() {
	return National_ID;
}

public void setNational_ID(String national_ID) {
	National_ID = national_ID;
}

public String getExecutioner_ID() {
	return Executioner_ID;
}

public void setExecutioner_ID(String executioner_ID) {
	Executioner_ID = executioner_ID;
}

public String getExecutioner_Name() {
	return Executioner_Name;
}

public void setExecutioner_Name(String executioner_Name) {
	Executioner_Name = executioner_Name;
}

public String getPrisoner_ID() {
	return Prisoner_ID;
}

public void setPrisoner_ID(String prisoner_ID) {
	Prisoner_ID = prisoner_ID;
}

public String getDuty_Date() {
	return Duty_Date;
}

public void setDuty_Date(String duty_Date) {
	Duty_Date = duty_Date;
}



}