<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Detalii Angajat</title>
<script src="https://kit.fontawesome.com/69b143f616.js" crossorigin="anonymous"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
 
</head>
<body>

	<h2>Adauga angajat</h2>
	<br>
	<br>

      <tr>
<c:forEach items="${model.employee}" var="e">
<tr>
 <td><c:out value="${e.id }" /></td>
	<td><c:outalue="${e.nume }" /></td>
				<td><c:out value="${e.prenume }" /></td>
				<td><c:out value="${e.functie }" /></td>
 <td><a href="./branduriEdit/${b.id}" class="far fa-edit"></a>
      |     <a href="deleteBranduri/${b.id}" onclick="return confirm('Sunteti sigur ca doriti sa stergeti aceasta intrare?');"  class="fa fa-trash-o"></a></td>
 </tr>
 <br/>
</c:forEach>
      </tr>
    </tbody>
  </table>
</div>
	<form:form action="./addEmployee.htm" commandName="employeeForm"
		method="post">

		ID:<form:input path="id" />
		<br>
		
		Nume:<form:input path="nume" />
		<br>

		Prenume:<form:input path="prenume" />
		<br>

		Functie:<form:input path="functie" />

		<br>
		Data nastere<form:input path="dataNastere" />

		<br>
		data angajare<form:input path="dataAngajare" />

		<br>
		sex<form:input path="sex" />
		<br>

		nr telefon<form:input path="nrtelefon" />
		<br>

		email<form:input path="email" />
		<br>

		<input type="submit" value="Adauga" />
	</form:form>
</body>
</html>

