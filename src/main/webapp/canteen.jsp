<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="can.css">
    <title>Order the food</title>
</head>
<body>
	
    <nav>
        <div class="nav-link">
            <ul>
                <li><a href = "index.jsp">Home</a></li>
                <li><a href ="">Blog</a></li>
                <li><a href ="">Admission</a></li>
                <li><a href ="">About</a></li>
            </ul>
        </div>
    </nav>
    <br>
     <nav>
        <div class="nav-link">
            <ul>
                <li><a href = "card.jsp?user=<%= session.getAttribute("uname")%>"><b>CARD+</b></a></li>
               	<li><a href = "ordered.jsp?user=<%= session.getAttribute("uname")%>"><b>ORDERED</b></a></li>
            </ul>
        </div>
    </nav>
    <h1>STR CANTEEN</h1>
    <div class="icecream">
        <div class="choco">
            <button type="button" onclick="window.location.href='choco.jsp'"></button>
        </div>    
        <div class="cone">
            <button type="button" onclick="window.location.href='cone.jsp'"></button>
        </div> 
        <div class="kulfi">
            <button type="button" onclick="window.location.href='kulfi.jsp'"></button>
        </div> 
        <div class="cup">
            <button type="button" onclick="window.location.href='cup.jsp'"></button>
        </div> 
        <div class="Rolled">
            <button type="button" onclick="window.location.href='rolled.jsp'"></button>
        </div> 
    </div>

    <div class="lunch">
        <div class="rotti">
            <button type="button" onclick="window.location.href='rotti.jsp'"></button>
        </div>
        <div class="dosa">
            <button type="button" onclick="window.location.href='dosa.jsp'"></button>
        </div>
        <div class="biriyani">
            <button type="button" onclick="window.location.href='biriyani.jsp'"></button>
        </div>
        <div class="noodles">
            <button type="button" onclick="window.location.href='noodles.jsp'"></button>
        </div>
        <div class="curd">
            <button type="button" onclick="window.location.href='curd.jsp'"></button>
        </div>
    </div>
    
    
</body>
</html>