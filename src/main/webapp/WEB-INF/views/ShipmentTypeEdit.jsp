<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shipment Edit Page</title>
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
<body>
	<div class="container">
		<div class="card">
			<div class="card-header bg-primary text-white text-center">
				<h3>Welcome to Shipment Type Register Page</h3>
			</div>
			<div class="card-body">
				<form:form action="update" method="post"
					modelAttribute="shipmentType">

					<div class="row">
						<div class="col-1"></div>
						<div class="col-3">
							<label for="shipMode"><b>SHIPMENT MODE</b></label>
						</div>
						<div class="col-4">
							<form:input path="shipId" readonly="true" class="form-control" />
						</div>
						<div class="col-4">
							<!-- for Error -->
						</div>
					</div>

					<div class="row">
						<div class="col-1"></div>
						<div class="col-3">
							<label for="shipMode"><b>SHIPMENT MODE</b></label>
						</div>
						<div class="col-4">
							<form:select path="shipMode" class="form-control">
								<form:option value="">-SELECT-</form:option>
								<form:option value="Air">Air</form:option>
								<form:option value="Truck">Truck</form:option>
								<form:option value="Ship">Ship</form:option>
								<form:option value="Train">Train</form:option>
							</form:select>
						</div>
						<div class="col-4">
							<!-- for Error -->
						</div>
					</div>

					<div class="row">
						<div class="col-1"></div>
						<div class="col-3">
							<label for="shipCode"><b>SHIPMENT CODE</b></label>
						</div>
						<div class="col-4">
							<form:input path="shipCode" class="form-control"
								placeholder="SHIPMENT CODE" />
						</div>
						<div class="col-4">
							<!-- Error Messsage -->
						</div>
					</div>

					<div class="row">
						<div class="col-1"></div>
						<div class="col-3">
							<label for="enbShip"><b>ENABLE SHIPMENT</b></label>
						</div>
						<div class="col-4">
							<form:select path="enbShip" class="form-control">
								<form:option value="">-SELECT-</form:option>
								<form:option value="YES">YES</form:option>
								<form:option value="NO">NO</form:option>
							</form:select>
						</div>
						<div class="col-4">
							<!-- Error Messsage -->
						</div>
					</div>
					<div class="row">
						<div class="col-1"></div>
						<div class="col-3">
							<label for="shipGrad"><b>SHIPMENT GRADE</b></label>
						</div>
						<div class="col-1">
							<form:radiobutton path="shipGrad" value="A" />
							A
						</div>
						<div class="col-1">
							<form:radiobutton path="shipGrad" value="B" />
							B
						</div>
						<div class="col-1">
							<form:radiobutton path="shipGrad" value="C" />
							C
						</div>
						<div class="col-4">
							<!-- Error Messsage -->
						</div>
					</div>

					<div class="row">
						<div class="col-1"></div>
						<div class="col-3">
							<label for=""><b>SHIPMENT DISCRIPTION</b></label>
						</div>
						<div class="col-4">
							<form:textarea path="shipDesc" class="form-control"
								placeholder="DISCRIPTION......."></form:textarea>
						</div>
						<div class="col-4">
							<!-- Error Messsage -->
						</div>
					</div>

					<div class="row text-center">
						<div class="col-4"></div>
						<div class="col-4">
							<input type="submit" value="CREATE SHIPMENT"
								class="btn btn-success btn.focus">
						</div>
						<div class="col-4"></div>
					</div>
				</form:form>
				<div class="card-footer bg-info text-white text-center">
					<b>${message}</b>
				</div>
			</div>
		</div>
	</div>
</body>
</html>