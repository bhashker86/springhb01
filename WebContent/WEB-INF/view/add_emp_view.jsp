<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${page_title}</title>
</head>
<body>
	<h3>${page_header}</h3>
	<p>
		<strong>${form_info}</strong>
	</p>


	<form:form method="post" action="add_employee_submit">
	<table >
	<tbody>
	<tr>
		<td> <label for="first_name">First Name:</label></td>
		<td> <form:input path="first_name" /></td>
	</tr>
	
	<tr>
		<td> <label for="last_name">Last Name:</label></td>
		<td> <form:input path="last_name" /></td>
	</tr>
	
	<tr>
		<td> <label for="email">Email:</label></td>
		<td> <form:input path="email" /></td>
	</tr>
	
	<tr>
		<td> <label for="demp">Department:</label></td>
		<td> <form:input path="demp" /></td>
	</tr>
	
	<tr>
		<td colspan="2"> <input type="submit" value="Add"    /></td>
		
	</tr>
	
	
	
	
	</tbody>
	
	</table>
	

	</form:form>
	
</body>
</html>