<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WhUserViewData</title>
</head>
<body>
	<h2>WhUserViewData</h2>
	<table border="1">
		<tr>
			<td>ID</td>
			<th>${ob.whUserId}</th>
		</tr>
		<tr>
			<td>TYPE</td>
			<th>${ob.userType}</th>
		</tr>
		<tr>
			<td>CODE</td>
			<th>${ob.userCode}</th>
		</tr>
		<tr>
			<td>EMAIL</td>
			<th>${ob.userEmail}</th>
		</tr>
		<tr>
			<td>CONTACT</td>
			<th>${ob.userContact}</th>
		</tr>
		<tr>
			<td>ID TYPE</td>
			<th>${ob.userIdType}</th>
		</tr>
		<tr>
			<td>ID NUMBER</td>
			<th>${ob.idNumber}</th>
		</tr>
	</table>
</body>
</html>