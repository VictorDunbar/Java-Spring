<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Driver's License</title>
<head>
		<title>Licenses</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	</head>
	<body>
	<div class="container">
		<h1>New License</h1>
		<form:form action="/licenses/new" method="POST" modelAttribute="license">
			<form:label path="person">Person:
				<form:select path="person">
					<c:forEach items="${persons}" var="person">
        					<form:option value="${person.id}"><c:out value="${person.firstName} ${person.lastName}"/></form:option>
   					</c:forEach>
				</form:select>
			</form:label>
			<form:label path="state">State: 
				<form:input type="text" path="state"/>
			</form:label>
			
			<form:label path="expiration_date">Expiration Date: 
				<form:errors path="expiration_date"/>
				<form:input type="Date" path="expiration_date"/>
				
			</form:label>
			<input type="submit" value="Create">
		</form:form><br><br>
		<a href="/">Home</a>
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