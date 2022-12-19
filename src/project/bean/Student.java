package project.bean;

public class Student {

	private String Email;
	private String Password; 
	private String FirstName;
	private String LastName;
	private int batchID;
	private int StuentID;
	private int addmintStatus;
	
	
	
	public int getAddmintStatus() {
		return addmintStatus;
	}
	public void setAddmintStatus(int addmintStatus) {
		this.addmintStatus = addmintStatus;
	}
	public int getStuentID() {
		return StuentID;
	}
	public void setStuentID(int stuentID) {
		StuentID = stuentID;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getBatchID() {
		return batchID;
	}
	public void setBatchID(int batchID) {
		this.batchID = batchID;
	}
	@Override
	public String toString() {
		return "Student [Email=" + Email + ", Password=" + Password + ", FirstName=" + FirstName + ", LastName="
				+ LastName + ", batchID=" + batchID + ", StuentID=" + StuentID + ", addmintStatus=" + addmintStatus
				+ "]";
	}
	
	
	
	
	
}
