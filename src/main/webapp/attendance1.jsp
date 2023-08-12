<%@page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Attendance</title>
    <link rel="stylesheet" href="attend.css">
</head>
<body>
	<style>
	h1{
		text-align: center;
	}
	</style>
	

    <div class="form">
        <form action="attendance1" method="get">
        	<input type="hidden" name="year" value="<%= session.getAttribute("year")%>">
        	<input type="hidden" name="cls" value="<%= session.getAttribute("cls")%>">
				
				
			<h1>ATTENDANCE</h1>
			<%
			try {
				
				String year = request.getParameter("year");
				String cls = request.getParameter("cls");
				
				Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/CMS" , "root", "2cyHur5z*$*");
				
				Statement st = con.createStatement();
				String query;
				if(session.getAttribute("year").equals("I")){
					if(session.getAttribute("cls").equals("aids")) {
						query = "SELECT * FROM ai_1";
						ResultSet result = st.executeQuery(query);
				%>
				
				
				<table>
					<th>ROLL NUMBER</th>
					<th>NAME</th>
					<th>ATTENDANCE</th>
					<th></th>
				<%
						while(result.next()) {
				%>
				
				
				<tr>
					<input type="hidden" name=roll value="<%= result.getString(1)%>">
					<td><%=result.getString(2) %></td>
					<td><%=result.getString(1) %></td>
					<td><a href="attendance1?year=<%= session.getAttribute("year")%>&cls=<%=session.getAttribute("cls") %>&roll=<%=result.getString(1) %>&attendance=present">Present</a></td>
					<td><a href="attendance1?year=<%= session.getAttribute("year")%>&cls=<%=session.getAttribute("cls") %>&roll=<%=result.getString(1) %>&attendance=absent">Absent</a>
					</td>
				</tr>
				<br>
				<% 		
				
						}
				%>
				</table>
			<%
					}
				}else if(session.getAttribute("year").equals("II")){
					if(session.getAttribute("cls").equals("aids")) {
						query = "SELECT * FROM ai_2";
						ResultSet result = st.executeQuery(query);
			%>
						<table>
							<th>ROLL NUMBER</th>
							<th>NAME</th>
							<th>ATTENDANCE</th>
							<th></th>
				<%
								
						while(result.next()) {
				%>
				
				
				<tr>
					<input type="hidden" name=roll value="<%= result.getString(1)%>">
					<td><%=result.getString(2) %></td>
					<td><%=result.getString(1) %></td>
					<td><a href="attendance1?year=<%=  session.getAttribute("year")%>&cls=<%=session.getAttribute("cls") %>&roll=<%=result.getString(1) %>&attendance=present">Present</a></td>
					<td><a href="attendance1?year=<%=  session.getAttribute("year")%>&cls=<%=session.getAttribute("cls") %>&roll=<%=result.getString(1) %>&attendance=absent">Absent</a>
					</td>
				</tr>
				<br>
				
				<% 		
						}
				%>
					</table>
				<%
					}
				}
			
			}catch(Exception e) {
				e.printStackTrace();
			}
			%>
            
        </form>
    </div>