<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Method Register</title>

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
				<h3>Welcome to UOM Page</h3>
			</div>
			<div class="card-body">
				<form action="insert" method="post">
					<div class="row">
						<div class="col-1"></div>
						<div class="col-3">
							<label><b>ORDER MODE</b></label>
						</div>
						<div class="col-2">
							<input type="radio" name="orderMode" value="SALE" class="radio">SALE
						</div>
						<div class="col-2">
							<input type="radio" name="orderMode" value="PURCHASE" class="radio">PURCHASE
						</div>
						<div class="col-4">
							<!-- FORM ERROR MESSAGE -->
						</div>
					</div>

					<div class="row">
						<div class="col-1"></div>
						<div class="col-3">
							<label><b>ORDER CODE</b></label>
						</div>
						<div class="col-4">
							<input type="text" name="orderCode" class="form-control"
								placeholder="ORDER CODE">
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
							<select name="orderType" class="form-control">
								<option value="">-SELECT-</option>
								<option value="FIFO">FIFO</option>
								<option value="LIFO">LIFO</option>
								<option value="FCFO">FCFO</option>
								<option value="FEFO">FEFO</option>
							</select>
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
							<input type="checkbox" name="orderAccpt" value="Multiple Mode">Multiple Mode 
						</div>
						<div class="col-2">
							<input type="checkbox" name="orderAccpt" value="Accept Return">Accept Return
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
							<textarea name="description" class="form-control"
								placeholder="WRITE HERE DESCRIPTION"></textarea>
						</div>
						<div class="col-4">
							<!-- FORM ERROR MESSAGE -->
						</div>
					</div>

					<div class="row text-center">
						<div class="col-4"></div>
						<div class="col-2">
							<input type="submit" value="CREATE ORDER METHOD"
								class="btn btn-success">
						</div>
						<div class="col-2">
							<input type="reset" value="RESET" class="btn btn-danger">
						</div>
						<div class="col-4"></div>
					</div>
				</form>
			</div>
			<div class="card-footer bg-info text-white text-center">
				${message}
			</div>
		</div>
	</div>
</body>
</html>