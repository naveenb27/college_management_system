<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>HOME | Student</title>
    <link rel="stylesheet" href="home.css">
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
    <h1>WELCOME! HAVE A GREAT DAY</h1>
    <div class="button">
        <div class="bus">
            <button onclick="window.location.href='bus.jsp'"></button>
        </div>
        <div class="canteen">
            <button onclick="window.location.href='canteen.jsp'"></button>
        </div>
        <div class="reminder">                     
            <button onclick="window.location.href='reminderstu.jsp'"></button>
        </div>
        <div class="notes">
        	<button onclick="window.location.href='notes.jsp'"></button>
        </div>
    </div>
</body>
</html>