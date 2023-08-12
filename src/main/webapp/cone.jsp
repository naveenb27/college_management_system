<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cone</title>
    <link rel="stylesheet" href="cone.css">
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
    <div class="form">
        <form action="cone" method="post">
        <input name="username" type="hidden" value="<%=session.getAttribute("uname") %>">
        
            <div class="img">
                <img src="chocobar.webp" alt="Italian Trulli" width="150px" height="150px">
            </div>
            <br>
            
            <label>Name    : Cone</label>
            <br>
            <br>
            <label>Price   : 25</label>
            <br>
            <label>Quantity:</label>
            <input value="1" name="price">
            <br>
            <div class="button">
                <input type="submit" name="submit" value="Add to card">
        
                <input type="submit" name="submit" value="Order"> 
            </div>
        </form>
    </div>
</body>
</html>