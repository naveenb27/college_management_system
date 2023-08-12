package CMS;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/user")
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user");
		String name = request.getParameter("name");
		String roll = request.getParameter("roll");
		String phone = request.getParameter("phone");
		String mail = request.getParameter("mail");
		String year = request.getParameter("year");
		String dept = request.getParameter("department");
		
		try {
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/CMS" , "root", "2cyHur5z*$*");
		Statement st = con.createStatement();
		String query;
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		if(user.equals("add")) {
			if(dept.equals("aids")) {
				if(year.equals("I")) {
					query="INSERT INTO AI_1 VALUES('"+ name +"', '"+roll+"', '"+ phone + "', '"+ mail+"');";
					int row = st.executeUpdate(query);
				}else if(year.equals("II")) {
					query="INSERT INTO AI_2 VALUES('"+ name +"', '"+roll+"', '"+ phone + "', '"+ mail+"');";
					int row = st.executeUpdate(query);
				}else if(year.equals("III")) {
					query="INSERT INTO AI_3 VALUES('"+ name +"', '"+roll+"', '"+ phone + "', '"+ mail+"');";
					int row = st.executeUpdate(query);
				}else if(year.equals("IV")) {
					query="INSERT INTO AI_4 VALUES('"+ name +"', '"+roll+"', '"+ phone + "', '"+ mail+"');";
					int row = st.executeUpdate(query);
				}
			}else if(dept.equals("it")) {
				if(year.equals("I")) {
					query="INSERT INTO IT_1 VALUES('"+ name +"', '"+roll+"', '"+ phone + "', '"+ mail+"');";
					int row = st.executeUpdate(query);
				}else if(year.equals("II")) {
					query="INSERT INTO IT_2 VALUES('"+ name +"', '"+roll+"', '"+ phone + "', '"+ mail+"');";
					int row = st.executeUpdate(query);
				}else if(year.equals("III")) {
					query="INSERT INTO IT_3 VALUES('"+ name +"', '"+roll+"', '"+ phone + "', '"+ mail+"');";
					int row = st.executeUpdate(query);
				}else if(year.equals("IV")) {
					query="INSERT INTO IT_4 VALUES('"+ name +"', '"+roll+"', '"+ phone + "', '"+ mail+"');";
					int row = st.executeUpdate(query);
				}
			}else if(dept.equals("csbs")) {
				if(year.equals("I")) {
					query="INSERT INTO CSBS_1 VALUES('"+ name +"', '"+roll+"', '"+ phone + "', '"+ mail+"');";
					int row = st.executeUpdate(query);
				}else if(year.equals("II")) {
					query="INSERT INTO CSBS_2 VALUES('"+ name +"', '"+roll+"', '"+ phone + "', '"+ mail+"');";
					int row = st.executeUpdate(query);
				}else if(year.equals("III")) {
					query="INSERT INTO CSBS_3 VALUES('"+ name +"', '"+roll+"', '"+ phone + "', '"+ mail+"');";
					int row = st.executeUpdate(query);
				}else if(year.equals("IV")) {
					query="INSERT INTO CSBS_4 VALUES('"+ name +"', '"+roll+"', '"+ phone + "', '"+ mail+"');";
					int row = st.executeUpdate(query);
				}
			}
		}else if(user.equals("delete")) {
			if(dept.equals("aids")) {
				if(year.equals("I")) {
					query="DELETE FROM AI_1 WHERE ROLL='"+ roll +"';";
					int row = st.executeUpdate(query);
				}else if(year.equals("II")) {
					query="DELETE FROM AI_2 WHERE ROLL='"+ roll +"';";
					int row = st.executeUpdate(query);
				}else if(year.equals("III")) {
					query="DELETE FROM AI_3 WHERE ROLL='"+ roll +"';";
					int row = st.executeUpdate(query);
				}else if(year.equals("IV")) {
					query="DELETE FROM AI_4 WHERE ROLL='"+ roll +"';";
					int row = st.executeUpdate(query);
				}
			}
			}else if(dept.equals("it")) {
				if(year.equals("I")) {
					query="DELETE FROM IT_1 WHERE ROLL='"+ roll +"';";
					int row = st.executeUpdate(query);
				}else if(year.equals("II")) {
					query="DELETE FROM IT_2 WHERE ROLL='"+ roll +"';";
					int row = st.executeUpdate(query);
				}else if(year.equals("III")) {
					query="DELETE FROM IT_3 WHERE ROLL='"+ roll +"';";
					int row = st.executeUpdate(query);
				}else if(year.equals("IV")) {
					query="DELETE FROM IT_4 WHERE ROLL='"+ roll +"';";
					int row = st.executeUpdate(query);
				}
			}else if(dept.equals("csbs")) {
				if(year.equals("I")) {
					query="DELETE FROM CSBS_1 WHERE ROLL='"+ roll +"';";
					int row = st.executeUpdate(query);
				}else if(year.equals("II")) {
					query="DELETE FROM CSBS_2 WHERE ROLL='"+ roll +"';";
					int row = st.executeUpdate(query);
				}else if(year.equals("III")) {
					query="DELETE FROM CSBS_3 WHERE ROLL='"+ roll +"';";
					int row = st.executeUpdate(query);
				}else if(year.equals("IV")) {
					query="DELETE FROM CSBS_4 WHERE ROLL='"+ roll +"';";
					int row = st.executeUpdate(query);
				}
			}
			
		if(user.equals("delete")) {
			RequestDispatcher dispatch = request.getRequestDispatcher("user.jsp");
			out.println("						The student's data successfully deleted");
			dispatch.include(request, response);
		}else if(user.equals("add")) {
			RequestDispatcher dispatch = request.getRequestDispatcher("user.jsp");
			out.println("						The student's data successfully added");
			dispatch.include(request, response);
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
