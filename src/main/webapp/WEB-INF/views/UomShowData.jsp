<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UOM Data Based on Id</title>
</head>
<body>
	<h2>View Page</h2>
	<table border="1">
		<tr>
			<td>ID</td> <th>${ob.uomId}</th>
		</tr>
		<tr>
			<td>TYPE</td> <th>${view.uomType}</th>
		</tr>
		<tr>
			<td>MODEL</td> <th>${view.uomModel}</th>
		</tr>
		<tr>
			<td>DESCRIPTION</td> <th>${view.description}</th>
		</tr>
	</table>
</body>
</html>