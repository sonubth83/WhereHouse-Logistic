<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Method Data</title>
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
				<H3>WELCOME TO ORDER METHOD DATA PAGE</H3>

			</div>
			<div class="card-body">
				<a href="excel">EXCEL</a> | <a href="pdf">PDF</a>
				<c:choose>
					<c:when test="${!empty list}">
						<table border="1" class="table table-hover">
							<tr class="bg-success text-white">
								<th>ID</th>
								<th>MODE</th>
								<th>CODE</th>
								<th>TYPE</th>
								<th>ACCEPT</th>
								<th>DESCRIPTION</th>
								<th colspan="3">OPERATION</th>
							</tr>
							<c:forEach items="${list}" var="ob">
								<tr>
									<th>${ob.orderId}</th>
									<th>${ob.orderMode}</th>
									<th>${ob.orderCode}</th>
									<th>${ob.orderType}</th>
									<th>${ob.orderAccpt}</th>
									<th>${ob.description}</th>
									<td>
										<a href="edit?oid=${ob.orderId}" class="btn btn-info">EDIT</a>
									</td>
									<td>
										<a href="view?oid=${ob.orderId}" class="btn btn-warning"> VIEW </a>
									</td>
									<td>
										<a href="delete?oid=${ob.orderId}" class="btn btn-danger"> DELETE </a>
									</td>
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
	</div>
</body>
</html>