<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SQL Employees</title>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 50%;
	margin-left: 25%;
	margin-right: 25%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 4px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}

#button {
	width: 2px;
	text-align: center;
}

#firstTable {
	text-align: center;
}

h2 {
	text-align: center;
}

.footer {
	position: fixed;
	left: 0;
	bottom: 0;
	width: 100%;
	text-align: center;
}
</style>
</head>
<body>


	<h2>Lista Angajati</h2>
	<br>
	<br>

	<table>
		<tr>
			<th>ID</th>
			<th>Nume</th>
			<th>Prenume</th>
			<th>Functie</th>
		</tr>
		<c:forEach items="${model.employee}" var="e">
			<tr>

				<td><c:out value="${e.id}" /></td>
				<td><c:out value="${e.nume}" /></td>
				<td><c:out value="${e.prenume}" /></td>
				<td><c:out value="${e.functie}" /></td>
				<td id="button"><input type="button" value="Detalii"
					class="button_active" onclick="location.href='./detalii/${e.id}';" /></td>
			</tr>


		</c:forEach>
	</table>


	<div class="footer">

		<div><input type="button" value="Adauga"
					class="button_active" onclick="location.href='./employeeAdd.htm';" /></div>
	</div>


</body>

</html>