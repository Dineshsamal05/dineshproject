package net.java.register.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.java.register.Dao.Student1Dao;
import net.java.register.model.Student1;

/**
 * Servlet implementation class Student1Servlet
 */
@WebServlet("/Student1Servlet")
public class Student1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Student1Dao studentDao = new Student1Dao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Student1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/studentregister.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String fatherName = request.getParameter("fatherName");
		String motherName = request.getParameter("motherName");
		String email = request.getParameter("email");
		String dob = request.getParameter("dob");
		String mob = request.getParameter("mob");
		String gender = request.getParameter("gender");
		String country = request.getParameter("country");
		

		Student1 student = new Student1();
		
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setFatherName(fatherName);
		student.setMotherName(motherName);
		student.setEmail(email);
		student.setDob(dob);
		student.setMob(mob);
		student.setGender(gender);
		student.setCountry(country);

		try {
			studentDao.registerStudent(student);
			
		   
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();

		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/alert.jsp");
	    dispatcher.forward(request, response);
		
		
	}

}
