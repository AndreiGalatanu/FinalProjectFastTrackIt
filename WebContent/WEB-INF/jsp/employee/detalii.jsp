<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Detalii Angajat</title>
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

<h2>Detalii angajat</h2>
<br>
<br>



<table  >
		<tr>
			<td >ID</td>
			<td>< c:out value="${model.employee.id }" /></td>
		</tr>
		<tr>
			<td>Nume</td>
			<td>< c:out value="${model.employee.nume }" /></td>
		</tr>
		<tr>
			<td>Prenume</td>
			<td>< c:out value="${model.employee.prenume }" /></td>
		</tr>
		<tr>
			<td>Functie</td>
			<td>< c:out value="${model.employee.functie }" /></td>
		</tr>
		<tr>
			<td>Data Nastere</td>
			<td>< c:out value="${model.employee.dataNastere }" /></td>
		</tr>
		<tr>
			<td>Data Angajare</td>
			<td>< c:out value="${model.employee.dataAngajare }" /></td>
		</tr>
		<tr>
			<td>Sex</td>
			<td>< c:out value="${model.employee.sex }" /></td>
		</tr>
		<tr>
			<td>Telefon</td>
			<td>< c:out value="${model.employee.nrtelefon }" /></td>
		</tr>
		<tr>
			<td>Email</td>
			<td>< c:out value="${model.employee.email }" /></td>
		</tr>
		
		<tr>
		<td id="button"><input type="button" value="Edit"
					class="button_active" onclick="location.href='${pageContext.request.contextPath}/editEmployee/${model.employee.id }';" /></td>
		
		</tr>
		
	</table>
	

</body>
</html>