<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Survey Index</title>
</head>
<body>
<form method="POST" action="/process">
	<label>Your Name:<input type="text" name="name"></label>
	<label>Dojo Location:
		<select name="location">
			<option value="chicago">Chicago</option>
			<option value="newyork">New York</option>
			<option value="dc">DC</option>
		</select>
	</label>
	<label>Favorite Language:
		<select name="fav">
			<option value="python">Python</option>
			<option value="java">Java</option>
			<option value="c">C</option>
		</select>
	</label>
	<label>Comment (optional):<input type="text" name="comment"></label>
	<button>Submit</button>
</form>
</body>
</html>