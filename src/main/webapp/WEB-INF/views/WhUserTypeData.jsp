<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WH User Data</title>
</head>
<body>
	<h2>All WHUSER DATA</h2>
	<c:choose>
		<c:when test="${!empty list}">
			<table border="1">
				<tr>
				<td>ID</td>
				<td>TYPE</td>
				<td>CODE</td>
				<td>EMAIL</td>
				<td>CONTACT</td>
				<td>ID TYPE</td>
				<td>ID NUMBER</td>
				<td colspan="3">OPERATION</td>
				</tr>
				<c:forEach items="${list}" var="ob">
					<tr>
						<th>${ob.whUserId}</th>
						<th>${ob.userType}</th>
						<th>${ob.userCode}</th>
						<th>${ob.userEmail}</th>
						<th>${ob.userContact}</th>
						<th>${ob.userIdType}</th>
						<th>${ob.idNumber}</th>
						<th>
							<a href="view?whid=${ob.whUserId}">VIEW</a>
						</th>
						<th>
							<a href="edit?whid=${ob.whUserId}">EDIT</a>
						</th>
						<th>
							<a href="delete?whid=${ob.whUserId}">DELETE</a>
						</th>
					</tr>
				</c:forEach>
			</table>
		</c:when>
		<c:otherwise>
			NO DATA FOUND
		</c:otherwise>
	</c:choose>
	${message}
</body>
</html>