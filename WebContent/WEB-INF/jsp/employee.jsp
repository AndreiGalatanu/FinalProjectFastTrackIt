<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SQL Employees</title>
</head>
<body>
	
	
	<table border=1 >
		<tr>
			<td>Angajati</td>
		</tr>
	</table>
	<br>
	<br>
	<ul >  
	<c:forEach items="${model.employee}" var="e">
	<tr>
		<li><c:out value="${e.id }" /></li>
		<li><c:out value="${e.nume }"/>-</li>
		<li> href="./detalii/${e.id }">Detalii</li>
		</tr>
		
		
	</c:forEach>
	</ul>
	
	
	
	
	
</body>
</html>