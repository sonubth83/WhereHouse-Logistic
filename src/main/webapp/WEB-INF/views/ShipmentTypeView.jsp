<html>
<head>
<meta charset="ISO-8859-1">
<title>View Page</title>
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
				<H3>WELCOME TO SHIPMENT TYPE VIEW PAGE</H3>
			</div>

			<div class="card-body">
				<!-- <a href="excel">EXCEL</a> | <a href="pdf">PDF</a> -->

				<table border="1" class="table table-hover">
					<tr>
						<td class="text-center"><b>ID</b></td>
						<th class="text-center">${ob.shipId}</th>
					</tr>
					<tr>
						<td class="text-center"><b>MODE</b></td>
						<th class="text-center">${ob.shipMode}</th>
					</tr>
					<tr>
						<td class="text-center"><b>CODE</b></td>
						<th class="text-center">${ob.shipCode}</th>
					</tr>
					<tr>
						<td class="text-center"><b>ENABLE</b></td>
						<th class="text-center">${ob.enbShip}</th>
					</tr>
					<tr>
						<td class="text-center"><b>GRADE</b></td>
						<th class="text-center">${ob.shipGrad}</th>
					</tr>
					<tr>
						<td class="text-center"><b>NOTE</b></td>
						<th class="text-center">${ob.shipDesc}</th>
					</tr>
				</table>
			</div>
		</div>
	</div>
</body>
</html>