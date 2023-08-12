package CMS;

import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pos = request.getParameter("position");
		String name = request.getParameter("name");
		String pwd = request.getParameter("password");
		
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/CMS" , "root", "2cyHur5z*$*");
			Statement st = con.createStatement();
			
			if(pos.equals("Faculty")) {
				String query = "SELECT * FROM FACULTY_LOGIN WHERE USER = '" +name + "' AND PASSWORD = '"+pwd+"';";
				System.out.println(query);
				ResultSet result = st.executeQuery(query); 
				
				if(result.next()) {
					if(result.getString("USER").equals(name) && result.getString("PASSWORD").equals(pwd)) {
						session.setAttribute("uname", name);
						//System.out.println(name);
						response.sendRedirect("faculty.jsp");
					}	
				}else {
					out.println("                                      Sorry! Wrong user name and password");
					RequestDispatcher dispatch = request.getRequestDispatcher("login.jsp");
					dispatch.include(request, response);
				}
			}else if(pos.equals("student")){
				String query = "SELECT * FROM STUDENT_LOGIN WHERE USER = '" +name + "' AND PASSWORD = '"+pwd+"';";
				System.out.println(query);
				ResultSet result = st.executeQuery(query); 
				
				if(result.next()) {
					if(result.getString("USER").equals(name) && result.getString("PASSWORD").equals(pwd)) {
						session.setAttribute("uname", name);
						//System.out.println(name);
						response.sendRedirect("student.jsp");
					}	
				}else {
					out.println("                                      Sorry! Wrong user name and password");
					RequestDispatcher dispatch = request.getRequestDispatcher("login.jsp");
					dispatch.include(request, response);
				}	
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
