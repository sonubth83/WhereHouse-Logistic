<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sale Order Registration</title>
</head>
<body>
	<form action="">
		<fieldset>
			<legend>Sale Order</legend>
			Order Code : 
			<input type="text" name="">
			<br><br>
			Shipment Code : 
			<select name="">
				<option></option>
			</select>
			<br><br>
			Customer : 
			<select name="">
				<option></option>
			</select>
			<br><br>
			Ref Number : 
			<input type="text" name="">
			<br><br>
			Stock Mode : 
			<input type="text" name="">
			<br><br>
			Stock Mode : 
			<input type="radio" name="" value="GRADE">GRADE
			<input type="radio" name="" value="MARGIN">MARGIN
			<br><br>
			Stock Source : 
			<select name="">
				<option value="">--SELECT--</option>
				<option value="OPEN">OPEN</option>
				<option value="AVAIL">AVAIL</option>
				<option value="REFUND">REFUND</option>
			</select>
			<br><br>
			Default Status : 
			<input type="text" readonly="readonly">
			<br><br>
			Description : 
			<textarea name=""></textarea>
			<br><br>
			<input type="submit" value="CREATE SALE ORDER">
		</fieldset>
	</form>
</body>
</html>