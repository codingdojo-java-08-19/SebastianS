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
<h1>Submitted Info</h1>
<ul>
	<li>Name: <c:out value="${name}"/></li>
	<li>Dojo Location:  <c:out value="${location}"/></li>
	<li>Favorite Language:  <c:out value="${fav}"/></li>
	<li>Comment: <c:out value="${comment}"/></li>
</ul>
<form action="/" method="GET">
	<button>Go Back</button>
</form>
</body>
</html>