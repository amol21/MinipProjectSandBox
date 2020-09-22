<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CONTACT FORM</title>
</head>
<body>
	<h2>CONTACT FORM</h2>
	<bold><p><font color='green'>${succmsg}</font></p></bold>
	<bold><p><font color='red'>${errmsg}</font></p></bold>
	<form:form action="saveContact" modelAttribute="contact" method="POST">
		<table>
			<tr>
				<td>ContactName</td>
				<td><form:input path="contactName"/></td>
			</tr>
			<tr>
				<td>ContactEmail</td>
				<td><form:input path="contactEmail"></form:input></td>
			</tr>
			<tr>
				<td>Conatct Number</td>
				<td><form:input path="contactNumber"/></td>
			</tr>
			<tr>
				<td><input type="reset" value="RESET"/></td>
				<td><input type="submit" value="SaveContact"/></td>
			</tr>
			
		</table>
	</form:form>
</body>
</html>