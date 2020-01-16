<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
index of jsp
Hello from index.JSP
	<br />
	<br /> 
	Bine ai venit <c:out value="${model.name}" />
	<br /> Ora curenta <c:out value="${model.time}" />
	<br />
</body>
</html>