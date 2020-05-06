<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UOM DATA BASED ON ID</title>
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
				<H3>WHUSER DATA WITH ID</H3>
			</div>
			<div class="card-body">
				<!-- <a href="excel">EXCEL</a> | <a href="pdf">PDF</a> -->
				<table border="1" class="table table-hover">
					<tr>
						<td class="text-center"><b>ID</b></td>
						<th class="text-center">${ob.whUserId}</th>
					</tr>
					<tr>
						<td class="text-center"><b>TYPE</b></td>
						<th class="text-center">${ob.userType}</th>
					</tr>
					<tr>
						<td class="text-center"><b>CODE</b></td>
						<th class="text-center">${ob.userCode}</th>
					</tr>
					<tr>
						<td class="text-center"><b>EMAIL</b></td>
						<th class="text-center">${ob.userEmail}</th>
					</tr>
					<tr>
						<td class="text-center"><b>CONTACT</b></td>
						<th class="text-center">${ob.userContact}</th>
					</tr>
					<tr>
						<td class="text-center"><b>ID TYPE</b></td>
						<th class="text-center">${ob.userIdType}</th>
					</tr>
					<tr>
						<td class="text-center"><b>ID NUMBER</b></td>
						<th class="text-center">${ob.idNumber}</th>
					</tr>
				</table>
			</div>
		</div>
	</div>
</body>
</html>