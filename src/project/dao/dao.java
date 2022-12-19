package project.dao;

import java.sql.SQLException;

import project.bean.Batch;
import project.bean.Course;
import project.bean.Student;
import project.exceptions.CourseException;
import project.exceptions.StudentException;

public interface dao {
	//Student Roles and registeration dao
	public String registerStudent (Student student) throws StudentException, SQLException;
	
	public Student login(String password,String Id)throws StudentException, SQLException;
	
	public String enrollCourse(Student student) throws StudentException, SQLException;
	
	public String updateCourse(Student student) throws StudentException ,SQLException;
	
	public String SeeAllCourseAndSeat(Student student) throws StudentException ,SQLException;
	
	// Administrator;
	
	public String addNewCourses(Course course) throws CourseException ,SQLException;
	
	public String updateFees(Course course) throws CourseException ,SQLException;
	
	
	public String seatchInformationAboutCourse(Course course)  throws CourseException ,SQLException;
	
	
	public String CreateNewBatch(Batch batch)  throws CourseException ,SQLException;
	
	
	public String UpdateTotalSeatesofBatch(Batch batch)throws CourseException ,SQLException;
}
