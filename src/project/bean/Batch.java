package project.bean;

public class Batch {

	private int BatchID;
	private int TotalSeats;
	private String BatchName;
	private int CourseID;
	@Override
	public String toString() {
		return "batch [BatchID=" + BatchID + ", TotalSeats=" + TotalSeats + ", BatchName=" + BatchName + ", CourseID="
				+ CourseID + "]";
	}
	public int getBatchID() {
		return BatchID;
	}
	public void setBatchID(int batchID) {
		BatchID = batchID;
	}
	public int getTotalSeats() {
		return TotalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		TotalSeats = totalSeats;
	}
	public String getBatchName() {
		return BatchName;
	}
	public void setBatchName(String batchName) {
		BatchName = batchName;
	}
	public int getCourseID() {
		return CourseID;
	}
	public void setCourseID(int courseID) {
		CourseID = courseID;
	}
	
}
