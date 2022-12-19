package project.bean;

public class instructor {
	
	private String InstructorName;
	private String InstuctirRoll;
	private int InstructorID;
	public String getInstructorName() {
		return InstructorName;
	}
	public void setInstructorName(String instructorName) {
		InstructorName = instructorName;
	}
	public String getInstuctirRoll() {
		return InstuctirRoll;
	}
	public void setInstuctirRoll(String instuctirRoll) {
		InstuctirRoll = instuctirRoll;
	}
	public int getInstructorID() {
		return InstructorID;
	}
	public void setInstructorID(int instructorID) {
		InstructorID = instructorID;
	}
	@Override
	public String toString() {
		return "instructor [InstructorName=" + InstructorName + ", InstuctirRoll=" + InstuctirRoll + ", InstructorID="
				+ InstructorID + "]";
	}
	
	

}
