<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Method View Page</title>
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
				<H3>PURCHASE ORDER METHOD VIEW PAGE</H3>
			</div>

			<div class="card-body">
				<!-- <a href="excel">EXCEL</a> | <a href="pdf">PDF</a> -->

				<table border="1" class="table table-hover">
					<tr>
						<td class="text-center"><b>ID</b></td>
						<th class="text-center">${order.purchId}</th>
					</tr>
					<tr>
						<td class="text-center"><b>ORDER CODE</b></td>
						<th class="text-center">${order.purchOrdCode}</th>
					</tr>
					<tr>
						<td class="text-center"><b>SHIPMENT</b></td>
						<th class="text-center">${order.shipType.shipCode}</th>
					</tr>
					<tr>
						<td class="text-center"><b>VENDOR</b></td>
						<th class="text-center">${order.whUserVendor.userType}</th>
					</tr>
					<tr>
						<td class="text-center"><b>REFERENCE NUMBER</b></td>
						<th class="text-center">${order.refNum}</th>
					</tr>
					<tr>
						<td class="text-center"><b>QUALITY</b></td>
						<th class="text-center">${order.qualCheck}</th>
					</tr>
					<tr>
						<td class="text-center"><b>STATUS</b></td>
						<th class="text-center">${order.defStatus}</th>
					</tr>
					<tr>
						<td class="text-center"><b>DESCRIPTION</b></td>
						<th class="text-center">${order.descr}</th>
					</tr>
				</table>
			</div>
		</div>
	</div>
</body>
</html>