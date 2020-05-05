<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Uom Edit Page</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
		<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
		
		<style>
			div  {
			  padding-bottom: 4px;
			}
		</style>

	</head>
	
	<body>
		<div class="container">
			<div class="card">
				<div class="card-header bg-primary text-white text-center">
					<h3>UOM File</h3>
				</div>
				<div class="card-body">
					<form:form action="save" method="post" modelAttribute="uom" >
						<div class="row">
							<div class="col-1"></div>
							<div class="col-3">
								<label for="uomId"><b>UOM ID</b></label>
							</div>
							<div class="col-4">
								<form:input path="uomId" class="form-control" readonly="true" />
							</div>
							<div class="col-4">
								<!-- FORM ERROR MESSAGE -->
							</div>
						</div>
						
						<div class="row">
							<div class="col-1"></div>
							<div class="col-3">
								<label for="uomType"><b>UOM TYPE</b></label>
							</div>
							<div class="col-4">
								<form:select path="uomType" class="form-control">
									<form:option value="">-SELECT-</form:option>
									<form:option value="PACKING">PACKING</form:option>
									<form:option value="NO PACKING">NO PACKING</form:option>
									<form:option value="NA">-NA-</form:option>
								</form:select>
							</div>
							<div class="col-4">
								<!-- FORM ERROR MESSAGE -->
							</div>
						</div>
						
						<div class="row">
							<div class="col-1"></div>
							<div class="col-3">
								<label for="uomModel"><b>UOM MODEL</b></label>
							</div>
							<div class="col-4">
								<form:input path="uomModel" class="form-control" placeholder="UOM MODEL" />
							</div>
							<div class="col-4">
								<!-- FORM ERROR MESSAGE -->
							</div>
						</div>
						
						<div class="row">
							<div class="col-1"></div>
							<div class="col-3">
								<label for="description"><b>DESCRIPTION</b></label>
							</div>
							<div class="col-4">
								<form:textarea path="description" class="form-control" placeholder="WRITE HERE DESCRIPTION"></form:textarea>
							</div>
							<div class="col-4">
								<!-- FORM ERROR MESSAGE -->
							</div>
						</div>
						
						<div class="row text-center">
							<div class="col-5"></div>
							<div class="col-2">
								<input type="submit" value="CREATE UOM" class="btn btn-success" >
							</div>
							<div class="col-5">
							</div>
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
