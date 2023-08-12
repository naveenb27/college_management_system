<%@page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reminder</title>
<link rel="stylesheet" href="card.css">
</head>
<body>
<%
	try{
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/CMS" , "root", "2cyHur5z*$*");
		Statement st = con.createStatement();
		
		
		String query = "SELECT CLASS FROM STUDENT_LOGIN WHERE USER = '"+ session.getAttribute("uname") +"'";
		System.out.println(query);
		ResultSet result = st.executeQuery(query);
		result.next();
		System.out.println(result.getString("CLASS"));
		String clas = result.getString("CLASS");
		if(clas.equals("AI_1")){
			
		}else if(clas.equals("AI_2")){
			String qry = "SELECT * FROM NOTICE WHERE CLASS = 'II'";
			ResultSet rst = st.executeQuery(qry);
	%>

			<table>
				<tr>
					<th>NOTICE NO</th>
					<th>NOTICE</th>
				</tr>
		<% 	
			while(rst.next()){
		%>
			
				<tr>
					<td><%= rst.getString("NOTICE_NUMBER") %></td>
					<td><%= rst.getString("NOTICE") %></td>
				</tr>
				<%
			}
		%>
		</table>
		<% 
		}
	}catch(Exception e){
		e.printStackTrace();
	}

%>
</body>
</html>