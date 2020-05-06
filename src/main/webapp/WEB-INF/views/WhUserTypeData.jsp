<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UOM Data View</title>
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
				<H3>WELCOME TO WHUSER TYPE DATA PAGE</H3>
			</div>
			<div class="card-body">
				<c:choose>
					<c:when test="${!empty list}">
						<table class="table table-hover">
							<tr class="bg-success text-white">
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
										<a href="edit?whid=${ob.whUserId}" class="btn btn-success">EDIT</a>
									</th>
									<th>
										<a href="view?whid=${ob.whUserId}" class="btn btn-info">VIEW</a>
									</th>
									<th>
										<a href="delete?whid=${ob.whUserId}" class="btn btn-danger">DELETE</a>
									</th>
								</tr>
							</c:forEach>
						</table>
					</c:when>
					<c:otherwise>
						NO DATA FOUND
					</c:otherwise>
				</c:choose>
			</div>
			<c:if test="${!empty message }">
				<c:choose>
					<c:when test="${opr eq 'DEL'}">
						<div class="card-footer bg-danger text-white text-center">
							<b>${message}</b>
						</div>
					</c:when>
					<c:otherwise>
						<div class="card-footer bg-danger text-white text-center">
							<b>${message}</b>
						</div>
					</c:otherwise>
				</c:choose>
			</c:if>
		</div>
		<!-- card end -->
	</div>
</body>
</html>