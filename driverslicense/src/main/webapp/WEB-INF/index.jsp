<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Driver's License</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		
</head>
<body>
	<div class="container">
		<h1>Licenses</h1>
		<a href="/persons/new">Add Person</a> | <a href="/licenses/new">Add License</a>
		<table class="table table-striped table-hover table-bordered">
		<thead>
			<tr>
				<th>Name</th>
				<th>ID</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${persons}" var="person">
    			<tr>    
   				<td><a href="/persons/${person.id}"><c:out value="${person.firstName} ${person.lastName}"/></a></td>
    				<td><c:out value="${person.id}"/></td>
    			</tr>
			</c:forEach>
		</tbody>
		</table>
		<% if(request.getAttribute("errors") != null){ %>
		<fieldset>
		<legend>Errors</legend>
		<c:forEach items="${errors}" var="error">
			<p><c:out value="${error.getDefaultMessage()}"/></p>
		</c:forEach>
		</fieldset>
		<% } %>
	</div>
</body>
</html>