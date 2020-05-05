<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<style>
		* {
		  box-sizing: border-box;
		  
		}
		
		.column {
		  float: left;
		  width: 50%;
		  padding: 10px;
		  height: 300px;
		}
		
		.row:after {
		  content: "";
		  display: table;
		  clear: both;
		}
	</style>
<meta charset="ISO-8859-1">
<title>Shipping Data</title>
</head>
<body>
	<h2>Shipping Data</h2>
	<form action="">
		<fieldset>
		<legend>Shipping</legend>
			<div class="row">
			  <div class="column">
				Shipping Code : 
				<input type="text" name="">
				<br><br>
				Shipping Ref Num : 
				<input type="text" name="">
				<br><br>
				Courier Ref Num : 
				<input type="text" name="">
				<br><br>
				Contact Detail : 
				<textarea name=""></textarea>
				<br><br>
				Sale Order Code : 
				<input type="text" name="">
				<br><br>
				Description : 
				<textarea name=""></textarea>
				<br><br>
			  </div>
			  
			  <div class="column">
				Bill To Address
				<br>
				<textarea name=""></textarea>
				<br><br>
				Shipment To Address
				<br>
				<textarea name=""></textarea>
				<br><br><br><br>
				<input type="submit" value="CREATE SHIPMENT">
			  </div>
			</div>
		</fieldset>
	</form>
</body>
</html>