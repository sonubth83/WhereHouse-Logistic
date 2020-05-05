<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Method Edit Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

<style>
div {
	padding-bottom: 4px;
}
</style>
</head>
<%-- <body>
	<h3>Order Method Edit Page</h3>
	<form:form action="update" method="post" modelAttribute="orderMethod">
		Order Id : 
		<form:input path="orderId" readonly="readonly"/>
		<br><br>
		Order Mode : 
		<form:input path="orderMode" value="Sale" />Sale
		<form:input path="orderMode" value="Purchage" />Purchase
		<br> <br> 
		Order Code : 
		<form:input path="orderCode" />
		<br> <br> 
		Order Type : 
		<form:select path="orderType">
			<form:option value="">--SELECT--</form:option>
			<form:option value="FIFO">FIFO</form:option>
			<form:option value="LIFO">LIFO</form:option>
			<form:option value="FCFO">FCFO</form:option>
			<form:option value="FEFO">FEFO</form:option>
		</form:select> 
		<br> <br> 
		Order Accept : 
		<form:checkbox path="orderAccpt" value="Multi-Mode" />Multi-Mode
		<form:checkbox path="orderAccpt" value="Accept Return" />Accept Return 
		<br> <br> 
		Description :
		<form:textarea path="description"></form:textarea>
		<br> <br> 
		<input type="submit" value="UPDATE ORDER METHOD">
	</form:form>
	${message}
</body> --%>


<body>
	<div class="container">
		<div class="card">
			<div class="card-header bg-primary text-white text-center">
				<h3>ORDER METHOD EDIT PAGE</h3>
			</div>
			<div class="card-body">
				<form:form action="update" method="post"
					modelAttribute="orderMethod">
					<div class="row">
						<div class="col-1"></div>
						<div class="col-3">
							<label><b>ORDER ID</b></label>
						</div>
						<div class="col-4">
							<form:input path="orderId" class="form-control" readonly="true" />
						</div>
						<div class="col-4">
							<!-- FORM ERROR MESSAGE -->
						</div>
					</div>
					
					<div class="row">
						<div class="col-1"></div>
						<div class="col-3">
							<label for=""><b>ORDER MODE</b></label>
						</div>
						<div class="col-2">
							<form:radiobutton path="orderMode" value="SALE" class="radio" />
							SALE
						</div>
						<div class="col-2">
							<form:radiobutton path="orderMode" value="PURCHASE" class="radio" />
							PURCHASE
						</div>
						<div class="col-4">
							<!-- For Error Message -->
						</div>
					</div>

					<div class="row">
						<div class="col-1"></div>
						<div class="col-3">
							<label><b>ORDER CODE</b></label>
						</div>
						<div class="col-4">
							<form:input path="orderCode" class="form-control"
								placeholder="ORDER CODE" />
						</div>
						<div class="col-4">
							<!-- FORM ERROR MESSAGE -->
						</div>
					</div>

					<div class="row">
						<div class="col-1"></div>
						<div class="col-3">
							<label for=""><b>ORDER TYPE</b></label>
						</div>
						<div class="col-4">
							<form:select path="orderType" class="form-control">
								<form:option value="">-SELECT-</form:option>
								<form:option value="FIFO">FIFO</form:option>
								<form:option value="LIFO">LIFO</form:option>
								<form:option value="FCFO">FCFO</form:option>
								<form:option value="FEFO">FEFO</form:option>
							</form:select>
						</div>
						<div class="col-4">
							<!-- FORM ERROR MESSAGE -->
						</div>
					</div>

					<div class="row">
						<div class="col-1"></div>
						<div class="col-3">
							<label><b>ORDER ACCEPT</b></label>
						</div>
						<div class="col-2">
							<form:checkbox path="orderAccpt" value="Multiple Mode" />
							Multiple Mode
						</div>
						<div class="col-2">
							<form:checkbox path="orderAccpt" value="Accept Return" />
							Accept Return
						</div>
						<div class="col-4">
							<!-- FORM ERROR MESSAGE -->
						</div>
					</div>

					<div class="row">
						<div class="col-1"></div>
						<div class="col-3">
							<label><b>DESCRIPTION</b></label>
						</div>
						<div class="col-4">
							<form:textarea path="description" class="form-control"
								placeholder="WRITE HERE DESCRIPTION"></form:textarea>
						</div>
						<div class="col-4">
							<!-- FORM ERROR MESSAGE -->
						</div>
					</div>

					<div class="row text-center">
						<div class="col-4"></div>
						<div class="col-2">
							<input type="submit" value="UPDATE ORDER METHOD"
								class="btn btn-success">
						</div>
						<div class="col-2">
							<input type="reset" value="RESET" class="btn btn-danger">
						</div>
						<div class="col-4"></div>
					</div>
				</form:form>
			</div>
			<div class="card-footer bg-info text-white text-center">
				${message}</div>
		</div>
	</div>
</body>
</html>