package net.java.register.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import net.java.register.model.Student1;

public class Student1Dao {
	
	public int registerStudent(Student1 student) throws ClassNotFoundException{
		
		String insert_SQL = "INSERT INTO student" + "(first_name,last_name,father_name,mother_name,email,date_of_birth,mobile,gender,country) VALUES" 
		+"(?,?,?,?,?,?,?,?,?);";
		
		int result=0;
		
		 Class.forName("com.mysql.jdbc.Driver");
		 
		 try (Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "7653853390");
				 PreparedStatement preparedStatement = connection.prepareStatement(insert_SQL)) {
			 
		        preparedStatement.setString(1, student.getFirstName());
	            preparedStatement.setString(2, student.getLastName());
	            preparedStatement.setString(3, student.getFatherName());
	            preparedStatement.setString(4, student.getMotherName());
	            preparedStatement.setString(5, student.getEmail());
	            preparedStatement.setString(6, student.getDob());
	            preparedStatement.setString(7, student.getMob());
	            preparedStatement.setString(8, student.getGender());
	            preparedStatement.setString(9, student.getCountry());
	            
	            System.out.println(preparedStatement);
	            result=preparedStatement.executeUpdate();
	                 
		 } catch (SQLException e) {
			 
			 e.printStackTrace();
		 }
		
		return result;
		
	}

}
