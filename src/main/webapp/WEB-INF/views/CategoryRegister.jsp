<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Category Register</title>

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
				<h3>WELCOME TO CATEGORY PAGE</h3>
			</div>
			<div class="card-body">
				<form action="insert" method="post">
					
					<div class="row">
						<div class="col-1"></div>
						<div class="col-3">
							<label><b>CATEGORY NAME</b></label>
						</div>
						<div class="col-4">
							<input type="text" name="categoryName" class="form-control"
								placeholder="CATEGORY">
						</div>
						<div class="col-4">
							<!-- FORM ERROR MESSAGE -->
						</div>
					</div>

					<div class="row text-center">
						<div class="col-4"></div>
						<div class="col-4">
							<input type="submit" value="CREATE CATEGORY"
								class="btn btn-success">
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