<%@page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Card</title>
<link rel="stylesheet" href="card.css">
</head>
<body>
	
	<%
		try{
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/CMS" , "root", "2cyHur5z*$*");
			Statement st = con.createStatement();
			
			
			String query = "Select * from card where user = '"+session.getAttribute("uname")+"'";
			
			ResultSet result = st.executeQuery(query);
		%>
			<table>
				<tr>
					<th>ITEMS</th>
					<th>PRICE</th>
					<th>Order/Cancel</th>
				</tr>
		<% 	
			while(result.next()){
		%>
			
				<tr>
					<td><%= result.getString("ITEMS") %></td>
					<td><%= result.getInt("PRICE") %></td>
					<td><a href="order.jsp?user=<%= result.getString("USER") %>">order</a><br> <a href="cancel.jsp?user=<%= result.getString("USER") %>">cancel</a></td>
				</tr>
				<%
			}
		%>
		</table>
		<% 
		}catch(Exception e){
			e.printStackTrace();
		}
	%>
</body>
</html>