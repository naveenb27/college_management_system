<%@page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>orders</title>
<link rel="stylesheet" href="card.css">
</head>
<body>
	<%
		try{
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/CMS" , "root", "2cyHur5z*$*");
			Statement st = con.createStatement();
			

			String query = "Select * from ORD";
			
			ResultSet result = st.executeQuery(query);
			
			%>
			<table>
				<tr>
					<th>USER</th>
					<th>ITEMS</th>
					<th>PRICE</th>
					<th>TOKEN NO</th>
					<th>STATUS</th>
				</tr>
			<%
			
			while(result.next()){
		%>
			
				<tr>
					<td><%= result.getString("USER") %></td>
					<td><%= result.getString("ITEMS") %></td>
					<td><%= result.getInt("PRICE") %></td>
					<td><%= result.getString("TOKEN") %></td>
					<td><a href="delivered.jsp?token=<%= result.getString("TOKEN") %>">DELIVERED</a></td>
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