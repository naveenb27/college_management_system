<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Reminder</title>
    <link rel="stylesheet" href="userr.css">
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
    <form action="reminder" method="post" >
        <h1>Reminder</h1>
        <label>Notice: </label>
        <select name="notice">
            <option value="post">Post</option>
            <option value="Delete">Delete</option>
        </select>
        <br>
        <label>Class</label>
        <select name="year">
            <option value="I">AI-I</option>
            <option value="II">AI-II</option>
        </select>
        <br>
        <label>Notice No: </label>
        <input type="text" name="no">
        <br>
        <label>Notice</label>
        <textarea cols="25" name="information" ></textarea>
        <br>
        <input type="submit" name="submit" value="Submit">
    </form>
</div>

</body>
</html>
