<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WHUser Type</title>
</head>
<body>
	<form:form action="save" modelAttribute="whUserType">
		<fieldset>
			<legend>WHUser Type</legend>
			User Type : 
			<form:radiobutton path="userType" value="Vendor" />Vendor
			<form:radiobutton path="userType" value="Customer" />Customer
			<br><br>
			User Code : 
			<form:input path="userCode" />
			<br><br>
			<%-- User for : 
			<form:input path="" readonly="true"/>
			<br><br> --%>
			User Email : 
			<form:input path="userEmail" />
			<br><br>
			User Contact : 
			<form:textarea path="userContact"></form:textarea>
			<br><br>
			User ID Type : 
			<form:select path="userIdType">
				<form:option value="">--SELECT--</form:option>
				<form:option value="PANCARD">PANCARD</form:option>
				<form:option value="AADHAR">AADHAR</form:option>
				<form:option value="VOTERID">VOTERID</form:option>
				<form:option value="OTHER">OTHER</form:option>
			</form:select>
			<%-- <br>
			<form:input path="userIdType" /> --%>
			<br><br>
			Id Number : 
			<form:input path="idNumber" />
			<br><br>
			<input type="submit" value="CREATE USER">
		</fieldset>
	</form:form>
	${message}
</body>
</html>