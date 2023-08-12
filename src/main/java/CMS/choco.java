package CMS;

import jakarta.servlet.ServletException;
import java.sql.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/choco")
public class choco extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    //public choco() {
      //  super();
        // TODO Auto-generated constructor stub
  //  }
	//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	//}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String item = "Chocobar";
		String quantity = request.getParameter("price");
		String uname = request.getParameter("username");
		String option = request.getParameter("submit");
		
		int quant = Integer.parseInt(quantity);
		int price = 10;
		int total = price*quant;
		
		System.out.println(uname);
		System.out.println(total);
		
		PrintWriter out= response.getWriter();

		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/CMS" , "root", "2cyHur5z*$*");
			
			if(option.equals("Add to card")) {
				Statement st = con.createStatement();
				String queryy = "Select * from card where user='"+uname+"';";
				System.out.println(queryy);
				ResultSet result = st.executeQuery(queryy);
				if(result.next()) {
					
					String prev =result.getString("ITEMS");
					int tot = result.getInt("PRICE");
					
					int update_price = tot+total;
					
					String items = prev+" | "+"Chocobar("+quantity+")";
					String query="UPDATE CARD SET ITEMS='"+ items +"', PRICE="+ update_price + " WHERE USER='"+uname+"'";
					int row = st.executeUpdate(query);
					response.sendRedirect("canteen.jsp");
				}else {
					String query ="Insert into card values('"+uname+"','"+item+"("+ quantity + ")"+"',"+total+");";
					int row = st.executeUpdate(query);
					response.sendRedirect("canteen.jsp");
				}
				
			}else {
				OTP otp = new OTP();
				String token =  otp.otp();
				String query = "Insert into ORD values('"+uname+"','"+item+ "("+ quantity + ")"+"',"+total+",'"+ token+ "')";
				System.out.println(query);
				Statement st = con.createStatement();
				int row = st.executeUpdate(query);
				out.println("                                      Your order is confirmed. token number is: "+token);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
