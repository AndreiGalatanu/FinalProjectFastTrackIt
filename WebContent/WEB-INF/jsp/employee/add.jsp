<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adauga Angajat</title>
</head>
<body>
Adauga angajat 
<br/>
<br/>

<form:form action="./addEmployee.htm" commandName="employeeForm" method="post">
Id:<form:input path="id"/>
<br />
Nume:
Prenume:
Functie:
Data Nastere:
Data Angajare:
Telefon:
Email:
Sex:

 



</form:form>

</body>
</html>