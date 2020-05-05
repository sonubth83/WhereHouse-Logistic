<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

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
				<h3>Welcome to Part Page</h3>
			</div>
			<div class="card-body">
				<form:form action="save" method="post" modelAttribute="partType">
					<div class="row">
						<div class="col-1"></div>
						<div class="col-3">
							<label for="partCode"><b>CODE</b></label>
						</div>
						<div class="col-4">
							<form:input path="partCode" class="form-control" placeholder="CODE" />
						</div>
						<div class="col-4">
							<!-- FORM ERROR MESSAGE -->
						</div>
					</div>

					<div class="row">
						<div class="col-1"></div>
						<div class="col-3">
							<label for=""><b>DIMENSIONS</b></label>
						</div>
						<div class="col-1">
							<label for="dimWidth"><b>W</b></label>
						</div>
						<div class="col-1">
							<form:input path="dimWidth" class="form-control" />
						</div>
						<div class="col-1">
							<label for="dimLenth"><b>L</b></label>
						</div>
						<div class="col-1">
							<form:input path="dimLenth" class="form-control" />
						</div>
						<div class="col-1">
							<label for="dimHeight"><b>H</b></label>
						</div>
						<div class="col-1">
							<form:input path="dimHeight" class="form-control" />
						</div>
					</div>

					<div class="row">
						<div class="col-1"></div>
						<div class="col-3">
							<label for="baseCost"><b>BASE COST</b></label>
						</div>
						<div class="col-4">
							<form:input path="baseCost" class="form-control" placeholder="BASE COST" />
						</div>
						<div class="col-4">
							<!-- FORM ERROR MESSAGE -->
						</div>
					</div>

					<div class="row">
						<div class="col-1"></div>
						<div class="col-3">
							<label for="baseCurrency"><b>BASE CURRENCY</b></label>
						</div>
						<div class="col-4">
							<form:select path="baseCurrency" class="form-control">
								<form:option value="">-SELECT-</form:option>
								<form:option value="INR">INR</form:option>
								<form:option value="USD">USD</form:option>
								<form:option value="AUS">AUS</form:option>
								<form:option value="EUR">EUR</form:option>
							</form:select>
						</div>
						<div class="col-4">
							<!-- FORM ERROR MESSAGE -->
						</div>
					</div>

					<%-- <div class="row">
						<div class="col-1"></div>
						<div class="col-3">
							<label><b>UOM</b></label>
						</div>
						<div class="col-4">
							<form:select path="uomOb.uomId" class="form-control">
								<form:option value="">-SELECT-</form:option>
								<form:options items="${uomMap}" />
							</form:select>
						</div>
						<div class="col-4">
							<!-- FORM ERROR MESSAGE -->
						</div>
					</div> --%>

					
					<%-- <div class="row">
						<div class="col-1"></div>
						<div class="col-3"></div>
						<div class="col-4">
							<form:input path="" class="form-control" placeholder="SALE" />
						</div>
						<div class="col-4">
							<!-- FORM ERROR MESSAGE -->
						</div>
					</div> --%>

					<%-- <div class="row">
						<div class="col-1"></div>
						<div class="col-3"></div>
						<div class="col-4">
							<form:input path="" class="form-control" placeholder="PURCHAGE" />
						</div>
						<div class="col-4">
							<!-- FORM ERROR MESSAGE -->
						</div>
					</div> --%>

					<div class="row">
						<div class="col-1"></div>
						<div class="col-3">
							<label for="descr"><b>DESCRIPTION</b></label>
						</div>
						<div class="col-4">
							<textarea name="descr" class="form-control"
								placeholder="write here description..."></textarea>
						</div>
						<div class="col-4">
							<!-- FORM ERROR MESSAGE -->
						</div>
					</div>

					<div class="row text-center">
						<div class="col-5"></div>
						<div class="col-2">
							<input type="submit" value="CREATE PART" class="btn btn-success">
						</div>
						<div class="col-5"></div>
					</div>

				</form:form>
			</div>
			<div class="card-footer">
				${message}
			</div>
		</div>
	</div>
</body>
</html>