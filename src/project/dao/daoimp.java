package project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import project.bean.Batch;
import project.bean.Course;
import project.bean.Student;
import project.exceptions.CourseException;
import project.exceptions.StudentException;
import project.utility.DButil;

public class daoimp implements dao {
	@Override
	public String registerStudent(Student student) throws StudentException, SQLException {
		// TODO Auto-generated method stub
		String answer = "Student already exists!";
		String FirstName = student.getFirstName();
		String lastName = student.getLastName();
		String Email = student.getEmail();
		String Password = student.getPassword();
		try (Connection conn = DButil.getConnection()) {
			PreparedStatement ps = conn.prepareStatement(
					"insert into student (FirstName,LastName,Email,password,BatchID,AdminStatus) values(?,?,?,?,NUll,0);");
			ps.setString(1, FirstName);
			ps.setString(2, lastName);
			ps.setString(3, Email);
			ps.setString(4, Password);
			int x = ps.executeUpdate();
			answer = x + " Student Successfully Registerd";

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			throw new SQLException(e.getMessage());

		}

		return answer;
	}

	@Override
	public Student login(String password, String Id) throws StudentException, SQLException {
		Student s = null;

		try (Connection conn = DButil.getConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from student where Email= ? AND password = ?");
			ps.setString(1, Id);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				s = new Student();
				s.setBatchID(rs.getInt("BatchID"));
				s.setFirstName(rs.getString(("FirstName")));
				s.setLastName(rs.getString(("LastName")));
				s.setEmail(rs.getString("Email"));
				s.setPassword(rs.getString("password"));
				s.setAddmintStatus(rs.getInt("AdminStatus"));
				s.setStuentID(rs.getInt("StudentID"));
			}

		} catch (SQLException e) {
			throw new StudentException(e.getMessage());
		}
		return s;
	}

	@Override
	public String enrollCourse(Student student) throws StudentException, SQLException {
		String result="Not Enroll";
		// TODO Auto-generated method stub  "update batchSeats set seatsFilled = (seatsFilled + 1) where cId = ? AND bId = ?"
		try (Connection conn = DButil.getConnection()) {

			PreparedStatement ps = conn.prepareStatement("update student set Batch = ? Email Id = ? AND password = ?");
			ps.setInt(1, student.getBatchID());
			ps.setString(2, student.getEmail());
			ps.setString(2, student.getPassword());
			int x = ps.executeUpdate();
			if(x>0) {
				result="Student Enroll Succesfull";
			}

		} catch (SQLException e) {
			throw new StudentException(e.getMessage());
		}
		return result;
	}
	@Override
	public String updateCourse(Student student) throws StudentException, SQLException {
		return enrollCourse(student);
	}

	@Override
	public String SeeAllCourseAndSeat(Student student) throws StudentException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addNewCourses(Course course) throws CourseException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateFees(Course course) throws CourseException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String seatchInformationAboutCourse(Course course) throws CourseException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String CreateNewBatch(Batch batch) throws CourseException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String UpdateTotalSeatesofBatch(Batch batch) throws CourseException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
