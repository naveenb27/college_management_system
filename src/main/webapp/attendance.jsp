<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Attendance</title>
    <link rel="stylesheet" href="canteenadm.css">
</head>
<body>
    <div class="form">
    	<form action="attendance" method="post">
        <h1><u>CLASS</u></h1>
        
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
    </div>
</body>
</html>