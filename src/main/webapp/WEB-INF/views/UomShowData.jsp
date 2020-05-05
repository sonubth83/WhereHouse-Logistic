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
			<td>TYPE</td> <th>${ob.uomType}</th>
		</tr>
		<tr>
			<td>MODEL</td> <th>${ob.uomModel}</th>
		</tr>
		<tr>
			<td>DESCRIPTION</td> <th>${ob.description}</th>
		</tr>
	</table>
</body>
</html>