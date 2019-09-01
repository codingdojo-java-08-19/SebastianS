<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ninja Gold Game</title>
</head>
<body>
<h1>Your Gold: <c:out value="${gold }"/></h1>
<div>
	<h2>Farm</h2>
	<p>(earns 10-20 gold)</p>
	<form method="POST" action="/process">
		<input type="hidden" name="location" value="farm">
		<button>Find Gold!</button>
	</form>
</div>
<div>
	<h2>Cave</h2>
	<p>(earns 5-10 gold)</p>
	<form method="POST" action="/process">
		<input type="hidden" name="location" value="cave">
		<button>Find Gold!</button>
	</form>
</div>
<div>
	<h2>House</h2>
	<p>(earns 2-5 gold)</p>
	<form method="POST" action="/process">
		<input type="hidden" name="location" value="house">
		<button>Find Gold!</button>
	</form>
</div>
<div>
	<h2>Casino!</h2>
	<p>(earns/takes 0-50 gold)</p>
	<form method="POST" action="/process">
		<input type="hidden" name="location" value="casino">
		<button>Find Gold!</button>
	</form>
</div>
<h2>Activities:</h2>
<c:forEach var="comment" items="${comments}">
	<h4><c:out value="${comment }"></c:out></h4>
</c:forEach>
</body>
</html>