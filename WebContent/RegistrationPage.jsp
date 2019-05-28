<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body{background-color: pink;}


.city {
  width: 200px;
  padding: 10px;
}

#pid
{
	width: 300px;
	color: red;
} 

</style>

</head>
<body>
<p>Register Here</p>
<form action="Registration" method="get">
<p id= "pid">User name  <input class= "city" type="text" name = "uname" ><br><br>
<p id = "pid">Mobile No <input class ="city" type="text" name= "mobno" ><br><br>
<p id = "pid">password <input class= "city" type="password" name = "password" ><br><br>
<p id = "pid">Email <input class ="city" type="text" name= "email" ><br><br>
<p id = "pid">DOB <input class= "city" type="date" name= "dob" ><br><br>

<input type="submit" value="Register">
</form>
</body>
</html>