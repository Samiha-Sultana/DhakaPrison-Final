package doctor.model;

public class Doctors{


private String Doctor_ID;
private String Doctor_Name;
private String Prisoner_ID;

public Doctors(){
	super();
}

public Doctors(String doctor_ID, String doctor_Name, String prisoner_ID) {
	super();
	Doctor_ID = doctor_ID;
	Doctor_Name = doctor_Name;
	Prisoner_ID = prisoner_ID;
}

public String getDoctor_ID() {
	return Doctor_ID;
}

public void setDoctor_ID(String doctor_ID) {
	Doctor_ID = doctor_ID;
}

public String getDoctor_Name() {
	return Doctor_Name;
}

public void setDoctor_Name(String doctor_Name) {
	Doctor_Name = doctor_Name;
}

public String getPrisoner_ID() {
	return Prisoner_ID;
}

public void setPrisoner_ID(String prisoner_ID) {
	Prisoner_ID = prisoner_ID;
}


}