<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login</h1>
<form action="Login" method="get">
<p id = "demo">  hello</p>
<input type="text" id= "usernm" onchange ="onchange()" placeholder="enter Username" name="username">

<input type="password" placeholder="password" name= "passbox"> 


<input type="submit" value="login">
</form>
<script type="text/javascript">
function myFunction() {
	document.getElementById("demo").innerHTML = "Hello World";
}

</script>
<button onclick="myFunction()">Click me</button>
</body>
</html>