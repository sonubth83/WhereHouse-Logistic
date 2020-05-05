<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

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

#radio {
	margin-left: 5px;
}
</style>
<title>Purchase Order Registration</title>
</head>
<body>
	<div class="container">
		<div class="card">
			<div class="card-header bg-primary text-white text-center">
				<h3>Welcome to Purchase Order</h3>
			</div>
			<div class="card-body">
				<form:form action="save" method="post"
					modelAttribute="purchaseOrder">
					<div class="row">
						<div class="col-1"></div>
						<div class="col-3">
							<label for="purchOrdCode"><b>PURCHASE ORDER CODE</b></label>
						</div>
						<div class="col-4">
							<form:input path="purchOrdCode" class="form-control" placeholder="ORDER CODE" />
						</div>
						<div class="col-4">
							<!-- FORM ERROR MESSAGE -->
						</div>
					</div>

					<div class="row">
						<div class="col-1"></div>
						<div class="col-3">
							<label for="shipType.shipId"><b>SHIPMENT CODE</b></label>
						</div>
						<div class="col-4">
							<form:select path="shipType.shipId" class="form-control">
								<form:option value="">-SELECT-</form:option>
								<form:options items="${shipMap}" />
							</form:select>
						</div>
						<div class="col-4">
							<!-- FORM ERROR MESSAGE -->
						</div>
					</div>

					<div class="row">
						<div class="col-1"></div>
						<div class="col-3">
							<label for="whUserVendor.whUserId"><b>VENDOR</b></label>
						</div>
						<div class="col-4">
							<form:select path="whUserVendor.whUserId" class="form-control">
								<option value="">-SELECT-</option>
								<form:options items="${whUserMap}"/>
							</form:select>
						</div>
						<div class="col-4">
							<!-- FORM ERROR MESSAGE -->
						</div>
					</div>

					<div class="row">
						<div class="col-1"></div>
						<div class="col-3">
							<label for="refNum"><b>REFERENCE NUMBER</b></label>
						</div>
						<div class="col-4">
							<form:input path="refNum" class="form-control"
								placeholder="REFERENCE NUMBER" />
						</div>
						<div class="col-4">
							<!-- FORM ERROR MESSAGE -->
						</div>
					</div>

					<div class="row">
						<div class="col-1"></div>
						<div class="col-3">
							<label for="qualCheck"><b>QUALITY CHECK</b></label>
						</div>
						<div class="col-2">
							<form:radiobutton path="qualCheck" value="REQUIRED" />REQUIRED
						</div>
						<div class="col-2">
							<form:radiobutton path="qualCheck" value="NOT REQUIRED" />NOT REQUIRED
						</div>
						<div class="col-4">
							<!-- FORM ERROR MESSAGE -->
						</div>
					</div>

					<div class="row">
						<div class="col-1"></div>
						<div class="col-3">
							<label for="defStatus"><b>DEFAULT STATUS</b></label>
						</div>
						<div class="col-4">
							<form:input path="defStatus" class="form-control" value="OPEN"
								readonly="readonly" />
						</div>
						<div class="col-4">
							<!-- FORM ERROR MESSAGE -->
						</div>
					</div>

					<div class="row">
						<div class="col-1"></div>
						<div class="col-3">
							<label for="descr"><b>DESCRIPTION</b></label>
						</div>
						<div class="col-4">
							<form:textarea path="descr" class="form-control"
								placeholder="WRITE HERE DESCRIPTION"></form:textarea>
						</div>
						<div class="col-4">
							<!-- FORM ERROR MESSAGE -->
						</div>
					</div>

					<div class="row text-center">
						<div class="col-5"></div>
						<div class="col-2">
							<input type="submit" value="PURCHASE ORDER"
								class="btn btn-success">
						</div>
						<div class="col-5"></div>
					</div>

				</form:form>
			</div>
			<div class="card-footer bg-info text-white text-center">
				${message}
			</div>
		</div>
	</div>
</body>
</html>