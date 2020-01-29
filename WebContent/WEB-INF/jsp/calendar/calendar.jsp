<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Work plan</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">


<!-- ---- Calendar css            -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">
<script>
	document.getElementsByTagName("html")[0].className += " js";
</script>
<!-- Custom fonts for this template -->
<link
	href="${pageContext.request.contextPath}/resources/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link
	href="${pageContext.request.contextPath}/resources/css/sb-admin-2.min.css"
	rel="stylesheet">

<!-- Custom styles for this page -->
<link
	href="${pageContext.request.contextPath}/resources/vendor/datatables/dataTables.bootstrap4.min.css"
	rel="stylesheet">

<style>
h1{
	text-align: center;
	left-margin: 4px;
}
</style>
</head>
<body id="page-top">

	<!-- Page Wrapper -->
	<div id="wrapper">

		<!-- Sidebar -->
		<ul
			class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
			id="accordionSidebar">

			<!-- Sidebar - Brand -->
			<a
				class="sidebar-brand d-flex align-items-center justify-content-center"
				href="${pageContext.request.contextPath}/employee.htm">
				<div class="sidebar-brand-icon rotate-n-15">
					<i class="fas fa-calendar-alt"></i>
				</div>
				<div class="sidebar-brand-text mx-3">Work Plan</div>
			</a>

			<!-- Divider -->
			<hr class="sidebar-divider my-0">

			<!-- Nav Item - Dashboard -->
			<li class="nav-item"><a class="nav-link" href="employee.htm">
					<i class="fas fa-users"></i> <span>Angajati</span>
			</a></li>

			<!-- Divider -->
			<hr class="sidebar-divider">

			<!-- Heading -->
			<div class="sidebar-heading">Interface</div>

			<!-- Nav Item - Pages Collapse Menu -->
			<li class="nav-item"><a class="nav-link collapsed" href="#"
				data-toggle="collapse" data-target="#collapseTwo"
				aria-expanded="true" aria-controls="collapseTwo"> <i
					class="fas fa-fw fa-cog"></i> <span>Components</span>
			</a>
				<div id="collapseTwo" class="collapse" aria-labelledby="headingTwo"
					data-parent="#accordionSidebar">
					<div class="bg-white py-2 collapse-inner rounded">
						<h6 class="collapse-header">Custom Components:</h6>
						<a class="collapse-item" href="buttons.html">Buttons</a> <a
							class="collapse-item" href="cards.html">Cards</a>
					</div>
				</div></li>



			<!-- Divider -->
			<hr class="sidebar-divider">

			<!-- Heading -->
			<div class="sidebar-heading">Employees Work Plan</div>



			<!-- Nav Item - Tables -->
			<li class="nav-item active"><a class="nav-link"
				href="./calendar.htm"> <i class="fas fa-fw fa-table"></i> <span>Work
						Plan</span></a></li>

			<!-- Divider -->
			<hr class="sidebar-divider d-none d-md-block">

			<!-- Sidebar Toggler (Sidebar) -->
			<div class="text-center d-none d-md-inline">
				<button class="rounded-circle border-0" id="sidebarToggle"></button>
			</div>

		</ul>
		<!-- End of Sidebar -->

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">

				<!-- Topbar -->
				<nav
					class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

					<!-- Sidebar Toggle (Topbar) -->
					<button id="sidebarToggleTop"
						class="btn btn-link d-md-none rounded-circle mr-3">
						<i class="fa fa-bars"></i>
					</button>


					<!-- Topbar Navbar -->
					<ul class="navbar-nav ml-auto">

						<!-- Nav Item - Search Dropdown (Visible Only XS) -->
						<li class="nav-item dropdown no-arrow d-sm-none"><a
							class="nav-link dropdown-toggle" href="#" id="searchDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> <i class="fas fa-search fa-fw"></i>
						</a> <!-- Dropdown - Messages -->
							<div
								class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in"
								aria-labelledby="searchDropdown">
								<form class="form-inline mr-auto w-100 navbar-search">
									<div class="input-group">
										<input type="text"
											class="form-control bg-light border-0 small"
											placeholder="Search for..." aria-label="Search"
											aria-describedby="basic-addon2">
										<div class="input-group-append">
											<button class="btn btn-primary" type="button">
												<i class="fas fa-search fa-sm"></i>
											</button>
										</div>
									</div>
								</form>
							</div></li>
					</ul>

				</nav>
				<!-- End of Topbar -->



				<h1 id="centru" class="h3 mb-2 text-gray-800">Work Plan</h1>

				<div
					class="cd-schedule cd-schedule--loading margin-top-lg margin-bottom-lg js-cd-schedule">
					<div class="cd-schedule__timeline">
						<ul>
							
							<li><span>07:00</span></li>
							<li><span>08:00</span></li>
							<li><span>09:00</span></li>
							<li><span>09:30</span></li>
							<li><span>10:00</span></li>							
							<li><span>11:00</span></li>							
							<li><span>12:00</span></li>							
							<li><span>13:00</span></li>							
							<li><span>14:00</span></li>							
							<li><span>15:00</span></li>							
							<li><span>16:00</span></li>
							<li><span>17:00</span></li>
							<li><span>18:00</span></li>
							<li><span>19:00</span></li>
							<li><span>20:00</span></li>
							<li><span>21:00</span></li>
							<li><span>22:00</span></li>
							<li><span>23:00</span></li>
							<li><span>24:00</span></li>
							<li><span>00:00</span></li>
							<li><span>01:00</span></li>
							<li><span>02:00</span></li>
							<li><span>03:00</span></li>
							<li><span>04:00</span></li>
							<li><span>05:00</span></li>
							<li><span>06:00</span></li>
							

						</ul>
					</div>
					<!-- .cd-schedule__timeline -->

					<div class="cd-schedule__events">
						<ul>
							<li class="cd-schedule__group">
								<div class="cd-schedule__top-info">
									<span>Monday</span>
								</div>

								<ul>
									<li class="cd-schedule__event"><a data-start="07:00"
										data-end="15:00" data-content="event-abs-circuit"
										data-event="event-1" href="#0"> <em
											class="cd-schedule__name">Tura 1</em>
									</a></li>



									<li class="cd-schedule__event"><a data-start="15:00"
										data-end="23:00" data-content="event-yoga-1"
										data-event="event-2" href="#0"> <em
											class="cd-schedule__name">Tura 2</em>
									</a></li>
								</ul>
							</li>

							<li class="cd-schedule__group">
								<div class="cd-schedule__top-info">
									<span>Tuesday</span>
								</div>

								<ul>
									<li class="cd-schedule__event"><a data-start="07:00"
										data-end="15:00" data-content="event-abs-circuit"
										data-event="event-3" href="#0"> <em
											class="cd-schedule__name">Tura 1</em>
									</a></li>



									<li class="cd-schedule__event"><a data-start="15:00"
										data-end="23:00" data-content="event-yoga-1"
										data-event="event-4" href="#0"> <em
											class="cd-schedule__name">Tura 2</em>
									</a></li>
									
									
								</ul>
							</li>

							<li class="cd-schedule__group">
								<div class="cd-schedule__top-info">
									<span>Wednesday</span>
								</div>

								<ul>
									<li class="cd-schedule__event"><a data-start="07:00"
										data-end="15:00" data-content="event-abs-circuit"
										data-event="event-1" href="#0"> <em
											class="cd-schedule__name">Tura 1</em>
									</a></li>



									<li class="cd-schedule__event"><a data-start="15:00"
										data-end="23:00" data-content="event-yoga-1"
										data-event="event-2" href="#0"> <em
											class="cd-schedule__name">Tura 2</em>
									</a></li>
								</ul>
							</li>

							<li class="cd-schedule__group">
								<div class="cd-schedule__top-info">
									<span>Thursday</span>
								</div>

								<ul>
									<li class="cd-schedule__event"><a data-start="07:00"
										data-end="15:00" data-content="event-abs-circuit"
										data-event="event-3" href="#0"> <em
											class="cd-schedule__name">Tura 1</em>
									</a></li>



									<li class="cd-schedule__event"><a data-start="15:00"
										data-end="23:00" data-content="event-yoga-1"
										data-event="event-4" href="#0"> <em
											class="cd-schedule__name">Tura 2</em>
									</a></li>
								</ul>
							</li>

							<li class="cd-schedule__group">
								<div class="cd-schedule__top-info">
									<span>Friday</span>
								</div>

								<ul>
									<li class="cd-schedule__event"><a data-start="07:00"
										data-end="15:00" data-content="event-abs-circuit"
										data-event="event-1" href="#0"> <em
											class="cd-schedule__name">Tura 1</em>
									</a></li>



									<li class="cd-schedule__event"><a data-start="15:00"
										data-end="23:00" data-content="event-yoga-1"
										data-event="event-2" href="#0"> <em
											class="cd-schedule__name">Tura 2</em>
									</a></li>
								</ul>
					</div>

					<div class="cd-schedule-modal">
						<header class="cd-schedule-modal__header">
							<div class="cd-schedule-modal__content">
								<span class="cd-schedule-modal__date"></span>
								<h3 class="cd-schedule-modal__name"></h3>
							</div>

							<div class="cd-schedule-modal__header-bg"></div>
						</header>

						<div class="cd-schedule-modal__body">
							<div class="cd-schedule-modal__event-info"></div>
							<div class="cd-schedule-modal__body-bg"></div>
						</div>

						<a href="#0" class="cd-schedule-modal__close text-replace">Close</a>
					</div>

					<div class="cd-schedule__cover-layer"></div>
				</div>
				<!-- .cd-schedule -->











			</div>
			<!-- End of Content Wrapper -->

		</div>
		<!-- End of Page Wrapper -->

		<!-- Scroll to Top Button-->
		<a class="scroll-to-top rounded" href="#page-top"> <i
			class="fas fa-angle-up"></i>
		</a>

		<!-- Schedule  START-->








		<!-- Schedule END -->



		<!-- util functions included in the CodyHouse framework -->

		<script src="${pageContext.request.contextPath}/resources/js/util.js"></script>
		<!-- util functions included in the CodyHouse framework -->
		<script src="${pageContext.request.contextPath}/resources/js/main.js"></script>
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

		<!-- Page level plugins -->
		<script
			src="${pageContext.request.contextPath}/resources/vendor/datatables/jquery.dataTables.min.js"></script>
		<script
			src="${pageContext.request.contextPath}/resources/vendor/datatables/dataTables.bootstrap4.min.js"></script>

		<!-- Page level custom scripts -->
		<script
			src="${pageContext.request.contextPath}/resources/js/demo/datatables-demo.js"></script>
</body>

</html>