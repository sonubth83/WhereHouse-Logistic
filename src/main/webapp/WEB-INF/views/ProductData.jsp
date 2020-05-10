<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%-- <%@ page import="sun.misc.BASE64Encoder" %> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Data View</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<c:set value="${userList}" var="userPageList" />
	<div class="container">
		<div class="card">
			<div class="card-header bg-primary text-white text-center">
				<H3>WELCOME TO PRODUCT DATA PAGE</H3>
			</div>
			<%-- <%
			BASE64Encode base64Encoder = new BASE64Encoder();
			StringBuilder imageString = new StringBuilder();
			imageString.append("data:image/png;base64,");
			imageString.append(base64Encoder.encode(data));
			String image = imageString.toString(); 
			%> --%>
			<div class="card-body">
				<c:choose>
					<c:when test="${!empty userPageList}">
						<table class="table table-hover">
							<tr class="bg-success text-white">
								<td>ID</td>
								<td>NAME</td>
								<td>CATEGORY</td>
								<td>COLOR</td>
								<td>PRICE</td>
								<td>OPERATION</td>
							</tr>
							<c:forEach items="${userPageList.pageList}" var="ob">
								<tr>
									<th>${ob.productId}</th>
									<th>${ob.prdName}</th>
									<th>${ob.categoryData.categoryName}</th>
									<th>${ob.color}</th>
									<th>${ob.price}</th>
									<th><a href="delete?prdId=${ob.productId}"
										class="btn btn-danger">DELETE</a></th>
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

			<c:choose>
				<c:when test="${userPageList.firstPage}">
					<span>Prev</span>
				</c:when>
				<c:otherwise>
					<c:url value="/product/all/prev" var="url" />
					<a href='<c:out value="${url}" />'>Prev</a>
				</c:otherwise>
			</c:choose>

			<c:forEach begin="1" end="${userPageList.pageCount}" step="1"
				varStatus="tagStatus">
				<c:choose>
					<c:when test="${(userPageList.page + 1) == tagStatus.index}">
						<span>${tagStatus.index}</span>
					</c:when>
					<c:otherwise>
						<c:url value="/product/all/${tagStatus.index}" var="url" />
						<a href='<c:out value="${url}" />'>${tagStatus.index}</a>
					</c:otherwise>
				</c:choose>
			</c:forEach>

			<c:choose>
				<c:when test="${userPageList.lastPage}">
					<span>Next</span>
				</c:when>
				<c:otherwise>
					<c:url value="/product/all/next" var="url" />
					<a href='<c:out value="${url}" />'>Next</a>
				</c:otherwise>
			</c:choose>

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