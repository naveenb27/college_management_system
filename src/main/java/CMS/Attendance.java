package CMS;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.*;

@WebServlet("/attendance")
public class Attendance extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cls = request.getParameter("department");
		String year = request.getParameter("year");
		HttpSession session = request.getSession();
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/CMS" , "root", "2cyHur5z*$*");
			
			
			if(cls.equals("aids")) {
				if(year.equals("I")){
					session.setAttribute("year", year);
					session.setAttribute("cls", cls);
					
					response.sendRedirect("attendance1.jsp");
				}else if(year.equals("II")) {
					session.setAttribute("year", year);
					session.setAttribute("cls", cls);
					
					response.sendRedirect("attendance1.jsp");
				}else if(year.equals("III")) {
					
				}else if(year.equals("IV")) {
					
				}
			}else if(cls.equals("csbs")) {
				if(year.equals("I")) {
					
				}else if(year.equals("II")) {
					
				}else if(year.equals("III")) {
					
				}else if(year.equals("IV")) {
					
				}
			}else if(cls.equals("it")) {
				if(year.equals("I")) {
					
				}else if(year.equals("II")) {
					
				}else if(year.equals("III")) {
					
				}else if(year.equals("IV")) {
					
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
