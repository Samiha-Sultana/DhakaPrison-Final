package guard.model;

public class Guard{
  
  private String Guard_ID;
  private String Guard_Name;
  private String Cell_No;
  
  public Guard(){
    super();
  }
  
  public Guard(String guard_ID,String guard_Name,String cell_No) {
    super();
    this.Guard_ID = guard_ID;
    this.Guard_Name = guard_Name;
    this.Cell_No = cell_No;
  }
  
  public String getGuard_ID() {
    return Guard_ID;
  }
  public void setGuard_ID(String guard_ID) {
    Guard_ID = guard_ID;
  }
  public String getGuard_Name() {
    return Guard_Name;
  }
  public void setGuard_Name(String guard_Name) {
    Guard_Name = guard_Name;
  }
  public String getCell_No() {
    return Cell_No;
  }
  
  public void setCell_No(String cell_No) {
    Cell_No = cell_No;
  }
}
