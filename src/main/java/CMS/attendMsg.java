package CMS;

import java.io.*;
import java.sql.*;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.*;
import java.util.Date;
import java.time.LocalDateTime;

@WebServlet("/attendance1")
public class attendMsg extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
	//	storeAttendance at = new storeAttendance();
		String year = request.getParameter("year");
		String cls = request.getParameter("cls");
		String roll = request.getParameter("roll");
		String submit = request.getParameter("submit");
		
		SendMsg send = new SendMsg();

		System.out.println(year);
		System.out.println(cls);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/CMS" , "root", "2cyHur5z*$*");
			Statement st = con.createStatement();
			
			
			
			
			File attendance = new File("C:\\Users\\ELCOT\\Desktop\\Attendance\\"+cls+"-"+year+"-"+java.time.LocalDate.now()+".txt");
			if(attendance.createNewFile()) {
				System.out.println("File :  "+attendance.getName());
			}
			String data ="";
			Scanner read = new Scanner(attendance);
			while(read.hasNextLine()) {
				data += read.nextLine() +"\n";
			}
			
			FileWriter write = new FileWriter("C:\\Users\\ELCOT\\Desktop\\Attendance\\"+cls+"-"+year+"-"+java.time.LocalDate.now()+".txt");
			
			String attend = request.getParameter("attendance");
			write.write(data);
			write.write(roll+ "  " + attend);
			write.close();
			if(attend.equals("present")) {
				response.sendRedirect("attendance1.jsp");
			}else if(attend.equals("absent")) {
				System.out.println(roll);
				String query = "select phone from AI_2 where NAME='"+roll+"'";
				
				System.out.println(query);
				Statement statement = con.createStatement();
				ResultSet result = statement.executeQuery(query);
				
				result.next();
				
				String phone = result.getString("phone");
				send.sendMsg(phone, "Hello sir! Your son is absent today");
				response.sendRedirect("attendance1.jsp");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
