package project.use;

import java.sql.SQLException;
import java.util.Scanner;

import project.bean.Student;
import project.dao.daoimp;
import project.exceptions.StudentException;
public class Main {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Wellcome To Student Risteration System");
		//daoimp Dimp=new daoimp();
		boolean flag=true;
		while(flag) {
			System.out.println("Enter 1 for Login");
			System.out.println("Enter 2 for Registration");
			System.out.println("Enter 3 For Exit");
			int ans=s.nextInt();
			
			switch(ans) {
			case 1: Login();flag=false;
			break;
			case 2: Registration();flag=false;
			break;
			case 3:flag=false;
			break;
			default :System.out.println("Invalid input please try again");
			}
		}
		System.out.println("Thanks For Visit");
		
		
	}
	
	public static void Registration() {
		daoimp Dimp=new daoimp();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your First Name:");
		String FName = sc.next();
		
		System.out.println("Enter your Last Name:");
		String LName = sc.next();
		
		System.out.println("Enter your e-mail:");
		
		String Email = sc.next();
		
		System.out.println("Enter your Password:");
		
		String Password = sc.next();
		
		Student	s = new Student();
		s.setFirstName(FName);
		s.setLastName(LName);
		s.setEmail(Email);
		s.setPassword(Password);
		try {
			System.out.println(Dimp.registerStudent(s));
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void Login() {
		daoimp Dimp=new daoimp();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your e-mail:");
		String Email = sc.next();
		System.out.println("Enter your Password:");
		String Password = sc.next();
		
		Student s = null;
		try {
			s = Dimp.login(Password,Email);
		} catch (StudentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if(s==null) {
			System.out.println("User Dose Not Exist Please Check Your Email Or Password");
		}
		else {
			int useType=s.getAddmintStatus();
			
			if(useType==0) {
				studentQuary();
			}else {
				adminQuary();
			}
			
		}
		
	}
		
	public static void studentQuary() {
		
	}
	
	
	public static void adminQuary() {
		
	}

}
