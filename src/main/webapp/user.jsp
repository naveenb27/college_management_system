<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User</title>
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
    <form action="user" method="post">
        <h1><u>UPDATION</u></h1>
        <label>User:</label>
        <select name="user">
            <option value="add">Add</option>
            <option value="delete">Delete</option>
        </select>
        <br>

        <label>Name: </label>
        <input name="name" type="text">
        <br>

        <label>Register Number: </label>
        <input name="roll" type="text">
        <br>

		<label>Phone: </label>
        <input name="phone" type="text">
        <br>
        
        <label>E-Mail: </label>
        <input name="mail" type="email">
        <br>
        
       
        <label>Year: </label>
        <select name="year">
            <option value="I">I-Year</option>
            <option value="II">II-Year</option>
            <option value="III">III-Year</option>
            <option value="IV">IV-Year</option>
        </select>
        <br>

        <label>Department: </label>
        <select name="department">
            <option value="aids">AI & DS</option>
            <option value="csbs">CSBS</option>
            <option value="it">IT</option>
        </select>
        <br>
        <div class="button">
            <input type="submit" value="submit">
        </div>
        </form>
        <p>*For deletion register number is enough. </p>
    </div>
</body>
</html>