<%@page import="CMS.OTP" %>
<%@page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order</title>
</head>
<body>
	<p>Your order confirmed</p>
	<%
		try{
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/CMS" , "root", "2cyHur5z*$*");
			Statement st = con.createStatement();
			
			String user = request.getParameter("user");
			OTP otp = new OTP();
			
			String token = otp.otp();
			
			String quer = "Select * from card where user = '"+user+"'";
			ResultSet result = st.executeQuery(quer);
			
			String items="";
			int price=0;
			while(result.next()){
				 items += result.getString("ITEMS");
				 price += result.getInt("PRICE");
			}
			String query = "Insert into ORD values('"+user+"','"+items+ "',"+price+",'"+token+ "')";
			int row = st.executeUpdate(query);
			
			String del_card = "DELETE FROM CARD WHERE USER ='"+user+"';";
			int execute = st.executeUpdate(del_card);
%>
<br>
			<p>OTP: <%=token %></p>
<%
		}catch(Exception e){
			e.printStackTrace();
		}
	%>
</body>
</html>