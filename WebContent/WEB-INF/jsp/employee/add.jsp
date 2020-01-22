<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>WorkPlan Register</title>

<!-- Custom fonts for this template-->
<link
	href="${pageContext.request.contextPath}/resources/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link
	href="${pageContext.request.contextPath}/resources/css/sb-admin-2.min.css"
	rel="stylesheet">
</style>
</head>
<body>

	<div class="container">

		<div class="card o-hidden border-0 shadow-lg my-5">
			<div class="card-body p-0">
				<!-- Nested Row within Card Body -->

				<div class="row">
					<div class="col-lg-7">
						<div class="p-5">
							<div class="text-center">
								<h1 class="h4 text-gray-900 mb-4">Adauga Angajat</h1>
							</div>
							<form:form class="form" action="./addEmployee.htm" commandName="employeeForm"
								method="post">
								<div class="form-group row">
									<div class="col-sm-6 mb-3 mb-sm-0">
										<input type="text" class="form-control form-control-user"
											id="nume" placeholder="Nume">
									</div>
									<div class="col-sm-6">
										<input type="text" class="form-control form-control-user"
											id="prenume" placeholder="Prenume">
									</div>
								</div>
								<div class="form-group">
									<input type="text" class="form-control form-control-user"
										id="email" placeholder="Email Address">
								</div>
								<div class="form-group row">
									<div class="col-sm-6 mb-3 mb-sm-0">
										<input type="text" class="form-control form-control-user"
											id="functie" placeholder="Functie">
									</div>
									<div class="col-sm-6">
										<input type="password" class="form-control form-control-user"
											id="exampleRepeatPassword" placeholder="Data Angajare">
									</div>
								</div>
								<div class="form-group row">
									<div class="col-sm-6 mb-3 mb-sm-0">
										<input type="text" class="form-control form-control-user"
											id="functie" placeholder="Data Nastere">
									</div>
									<div class="col-sm-6">
										<input type="text" class="form-control form-control-user"
											id="exampleRepeatPassword" placeholder="Sex">
									</div>



								</div>
								<a type="submit" class="btn btn-primary btn-user btn-block" ><span
														class="icon text-white-50"> <i
															class="fas fa-info-circle"></i>
															</span><span class="text">Adauga</span>
									 </a>
								<hr>

							</form:form>
						
							
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

	
	


	<h2>Adauga angajat</h2>
	<br />
	<br />

	<form:form action="./addEmployee.htm" commandName="employeeForm"
		method="post">



		<table>

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



	</form:form>

	<!-- Bootstrap core JavaScript-->
	<script
		src="${pageContext.request.contextPath}/resources/vendor/jquery/jquery.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script
		src="${pageContext.request.contextPath}/resources/vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script
		src="${pageContext.request.contextPath}/resources/js/sb-admin-2.min.js"></script>

</body>
</html>