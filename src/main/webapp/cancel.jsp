<%@page import="CMS.OTP" %>
<%@page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		try{
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/CMS" , "root", "2cyHur5z*$*");
			Statement st = con.createStatement();
			
			String user = request.getParameter("user");
			
			String del_card = "DELETE FROM CARD WHERE USER ='"+user+"';";
			int execute = st.executeUpdate(del_card);
			response.sendRedirect("card.jsp?user="+user);
		}catch(Exception e){
			e.printStackTrace();
		}
	%>
	<p>Your order canceled</p>
	
</body>
</html>