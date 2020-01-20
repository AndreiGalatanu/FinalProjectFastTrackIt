<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editeaza <c:out value="${model.employee.nume }"></c:out> </title>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 50%;
	margin-left: 25%;
	margin-right:25%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}
tr:nth-child(even) {
	background-color: #dddddd;
}
h2{
text-align: center;
}
</style>
</head>
<body>

<div>Editeaza <c:out value="${model.employee.nume }" /></div>

<form:form action="" commandName="employeeForm" method="POST" />


	<table  >
		<tr>
			<td>Nume</td>
			<td><form:input path="nume" /></td>
		</tr>
		<tr>
			<td>Prenume</td>
			<td><form:input path="prenume" /></td>
		</tr>
		<tr>
			<td>Functie</td>
			<td><form:input path="functie" /></td>
		</tr>
		<tr>
			<td>Data Nastere</td>
			<td><form:input path="dataNastere" /></td>
		</tr>
		<tr>
			<td>Data Angajare</td>
			<td><form:input path="dataAngajare" /></td>
		</tr>
		<tr>
			<td>Sex</td>
			<td><form:input path="sex" /></td>
		</tr>
		<tr>
			<td>Telefon</td>
			<td><form:input path="nrtelefon" /></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><form:input path="email" /></td>
		</tr>
		<tr>
		<td><input type="submit" value="Salveaza" /></td>
		</tr>
	</table>

</body>
</html>