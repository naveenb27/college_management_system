<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Log in</title>
    <link rel="stylesheet" href="log.css">
</head>
<body>    
    <nav>  
        <div class="nav-link">
            <ul>
                <li><a href = "index.jsp">Home</a></li>
                <li><a href ="">Blog</a></li>
                <li><a href ="">Admission</a></li>
                <li><a href ="">About</a></li>
                <li><a href ="login.jsp">Log in</a></li>
            </ul>
        </div>
    </nav>
    <div class="login">   
        <form class="form" action="login" method="post">
            <h1>LOGIN</h1> 
            <label>POSITION: </label>
            <select name="position">
                <option value="student">Student</option>
                <option value="Faculty">Faculty</option>
            </select>
            <br>
            
            <label>USER NAME: </label>
            <input name="name" type="text" >
            <br>
            
            <label>PASSWORD: </label>
            <input name="password" type="password">
            <br>
            <div class="button">
                <input name="submit" type="submit">
            </div>
        </form>
    </div>
</body>
</html>