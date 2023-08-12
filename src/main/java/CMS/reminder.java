package CMS;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet("/reminder")
public class reminder extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String post = request.getParameter("notice");
		String clas = request.getParameter("year");
		String no = request.getParameter("no");
		String notice = request.getParameter("information");
		System.out.println(notice);
		SendMsg send = new SendMsg();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/CMS" , "root", "2cyHur5z*$*");
			
			if(post.equals("post")) {
				String query = "Insert into notice values('"+ clas +"','"+no+"','"+notice+"')";
				System.out.println(query);
				Statement st = con.createStatement();
				int execute = st.executeUpdate(query);
				
				if(clas.equals("II")) {
					String quer = "SELECT PHONE FROM AI_2";
					ResultSet result = st.executeQuery(quer);
					
					while(result.next()) {
						send.sendMsg(result.getString("PHONE"), notice);
					}
				}
				
				response.sendRedirect("reminder.jsp");
			}else if(post.equals("Delete")){
				String query = "DELETE FROM NOTICE WHERE NOTICE_NUMBER = '"+no+"';";
				System.out.println(query);
				Statement st = con.createStatement();
			
				int execute = st.executeUpdate(query);
				response.sendRedirect("reminder.jsp");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
