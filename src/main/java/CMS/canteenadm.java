package CMS;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import java.sql.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/admin")
public class canteenadm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user");
		String pwd = request.getParameter("password");
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/CMS" , "root", "2cyHur5z*$*");
			
			
			Statement st = con.createStatement();
			String query = "SELECT * FROM CANTEEN_LOGIN WHERE USER  = '"+user+"' AND PASSWORD = '"+pwd+"'";
			System.out.println(query);
			ResultSet result = st.executeQuery(query);
			
			if(result.next()) {
				response.sendRedirect("orders.jsp");
			}else {
				out.print("Wrong user name & Password");
				RequestDispatcher dispatch = request.getRequestDispatcher("canteenadm.jsp");
				dispatch.include(request, response);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
