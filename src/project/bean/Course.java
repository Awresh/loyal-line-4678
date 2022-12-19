package project.bean;

public class Course {
	private int CourseID;
	private String CourseName;
	private int CourseDuration;
	private int CourseFee;
	private String CourseDetails;
	private String InstructorID;
	public int getCourseID() {
		return CourseID;
	}
	public void setCourseID(int courseID) {
		CourseID = courseID;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public int getCourseDuration() {
		return CourseDuration;
	}
	public void setCourseDuration(int courseDuration) {
		CourseDuration = courseDuration;
	}
	public int getCourseFee() {
		return CourseFee;
	}
	public void setCourseFee(int courseFee) {
		CourseFee = courseFee;
	}
	public String getCourseDetails() {
		return CourseDetails;
	}
	public void setCourseDetails(String courseDetails) {
		CourseDetails = courseDetails;
	}
	public String getInstructorID() {
		return InstructorID;
	}
	public void setInstructorID(String instructorID) {
		InstructorID = instructorID;
	}
	@Override
	public String toString() {
		return "Course [CourseID=" + CourseID + ", CourseName=" + CourseName + ", CourseDuration=" + CourseDuration
				+ ", CourseFee=" + CourseFee + ", CourseDetails=" + CourseDetails + ", InstructorID=" + InstructorID
				+ "]";
	}
		
}
