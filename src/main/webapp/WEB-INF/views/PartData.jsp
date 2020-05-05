<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Part Data</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container">

		<div class="card">
			<div class="card-header bg-primary text-white text-center">
				<H3>WELCOME TO PART DATA PAGE</H3>

			</div>
			<div class="card-body">
				<table class="table table-hover">
					<tr class="bg-success text-white">
						<th>MODE</th>
						<th>CODE</th>
						<th>ENABLE</th>
						<th>GRADE</th>
						<th>NOTE</th>
						<th colspan="3">OPERATIONS</th>
					</tr>
					<tr>

						<td>${ob.shipMode}</td>
						<td>${ob.shipCode}</td>
						<td>${ob.enbShip}</td>
						<td>${ob.shipGrad}</td>
						<td>${ob.shipDesc}</td>
						<td><a href="delete?sid=${ob.shipId}" class="btn btn-danger">
								DELETE </a></td>
						<td><a href="edit?sid=${ob.shipId}" class="btn btn-info">
								EDIT </a></td>
						<td><a href="view?sid=${ob.shipId}" class="btn btn-warning">
								VIEW </a></td>
					</tr>
				</table>
			</div>


		</div>
		<!-- card end -->


	</div>
	<!-- container end -->
</body>
</html>
