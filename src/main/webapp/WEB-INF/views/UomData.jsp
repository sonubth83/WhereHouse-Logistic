<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UOM Data View</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="card">
			<div class="card-header bg-primary text-white text-center">
				<H3>WELCOME TO UOM DATA PAGE</H3>
			</div>
			<div class="card-body">
				<c:choose>
					<c:when test="${!empty list}">
						<table class="table table-hover">
							<tr class="bg-success text-white">
								<td>ID</td>
								<td>TYPE</td>
								<td>MODEL</td>
								<td>DESCRIPTION</td>
								<td colspan="3">OPERATION</td>
							</tr>
							<c:forEach items="${list}" var="ob">
								<tr>
									<th>${ob.uomId}</th>
									<th>${ob.uomType}</th>
									<th>${ob.uomModel}</th>
									<th>${ob.description}</th>
									<th>
										<a href="edit?ummid=${ob.uomId}" class="btn btn-success">EDIT</a>
									</th>
									<th>
										<a href="view?ummid=${ob.uomId}" class="btn btn-info">VIEW</a>
									</th>
									<th>
										<a href="delete?ummid=${ob.uomId}" class="btn btn-danger">DELETE</a>
									</th>
									<th>
								</tr>
							</c:forEach>
						</table>
					</c:when>
					<c:otherwise>
						NO DATA FOUND
					</c:otherwise>
				</c:choose>
			</div>
		</div> <!-- card end -->
	</div>
</body>
</html>